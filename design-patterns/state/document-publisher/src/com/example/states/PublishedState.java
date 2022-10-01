package com.example.states;

final class PublishedState implements State {

    PublishedState() {
    }

    @Override
    public void publish() {
        throw new IllegalStateException("Document is already published.");
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName();
    }

}
