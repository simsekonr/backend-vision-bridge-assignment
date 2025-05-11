package com.visionBridge.backend_vision_bridge_assignment.model;
import lombok.Getter;

import java.util.List;

@Getter
public class Configuration {
    private List<Action> actions;

    public void setActions(List<Action> actions) { this.actions = actions; }
}
