package com.NotificationService.Notification.Microsercie.COntroller;


import com.NotificationService.Notification.Microsercie.Service.NotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NotificationController {

    @Autowired
    NotificationService notificationService;

    @PostMapping("/email")
    public ResponseEntity<?> singedInMail(@RequestParam String email, @RequestParam String message)
    {
        notificationService.signInMail(email,message);
        return ResponseEntity.ok("successfull");
    }

}
