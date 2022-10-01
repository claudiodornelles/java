package com.example;

import com.example.states.Document;

public class Main {

    public static void main(String[] args) {
        try {
            final Document document = new Document();
            System.out.println("Current document state: " + document.getState());
            document.publish();
            System.out.println("Current document state: " + document.getState());
            document.publish();
            System.out.println("Current document state: " + document.getState());
            document.publish();
        } catch (IllegalStateException exception) {
            System.out.println(exception);
        }
    }
    
}
