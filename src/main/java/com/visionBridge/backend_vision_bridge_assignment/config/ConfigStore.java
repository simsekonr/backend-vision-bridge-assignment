package com.visionBridge.backend_vision_bridge_assignment.config;

import com.visionBridge.backend_vision_bridge_assignment.model.Configuration;
import com.visionBridge.backend_vision_bridge_assignment.model.SpecificConfiguration;

import java.util.concurrent.ConcurrentHashMap;
import java.util.Map;

public class ConfigStore {
    public static Map<String, Configuration> CONFIGS = new ConcurrentHashMap<>();
    public static Map<String, SpecificConfiguration> SPECIFICS = new ConcurrentHashMap<>();
}