package com.example.states;

final class DraftState implements State {
    
    private final Document document;

    DraftState(Document document) {
        this.document = document;
    }

    @Override
    public void publish() {
        document.changeState(new ModerationState(document));
    }
    
    @Override
    public String toString() {
        return this.getClass().getSimpleName();
    }

}
