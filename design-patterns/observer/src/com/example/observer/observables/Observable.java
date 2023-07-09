package com.example.observer.observables;

import com.example.observer.observers.Observer;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class Observable {

  private final Map<EventType, List<Observer>> observers = new EnumMap<>(EventType.class);

  public Observable(final EventType... operations) {
    for (final var operation : operations) {
      this.observers.put(operation, new ArrayList<>());
    }
  }

  public void addObserver(final EventType eventType, final Observer observer) {
    getObserversOf(eventType).add(observer);
  }

  public void addObserver(final List<EventType> eventTypes, final Observer observer) {
    for (final var eventType : eventTypes) {
      getObserversOf(eventType).add(observer);
    }
  }

  public void removeObserver(final EventType eventType, final Observer observer) {
    getObserversOf(eventType).remove(observer);
  }

  public void notifyObservers(final EventType eventType, final String product) {
    final var currentObservers = getObserversOf(eventType);
    for (Observer observer : currentObservers) {
      observer.update(eventType, product);
    }
  }

  private List<Observer> getObserversOf(final EventType eventType) {
    return Optional.ofNullable(this.observers.get(eventType))
        .orElseGet(() -> {
          final var newObservers = new ArrayList<Observer>();
          observers.put(eventType, newObservers);
          return newObservers;
        });
  }

}
