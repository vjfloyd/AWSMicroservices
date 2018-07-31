package com.enel.ms.qr.login.domain;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.*;



@Entity
@Table(name = "SEG_MUSUARIO")
public class User {

	@Id
	@Column(name = "MUSU_ID")
	private Long id;

	@Column(name = "MUSU_EMAIL")
	private String email;
		
	@Column(name = "MUSU_PASSWORD")
	private String password;

	@Column(name = "MUSU_NOMBRES")
	private String names;
	
	@Column(name = "MUSU_APELLIDOS")
	private String surnames;
	
	@OneToMany(mappedBy="roleUser")
	private List<UserQr> userQr = new ArrayList<UserQr>();

	@ManyToOne
	@JoinColumn(name="MCONT_ID")
	private Contractor contractorUser;
	
	
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
    
	public String getNames() {
		return names;
	}

	public void setNames(String names) {
		this.names = names;
	}

	public String getSurnames() {
		return surnames;
	}

	public void setSurnames(String surnames) {
		this.surnames = surnames;
	}

	public List<UserQr> getUserQr() {
		return userQr;
	}

	public void setUserQr(List<UserQr> userQr) {
		this.userQr = userQr;
	}

	public Contractor getContractorUser() {
		return contractorUser;
	}

	public void setContractorUser(Contractor contractorUser) {
		this.contractorUser = contractorUser;
	}

	
}
