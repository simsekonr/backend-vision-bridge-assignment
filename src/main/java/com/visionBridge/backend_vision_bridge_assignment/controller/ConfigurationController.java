package com.visionBridge.backend_vision_bridge_assignment.controller;
import com.visionBridge.backend_vision_bridge_assignment.config.ConfigStore;
import com.visionBridge.backend_vision_bridge_assignment.model.Configuration;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/configuration")
public class ConfigurationController {

    @GetMapping("/{id}")
    public ResponseEntity<?> getConfig(@PathVariable String id) {
        Configuration config = ConfigStore.CONFIGS.get(id);
        if (config == null) return ResponseEntity.notFound().build();
        return ResponseEntity.ok(config);
    }

    @GetMapping("/all")
    public Map<String, Configuration> getAll() {
        return ConfigStore.CONFIGS;
    }

    @PostMapping
    public ResponseEntity<?> addConfig(@RequestParam String id, @RequestBody Configuration config) {
        ConfigStore.CONFIGS.put(id, config);
        return ResponseEntity.ok().build();
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> updateConfig(@PathVariable String id, @RequestBody Configuration config) {
        ConfigStore.CONFIGS.put(id, config);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteConfig(@PathVariable String id) {
        ConfigStore.CONFIGS.remove(id);
        return ResponseEntity.ok().build();
    }
}