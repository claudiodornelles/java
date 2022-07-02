package com.example.notifications.strategies;

import com.example.notifications.Notification;
import com.example.notifications.NotificationType;

public class Email implements NotificationType {

  @Override
  public String send(Notification notification) {
    return String.format("Notification sent to {%s} with message {%s} ", notification.getReceiver().getEmail(), notification.getMessage());
  }
}
