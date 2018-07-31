package com.enel.ms.qr.login.repository;

import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.enel.ms.qr.login.domain.Permission;


@Repository
public interface PermisoRepository  extends CrudRepository<Permission, Integer>{

	@Query("SELECT r.name, r.description, u.names, u.surnames, u.email, cu.businessName, o.qrObjectCode, (select x.qrObjectCode FROM ObjectQr x WHERE x.id =  o.idParent ) , ot.name, ro.accessLevel "
			+ " FROM User u "
			+ " JOIN u.userQr uqr  "
			+ " JOIN uqr.roleQr r"
			+ " JOIN r.roleObjectQr ro "
			+ " JOIN ro.objectRoleQr o " 
			+ "	JOIN u.contractorUser cu "
			+ "	JOIN o.qrObjectType ot "
			+ " WHERE u.id = ?1 "
			+ " ")
	public List<Object[]> listPermisos(Long idUsuario);
	

//	@Query("SELECT u.id ,u.nombres, su.apellidos, pqr.MPERF_QR_NOMBRE, oqr.MOBEJ_QR_NOMBRE  \r\n" + 
//			"    FROM User u \r\n" + 
//			"    JOIN UserQR u_qr  ON  u.id = u_qr.id \r\n" + 
//			"    JOIN PerfilQR p_qr ON p_qr.id = u_qr.id \r\n" + 
//			"    JOIN REL_MPERF_MOBJE p_ob ON p_ob.MPERF_QR_ID = p_qr.MPERF_QR_ID\r\n" + 
//			"    JOIN SEG_MOBJETO_QR oqr ON oqr.MOBEJ_QR_ID = pob.MOBEJ_QR_ID\r\n" + 
//			"    JOIN CAT_MTIPO_OBJETO_QR mt ON mt.MTIPO_OBJETO_QR_ID = oqr.MTIPO_OBJ_QR_ID\r\n" + 
//			"    WHERE u.id = 1")
	
}
