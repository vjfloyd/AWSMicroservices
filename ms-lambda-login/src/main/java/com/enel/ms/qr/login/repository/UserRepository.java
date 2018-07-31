package com.enel.ms.qr.login.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.enel.ms.qr.login.domain.User;

@Repository
public interface UserRepository extends CrudRepository<User, String> {
	
	public User findByEmail(String email);
	
}
