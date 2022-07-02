package com.example;

import com.example.client.Receiver;
import com.example.notifications.Notification;
import com.example.notifications.NotificationHandler;

public class Main {

  public static void main(String[] args) {
    var firstReceiver = new Receiver()
        .withName("Joseph")
        .withEmail("joseph@example.com");
    var firstNotification = new Notification(firstReceiver);
    var secondReceiver = new Receiver()
        .withName("Mohamed")
        .withEmail("mohamed@example.com")
        .withPhoneNumber("+12345678909876");
    var secondNotification = new Notification(secondReceiver);

    var notificationHandler = new NotificationHandler();

    System.out.println(notificationHandler.send(firstNotification));
    System.out.println(notificationHandler.send(secondNotification));

  }

}
