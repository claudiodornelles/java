package com.example.observer;

import com.example.observer.observables.EventType;
import com.example.observer.observables.ProductService;
import com.example.observer.observers.NewsletterService;
import com.example.observer.observers.ProductLogger;

public class Main {

  public static void main(String[] args) {
    final var productLogger = new ProductLogger();
    final var newsletterService = new NewsletterService();
    final var productService = new ProductService(productLogger, newsletterService);

    productService.create("iPad");
    productService.update("iPad");
    productService.delete("iPad");

    productService.addObserver(EventType.READ, productLogger);
    productService.getAll();
    productService.removeObserver(EventType.READ, productLogger);
    productService.getAll();

  }

}
