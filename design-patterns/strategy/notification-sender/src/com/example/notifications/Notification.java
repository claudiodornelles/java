package com.example.notifications;

import com.example.client.Receiver;

public class Notification {

  private final String message;
  private final Receiver receiver;

  public Notification(Receiver receiver) {
    this.message = "Hello " + receiver.getName();
    this.receiver = receiver;
  }

  public String getMessage() {
    return message;
  }

  public Receiver getReceiver() {
    return receiver;
  }
}
