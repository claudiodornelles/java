package com.example.states;

public final class Document {

    private State state;

    public Document() {
        this.state = new DraftState(this);
    }
    
    void changeState(State state) {
        this.state = state;
    }
    
    public String getState() {
        return state.toString();
    }

    public void publish() {
        state.publish();
    }

}