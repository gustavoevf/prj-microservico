package com.example.notification_service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/notifications")
public class NotificationController {

    private List<Notification> notifications = new ArrayList<>();

    @GetMapping("/")
    public List<Notification> getNotifications() {
        return notifications;
    }

    @GetMapping("/{id}")
    public Notification getNotification(@PathVariable int id) {
        return notifications.stream()
                .filter(notification -> notification.getId() == id)
                .findFirst()
                .orElse(null);
    }

    @PostMapping("/")
    public Notification createNotification(@RequestBody Notification notification) {
        notifications.add(notification);
        return notification;
    }
}
