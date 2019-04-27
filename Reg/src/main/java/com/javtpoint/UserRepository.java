package com.javtpoint;  
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;  
public interface UserRepository extends CrudRepository<UserRecord, String> {



	void deleteById(Long id);

	Optional<UserRecord> getUserByEmailAndPassword(String email, String password);  
	Optional<UserRecord> getUserByEmailAndMobile(String email, Long mobile);  
}  