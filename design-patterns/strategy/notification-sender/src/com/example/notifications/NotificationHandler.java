package com.example.notifications;

import com.example.exceptions.ServiceValidationException;
import com.example.notifications.strategies.Email;
import com.example.notifications.strategies.SMS;

public class NotificationHandler {

  public String send(Notification notification) {

    validateNotification(notification);

    if (notification.getReceiver().getPhoneNumber() != null
        && !notification.getReceiver().getPhoneNumber().trim().equals("")) {
      var notificationType = new SMS();
      return notificationType.send(notification);
    } if (notification.getReceiver().getEmail() != null
    && !notification.getReceiver().getEmail().trim().equals("")) {
      var notificationType = new Email();
      return notificationType.send(notification);
    }
    return "Notification is not valid";
  }

  private void validateNotification(Notification notification) {
    if (notification == null) {
      throw new ServiceValidationException("Notification should not be null");
    }
    if (notification.getReceiver() == null) {
      throw new ServiceValidationException("Notification should have a receiver");
    }
    if (notification.getReceiver().getEmail() == null) {
      throw new ServiceValidationException("Receiver should have an email");
    }
    if (notification.getMessage() == null) {
      throw new ServiceValidationException("Notification should have a message");
    }
  }

}
