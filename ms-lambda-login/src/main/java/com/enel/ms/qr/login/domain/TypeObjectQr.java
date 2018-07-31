package com.enel.ms.qr.login.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "CAT_MTIPO_OBJETO_QR")
public class TypeObjectQr {

	@Id
	@Column(name="MTIPO_OBJETO_QR_ID")       
	private Integer id;
	@Column(name="MTIPO_OBJETO_QR_CODIGO")
	private String codigo;
	@Column(name="MTIPO_OBJETO_QR_NOMBRE")
	private String name;
	@Column(name="MTIPO_OBJ_QR_ESTADO")
	private String estado;
	@OneToMany(mappedBy="qrObjectType")
	private List<ObjectQr> qrObject = new ArrayList<>();
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<ObjectQr> getQrObject() {
		return qrObject;
	}
	public void setQrObject(List<ObjectQr> qrObject) {
		this.qrObject = qrObject;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	
	
}
