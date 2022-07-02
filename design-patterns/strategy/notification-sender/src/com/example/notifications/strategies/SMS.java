package com.example.notifications.strategies;

import com.example.notifications.Notification;
import com.example.notifications.NotificationType;

public class SMS implements NotificationType {

  @Override
  public String send(Notification notification) {
    return String.format("Notification sent to {%s} with message {%s} ", notification.getReceiver().getPhoneNumber(), notification.getMessage());
  }
}
