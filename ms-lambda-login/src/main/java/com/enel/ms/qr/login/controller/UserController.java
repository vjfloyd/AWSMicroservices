package com.enel.ms.qr.login.controller;
import java.io.UnsupportedEncodingException;

import javax.validation.Valid;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.enel.ms.qr.login.MsEnelLoginApplication;
import com.enel.ms.qr.login.domain.User;
import com.enel.ms.qr.login.http.BodyResponse;
import com.enel.ms.qr.login.http.GenericResponse;
import com.enel.ms.qr.login.http.HeaderResponse;
import com.enel.ms.qr.login.http.UserRequest;
import com.enel.ms.qr.login.http.UserResponse;
import com.enel.ms.qr.login.repository.UserRepository;
import com.enel.ms.qr.login.service.PermissionsService;
import com.enel.ms.qr.login.utils.LoginUtils;

@RestController
@RequestMapping("/auth")
public class UserController {
	private static final Logger log = LoggerFactory.getLogger(MsEnelLoginApplication.class);
	
	private GenericResponse gr;
	
	@Autowired
	private UserRepository repository;
	

	@Autowired
	private PermissionsService permissionsService;
	
	@GetMapping(path="/listPermission")
	public UserResponse listPermision() {
		Long userId = new Long(1);
		return permissionsService.listPermission(userId);
	}
	
	@RequestMapping(value = "/login", method = {RequestMethod.POST})
    public GenericResponse testPost(@Valid @RequestBody UserRequest u) {
		log.info("u=>" + u.getEmail());
		log.info("p=>" + u.getPassword());
		String passordEncode = null;
		boolean userAuthorized = false;
		
		gr = new GenericResponse(new HeaderResponse(), new BodyResponse());
		try {
			 passordEncode = LoginUtils.convertToMd5(u.getPassword()).toString();
			 log.info("pas-enc=>" + passordEncode);
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		if(!permissionsService.existEmail(u.getEmail())){
			log.info("No existe email");
			gr.getHr().setCode("400");
			gr.getHr().setMsg("El usuario ingresado no esta registrado");
		}else{
			User user = permissionsService.getUser(u.getEmail());
			if(user.getPassword().equals(passordEncode)){
				Long userId = Long.valueOf(user.getId());
				log.info("userid=" + userId);
				UserResponse  userResponse = permissionsService.listPermission(userId);
				gr.getHr().setCode("200");
				gr.getHr().setMsg("Exito");
				gr.getBr().put("UserAccess", userResponse);
			}else{
				gr.getHr().setCode("300");
				gr.getHr().setMsg("Contraseña incorrecta");
			}
		}
		return gr;
	   }
	

	
}
