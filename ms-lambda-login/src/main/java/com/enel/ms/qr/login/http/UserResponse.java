package com.enel.ms.qr.login.http;

import com.enel.ms.qr.login.dto.WorkingInformationDto;
import com.enel.ms.qr.login.dto.RolelDto;
import com.enel.ms.qr.login.dto.PermissionListDto;
import com.enel.ms.qr.login.dto.Person;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by vjrojasb on 6/12/18.
 */
public class UserResponse {
    @JsonProperty("role")
	RolelDto perfilDto;
    @JsonProperty("person")
    Person personaDto;
    @JsonProperty("workingInformation")
    WorkingInformationDto informacionLaboralDto;
    @JsonProperty("permissionsList")
    PermissionListDto permisosListaDto;

    public RolelDto getPerfilDto() {
        return perfilDto;
    }

    public void setPerfilDto(RolelDto perfilDto) {
        this.perfilDto = perfilDto;
    }

    public Person getPersonaDto() {
        return personaDto;
    }

    public void setPersonaDto(Person personaDto) {
        this.personaDto = personaDto;
    }

    public WorkingInformationDto getInformacionLaboralDto() {
        return informacionLaboralDto;
    }

    public void setInformacionLaboralDto(WorkingInformationDto informacionLaboralDto) {
        this.informacionLaboralDto = informacionLaboralDto;
    }

    public PermissionListDto getPermisosListaDto() {
        return permisosListaDto;
    }

    public void setPermisosListaDto(PermissionListDto permisosListaDto) {
        this.permisosListaDto = permisosListaDto;
    }
}
