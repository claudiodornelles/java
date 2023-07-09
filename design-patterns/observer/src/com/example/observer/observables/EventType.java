package com.example.observer.observables;

public enum EventType {

  CREATED("created"),
  UPDATED("updated"),
  DELETED("deleted"),
  READ("read");

  private final String description;

  EventType(String description) {
    this.description = description;
  }

  public String getDescription() {
    return description;
  }

}
