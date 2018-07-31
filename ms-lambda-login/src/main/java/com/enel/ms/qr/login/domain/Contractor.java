package com.enel.ms.qr.login.domain;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name="CAT_MCONTRATISTA")
public class Contractor {

	@Id
	@Column(name="MCONT_ID")
	private Long id;
	@Column(name="MCONT_RAZSOC")
	private String businessName;

	@OneToMany(mappedBy="contractorUser")
	private List<User> user = new ArrayList<>();
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getBusinessName() {
		return businessName;
	}
	public void setBusinessName(String businessName) {
		this.businessName = businessName;
	}
	public List<User> getUser() {
		return user;
	}
	public void setUser(List<User> user) {
		this.user = user;
	}
	
	
}
