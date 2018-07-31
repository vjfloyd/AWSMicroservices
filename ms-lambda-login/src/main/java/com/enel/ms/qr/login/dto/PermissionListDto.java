package com.enel.ms.qr.login.dto;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

/**
 * Created by vjrojasb on 6/12/18.
 */

public class PermissionListDto {
	//@JsonProperty("permission")
	List<PermissionDto> listPermission;

    public PermissionListDto() {
		super();
		this.listPermission = new ArrayList<>();
	}

	public List<PermissionDto> getListPermission() {
		return listPermission;
	}

	public void setListPermission(List<PermissionDto> listPermission) {
		this.listPermission = listPermission;
	}

   
}
