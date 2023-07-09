package com.example.observer.observables;

import static com.example.observer.observables.EventType.CREATED;
import static com.example.observer.observables.EventType.DELETED;
import static com.example.observer.observables.EventType.READ;
import static com.example.observer.observables.EventType.UPDATED;

import com.example.observer.observers.NewsletterService;
import com.example.observer.observers.ProductLogger;
import java.util.List;

public class ProductService extends Observable {

  public ProductService(final ProductLogger productLogger,
                        final NewsletterService newsletterService) {
    super(CREATED, DELETED, UPDATED);
    this.addObserver(List.of(CREATED, DELETED, UPDATED), productLogger);
    this.addObserver(CREATED, newsletterService);
  }

  public void create(final String product) {
    notifyObservers(CREATED, product);
  }

  public void update(final String product) {
    notifyObservers(UPDATED, product);
  }

  public void delete(final String product) {
    notifyObservers(DELETED, product);
  }

  public void getAll() {
    notifyObservers(READ, "all products");
  }

}
