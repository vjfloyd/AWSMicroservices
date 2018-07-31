package com.enel.ms.qr.login.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.Table;


@Entity
@Table(name="REL_MPERF_MOBJE")
public class RoleObject {

	
	@Id
	private Long id;
	@ManyToOne
	@JoinColumn(name="MPERF_QR_ID")
	private RoleQr roleObjectQr;
	@ManyToOne
	@JoinColumn(name="MOBEJ_QR_ID")
	private ObjectQr objectRoleQr;
	
	@Column(name="MPERF_MOBJE_NIVEL_ACCE")
	private String accessLevel;
	@Column(name="MPERF_MOBJE_IND_ONLINE")
	private String indOnline;
	@Column(name="MPERF_MOBJE_IND_OFFLINE")
	private String indOffline;
	@Column(name="MPERF_MOBJE_FECINS")
	private String creationDate;
	@Column(name="MPERF_MOBJE_FECACT")
	private String updateDate;
	@Column(name="MPERF_MOBJE_USERINS")
	private String userCreation;
	@Column(name="MPERF_MOBJE_USERACT")
	private String userUpdate;
	
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public RoleQr getRoleObjectQr() {
		return roleObjectQr;
	}
	public void setRoleObjectQr(RoleQr roleObjectQr) {
		this.roleObjectQr = roleObjectQr;
	}
	public ObjectQr getObjectRoleQr() {
		return objectRoleQr;
	}
	public void setObjectRoleQr(ObjectQr objectRoleQr) {
		this.objectRoleQr = objectRoleQr;
	}
	public String getAccessLevel() {
		return accessLevel;
	}
	public void setAccessLevel(String accessLevel) {
		this.accessLevel = accessLevel;
	}
	public String getIndOnline() {
		return indOnline;
	}
	public void setIndOnline(String indOnline) {
		this.indOnline = indOnline;
	}
	public String getIndOffline() {
		return indOffline;
	}
	public void setIndOffline(String indOffline) {
		this.indOffline = indOffline;
	}
	public String getCreationDate() {
		return creationDate;
	}
	public void setCreationDate(String creationDate) {
		this.creationDate = creationDate;
	}
	public String getUpdateDate() {
		return updateDate;
	}
	public void setUpdateDate(String updateDate) {
		this.updateDate = updateDate;
	}
	public String getUserCreation() {
		return userCreation;
	}
	public void setUserCreation(String userCreation) {
		this.userCreation = userCreation;
	}
	public String getUserUpdate() {
		return userUpdate;
	}
	public void setUserUpdate(String userUpdate) {
		this.userUpdate = userUpdate;
	}
	
	
	
}