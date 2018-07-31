package com.enel.ms.qr.login.domain;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name = "SEG_MPERFIL_QR")
public class RoleQr {

	@Id
	@Column(name="MPERF_QR_ID")       
	private Integer id;
	
	@Column(name="MPERF_QR_NOMBRE")       
	private String name;
	
	@Column(name="MPERF_QR_DESCRIPCION")
	private String description;
	
	@OneToMany(mappedBy="roleQr")
	private List<UserQr> userQr =new ArrayList<>();

	@OneToMany(mappedBy="roleObjectQr")
	private List<RoleObject>  roleObjectQr = new ArrayList<>();
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<UserQr> getUserQr() {
		return userQr;
	}

	public void setUserQr(List<UserQr> userQr) {
		this.userQr = userQr;
	}

	public List<RoleObject> getRoleObjectQr() {
		return roleObjectQr;
	}

	public void setRoleObjectQr(List<RoleObject> roleObjectQr) {
		this.roleObjectQr = roleObjectQr;
	}

}
