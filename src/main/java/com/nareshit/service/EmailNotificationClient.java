package com.nareshit.service;

import org.springframework.stereotype.Component;

@Component
public class EmailNotificationClient implements NotificationClient{


    @Override
    public String sendNotification() {
    	return "Email Notification Sent.....";
    }
}
