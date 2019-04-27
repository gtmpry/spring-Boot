package com.javtpoint;  
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;  
@RestController  
public class UserController {  
    @Autowired  
    private UserService userService;   
    @RequestMapping("/")  
    public List<UserRecord> getAllUser(){  
        return userService.getAllUsers();  
    }     
    
    @Procedure("application/xml")
    @RequestMapping(value="/add-user",method=RequestMethod.POST)
    public void addUser(@RequestBody UserRecord userRecord){  
        userService.adduser1(userRecord);  
    }  
    @RequestMapping(value="/user/{id}",method=RequestMethod.GET)  
    public Optional<UserRecord> getUser(@PathVariable int id){  
        return userService.getUser(id);  
    }  
    
    @RequestMapping(value="/user",method=RequestMethod.GET)
	public String getUser(@RequestParam String email,@RequestParam String password)
	{
		UserRecord user=new UserRecord();
		user.setEmail(email);
		user.setPassword(password);
		
		Optional<UserRecord> optional=userService.find(email, password);
		
		if(!optional.isPresent())
		{
			
		 userService.find(email, password);
		 
		 return "Unsuccessfull!";
		}
		else
		{
			return "successfull!";
		}
		
}  
    
    
    @RequestMapping(value="/user/pass",method=RequestMethod.GET)
   	public Optional<UserRecord> getPassword(@RequestParam String email,@RequestParam Long mobile)
   	{
   		UserRecord user=new UserRecord();
   		user.setEmail(email);
   		user.setMobile(mobile);
   		
   		Optional<UserRecord> optional=userService.find(email, mobile);
   		
   		if(!optional.isPresent())
   		{
   			
   		 userService.find(email, mobile);
   		 
   		 return null;
   		}
   		else
   		{
   			return userService.find(email, mobile);
   		}
   		
   }  
    
    
    
    
    
    
    
    
    
}