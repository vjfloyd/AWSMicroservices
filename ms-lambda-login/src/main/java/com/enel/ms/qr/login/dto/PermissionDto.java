package com.enel.ms.qr.login.dto;

import com.fasterxml.jackson.annotation.JsonRootName;

/**
 * Created by vjrojasb on 6/12/18.
 */
@JsonRootName(value="permission")
public class PermissionDto {
    String codeComponent;
    String codeParentComponent;
    String typeComponent;
    String accessLevel;
    
	public String getCodeComponent() {
		return codeComponent;
	}
	public void setCodeComponent(String codeComponent) {
		this.codeComponent = codeComponent;
	}
	public String getCodeParentComponent() {
		return codeParentComponent;
	}
	public void setCodeParentComponent(String codeParentComponent) {
		this.codeParentComponent = codeParentComponent;
	}
	public String getTypeComponent() {
		return typeComponent;
	}
	public void setTypeComponent(String typeComponent) {
		this.typeComponent = typeComponent;
	}
	public String getAccessLevel() {
		return accessLevel;
	}
	public void setAccessLevel(String accessLevel) {
		this.accessLevel = accessLevel;
	}

    
}
