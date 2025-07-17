package com.NotificationService.Notification.Microsercie.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class NotificationService {

    @Autowired
    JavaMailSender javaMailSender;

    public void signInMail(String email,String message)
    {
        SimpleMailMessage simpleMail=new SimpleMailMessage();

        System.out.println("is");
        simpleMail.setFrom("raj");
        simpleMail.setTo(email);
        simpleMail.setSubject("Successfully Signed In");
        simpleMail.setText("congratulation for your ar upgradation");

        javaMailSender.send(simpleMail);

        //return 1;
    }

}
