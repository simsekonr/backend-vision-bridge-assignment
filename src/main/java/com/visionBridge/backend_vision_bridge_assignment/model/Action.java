package com.visionBridge.backend_vision_bridge_assignment.model;


public class Action {
    private String type;
    private String selector;
    private String newElement;
    private String position;
    private String target;
    private String element;
    private String oldValue;
    private String newValue;

    public Action() {}

    public String getType() { return type; }
    public void setType(String type) { this.type = type; }
    public String getSelector() { return selector; }
    public void setSelector(String selector) { this.selector = selector; }
    public String getNewElement() { return newElement; }
    public void setNewElement(String newElement) { this.newElement = newElement; }
    public String getPosition() { return position; }
    public void setPosition(String position) { this.position = position; }
    public String getTarget() { return target; }
    public void setTarget(String target) { this.target = target; }
    public String getElement() { return element; }
    public void setElement(String element) { this.element = element; }
    public String getOldValue() { return oldValue; }
    public void setOldValue(String oldValue) { this.oldValue = oldValue; }
    public String getNewValue() { return newValue; }
    public void setNewValue(String newValue) { this.newValue = newValue; }
}