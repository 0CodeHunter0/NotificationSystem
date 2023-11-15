package com.nareshit.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nareshit.service.NotificationClient;

//@Controller
//@ResponseBody
@RestController // Controller + ResponseBody
@RequestMapping("notifications")
public class NotificationAPI {

    @Autowired
    private NotificationClient notificationClient;
    
    @GetMapping("/email")
    public String  triggerNotification(){
       return this.notificationClient.sendNotification();
    }

    
}
