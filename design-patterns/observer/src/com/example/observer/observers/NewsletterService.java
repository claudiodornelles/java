package com.example.observer.observers;

import com.example.observer.observables.EventType;

public class NewsletterService implements Observer {

  @Override
  public void update(final EventType eventType, final String eventPayload) {
    System.out.printf("[NewsletterService] Sending newsletter to customers to notifying creation of product %s%n", eventPayload);
  }

}
