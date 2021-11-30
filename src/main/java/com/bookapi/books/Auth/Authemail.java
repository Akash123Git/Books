package com.bookapi.books.Auth;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Authemail {
    
    @Autowired
    private JavaMailSender javaMailSender;
	
    @GetMapping("/email")
	public String sendEmail() {

        SimpleMailMessage msg = new SimpleMailMessage();
        msg.setTo("akashvijay769@gmail.com");

        msg.setSubject("Testing from Spring Boot");
        msg.setText("Hello World \n Spring Boot Email ");
        try{javaMailSender.send(msg);
            return "sent";
        }
        catch(Exception e){
            return "not sent";
        }
        


    }
}
