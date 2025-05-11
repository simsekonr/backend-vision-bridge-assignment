package com.visionBridge.backend_vision_bridge_assignment.model;

import lombok.Getter;

@Getter
public class Action {
    private String type;
    private String selector;
    private String newElement;
    private String position;
    private String target;
    private String element;
    private String oldValue;
    private String newValue;

    public void setType(String type) { this.type = type; }

    public void setSelector(String selector) { this.selector = selector; }

    public void setNewElement(String newElement) { this.newElement = newElement; }

    public void setPosition(String position) { this.position = position; }

    public void setTarget(String target) { this.target = target; }

    public void setElement(String element) { this.element = element; }

    public void setOldValue(String oldValue) { this.oldValue = oldValue; }

    public void setNewValue(String newValue) { this.newValue = newValue; }
}
