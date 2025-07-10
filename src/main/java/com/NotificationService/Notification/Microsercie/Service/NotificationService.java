package com.NotificationService.Notification.Microsercie.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class NotificationService {

    @Autowired
    JavaMailSender javaMailSender;

    public int signInMail(String email,String message)
    {

    }

}
