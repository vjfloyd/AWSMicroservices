package com.enel.ms.qr.login.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.*;
import javax.persistence.Column;

@Entity
@Table(name="SEG_MOBJETO_QR")
public class ObjectQr implements Serializable{
	@Id
	@Column(name="MOBEJ_QR_ID")
	private Long id;
	@ManyToOne
	private ObjectQr parent;
	@OneToMany(mappedBy="parent")
	private List<ObjectQr> children;
	@Column(name="MOBEJ_QR_CODIGO")
	private String qrObjectCode;
	@Column(name="MOBEJ_QR_NOMBRE")
	private String objectName;
	@Column(name="MOBEJ_QR_ESTADO")
	private String qrObjectStatus;
	@Column(name="MOBEJ_QR_ID_PADR")
	private String idParent;
	
	@OneToMany(mappedBy="objectRoleQr")
	private List<RoleObject> roleObject = new ArrayList<>();

	@ManyToOne
	@JoinColumn(name="MTIPO_OBJ_QR_ID")
	private TypeObjectQr qrObjectType;
	
	public TypeObjectQr getQrObjectType() {
		return qrObjectType;
	}

	public void setQrObjectType(TypeObjectQr qrObjectType) {
		this.qrObjectType = qrObjectType;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public ObjectQr getParent() {
		return parent;
	}

	public void setParent(ObjectQr parent) {
		this.parent = parent;
	}

	public List<ObjectQr> getChildren() {
		return children;
	}

	public void setChildren(List<ObjectQr> children) {
		this.children = children;
	}

	public String getQrObjectCode() {
		return qrObjectCode;
	}

	public void setQrObjectCode(String qrObjectCode) {
		this.qrObjectCode = qrObjectCode;
	}

	public String getObjectName() {
		return objectName;
	}

	public void setObjectName(String objectName) {
		this.objectName = objectName;
	}

	public String getQrObjectStatus() {
		return qrObjectStatus;
	}

	public void setQrObjectStatus(String qrObjectStatus) {
		this.qrObjectStatus = qrObjectStatus;
	}

	public List<RoleObject> getRoleObject() {
		return roleObject;
	}

	public void setRoleObject(List<RoleObject> roleObject) {
		this.roleObject = roleObject;
	}
	
	
}
