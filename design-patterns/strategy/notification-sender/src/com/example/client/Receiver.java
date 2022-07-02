package com.example.client;

import com.example.exceptions.ServiceValidationException;

public class Receiver {

  private String name;
  private String email;
  private String phoneNumber;

  public Receiver() {
  }

  public String getName() {
    return name;
  }

  public String getEmail() {
    return email;
  }

  public String getPhoneNumber() {
    return phoneNumber;
  }

  public Receiver withName(String name) {
    if (name.trim().equals("")) throw new ServiceValidationException("Name should not be empty");
    this.name = name;
    return this;
  }

  public Receiver withEmail(String email) {
    if (email.trim().equals("")) throw new ServiceValidationException("Email should not be empty");
    this.email = email;
    return this;
  }

  public Receiver withPhoneNumber(String phoneNumber) {
    if (phoneNumber.trim().equals("")) throw new ServiceValidationException("Phone number should not be empty");
    this.phoneNumber = phoneNumber;
    return this;
  }
}
