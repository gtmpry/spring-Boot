package com.javtpoint;  
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;  
@Service  
public class UserService {  
    @Autowired  
    private UserRepository userRepository;  
    public List<UserRecord> getAllUsers(){  
        List<UserRecord>userRecords = new ArrayList<>();  
        userRepository.findAll().forEach(userRecords::add);  
        return userRecords;  
    }  
    public Optional<UserRecord> getUser(int id){  
    	String idd=String.valueOf(id);
        return userRepository.findById(idd);  
    }  
    public void adduser1(UserRecord userRecord){  
        userRepository.save(userRecord);  
    }  
    public void delete(String id){  
        userRepository.deleteById(id);  
    }
    
    public Optional<UserRecord> find(String email,Long mobile) {
		 
   	 
        return userRepository.getUserByEmailAndMobile(email, mobile);


}
    public Optional<UserRecord> find(String email,String mobile) {
		 
      	 
        return userRepository.getUserByEmailAndPassword(email, mobile);


}

}  