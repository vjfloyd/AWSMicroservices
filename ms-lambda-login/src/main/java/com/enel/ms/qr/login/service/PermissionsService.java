package com.enel.ms.qr.login.service;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.enel.ms.qr.login.MsEnelLoginApplication;
import com.enel.ms.qr.login.domain.User;
import com.enel.ms.qr.login.dto.WorkingInformationDto;
import com.enel.ms.qr.login.dto.RolelDto;
import com.enel.ms.qr.login.dto.PermissionListDto;
import com.enel.ms.qr.login.dto.PermissionDto;
import com.enel.ms.qr.login.dto.Person;
import com.enel.ms.qr.login.http.UserResponse;
import com.enel.ms.qr.login.repository.PermisoRepository;
import com.enel.ms.qr.login.repository.UserRepository;

@Service
public class PermissionsService {

	private static final Logger log =  LoggerFactory.getLogger(MsEnelLoginApplication.class);
	
	@Autowired
	private PermisoRepository permisoRepository;
	
	@Autowired
	private UserRepository userRepository;
	
	public UserResponse listPermission(Long idUsuario){
		List<Object[]> permisosArrayList = permisoRepository.listPermisos(idUsuario);
		PermissionDto permissionDto=null;
		Person personaDto = new Person();
		WorkingInformationDto informacionLaboralDto = new WorkingInformationDto();
		List<PermissionDto> listPermission = new ArrayList<>();
		RolelDto roleDto = new RolelDto();
		//r.name, r.description, u.names, u.surnames, u.email, cu.businessName, 
		//	o.qrObjectCode,  o.qrObjectCode, ot.name, ro.accessLevel "
		log.info("size = " +permisosArrayList.size());
		for (Object[] permisosArray :permisosArrayList ) {
			roleDto.setName(permisosArray[0].toString());
			roleDto.setDescription(permisosArray[1].toString());
			personaDto.setName(permisosArray[2].toString());
			personaDto.setSurnames(permisosArray[3].toString());
			personaDto.setEmail(permisosArray[4].toString());
			informacionLaboralDto.setBussinessNameContractor(permisosArray[5].toString());
			permissionDto = new PermissionDto();
			permissionDto.setCodeComponent(permisosArray[6].toString());
			if(permisosArray[7]==null) {
				permissionDto.setCodeParentComponent(null);
			}else {
				permissionDto.setCodeParentComponent(permisosArray[7].toString());
			}
			
			permissionDto.setTypeComponent(permisosArray[8].toString());
			permissionDto.setAccessLevel(permisosArray[9].toString());
			log.info("code comp="+permisosArray[6].toString());
			listPermission.add(permissionDto);
		}
		PermissionListDto permisosListaDto = new PermissionListDto();
		permisosListaDto.setListPermission(listPermission);
		UserResponse userResponse = new UserResponse();
		userResponse.setInformacionLaboralDto(informacionLaboralDto);
		userResponse.setPerfilDto(roleDto);
		userResponse.setPersonaDto(personaDto);
		userResponse.setPermisosListaDto(permisosListaDto);
		return userResponse;
	}
	
	public User getUser(String email) {
		return userRepository.findByEmail(email);
	}
	
	public boolean existEmail(String email) {
		return userRepository.findByEmail(email)!=null;
	}
	
	public boolean validateUserLogin(String mail, String password) {
		return true;
	}
}
