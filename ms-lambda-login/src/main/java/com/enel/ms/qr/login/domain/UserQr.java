package com.enel.ms.qr.login.domain;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.Table;


@Entity
@Table(name = "SEG_MUSUARIO_QR")
public class UserQr {

	@Id
	private Long id;
	
	@ManyToOne
	@JoinColumn(name="MUSU_ID")
	private User roleUser;
	
	@ManyToOne
	@JoinColumn(name="MPERF_QR_ID")
	private RoleQr roleQr;
	
	
	@Column(name="MUSU_QR_FECINS")
	private String musu_qr_fecins;
	@Column(name="MUSU_QR_FECACT")
	private String musu_qr_fecact;
	@Column(name="MUSU_QR_USERINS")
	private String musu_qr_userins;
	@Column(name="MUSU_QR_USERACT")
	private String musu_qr_useract;
	
	
	
	public User getRoleUser() {
		return roleUser;
	}
	public void setRoleUser(User roleUser) {
		this.roleUser = roleUser;
	}
	public RoleQr getRoleQr() {
		return roleQr;
	}
	public void setRoleQr(RoleQr roleQr) {
		this.roleQr = roleQr;
	}
	public String getMusu_qr_fecins() {
		return musu_qr_fecins;
	}
	public void setMusu_qr_fecins(String musu_qr_fecins) {
		this.musu_qr_fecins = musu_qr_fecins;
	}
	public String getMusu_qr_fecact() {
		return musu_qr_fecact;
	}
	public void setMusu_qr_fecact(String musu_qr_fecact) {
		this.musu_qr_fecact = musu_qr_fecact;
	}
	public String getMusu_qr_userins() {
		return musu_qr_userins;
	}
	public void setMusu_qr_userins(String musu_qr_userins) {
		this.musu_qr_userins = musu_qr_userins;
	}
	public String getMusu_qr_useract() {
		return musu_qr_useract;
	}
	public void setMusu_qr_useract(String musu_qr_useract) {
		this.musu_qr_useract = musu_qr_useract;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	
	
	
}
