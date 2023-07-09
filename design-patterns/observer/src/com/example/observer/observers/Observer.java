package com.example.observer.observers;

import com.example.observer.observables.EventType;

public interface Observer {

  void update(final EventType eventType, final String eventPayload);

}
