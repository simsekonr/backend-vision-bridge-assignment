package com.visionBridge.backend_vision_bridge_assignment.model;

import java.util.List;

public class Configuration {
    private List<Action> actions;

    public Configuration() {} // No-arg constructor

    public List<Action> getActions() {
        return actions;
    }

    public void setActions(List<Action> actions) {
        this.actions = actions;
    }
}