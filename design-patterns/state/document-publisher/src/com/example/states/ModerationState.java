package com.example.states;

final class ModerationState implements State {

    private final Document document;

    ModerationState(Document document) {
        this.document = document;
    }

    @Override
    public void publish() {
        document.changeState(new PublishedState());        
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName();
    }

}
