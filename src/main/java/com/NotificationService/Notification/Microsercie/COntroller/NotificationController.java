package com.NotificationService.Notification.Microsercie.COntroller;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NotificationController {

    @PostMapping("/email")
    public ResponseEntity<?> singedInMail(@PathVariable String email, @PathVariable String message)
    {
       return ResponseEntity.ok("successfull");
    }

}
