package com.example.observer.observers;

import com.example.observer.observables.EventType;

public class ProductLogger implements Observer {

  @Override
  public void update(final EventType eventType, final String eventPayload) {
    System.out.printf("[ProductLogger] Product %s was %s%n", eventPayload, eventType.getDescription());
  }

}