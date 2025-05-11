package com.visionBridge.backend_vision_bridge_assignment.controller;
import com.visionBridge.backend_vision_bridge_assignment.config.ConfigStore;
import com.visionBridge.backend_vision_bridge_assignment.model.SpecificConfiguration;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/specific")
public class SpecificConfigurationController {

    @GetMapping("/{id}")
    public ResponseEntity<?> getSpecific(@PathVariable String id) {
        SpecificConfiguration config = ConfigStore.SPECIFICS.get(id);
        if (config == null) return ResponseEntity.notFound().build();
        return ResponseEntity.ok(config);
    }

    @GetMapping("/all")
    public Map<String, SpecificConfiguration> getAll() {
        return ConfigStore.SPECIFICS;
    }

    @PostMapping
    public ResponseEntity<?> addSpecific(@RequestParam String id, @RequestBody SpecificConfiguration config) {
        ConfigStore.SPECIFICS.put(id, config);
        return ResponseEntity.ok().build();
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> updateSpecific(@PathVariable String id, @RequestBody SpecificConfiguration config) {
        ConfigStore.SPECIFICS.put(id, config);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteSpecific(@PathVariable String id) {
        ConfigStore.SPECIFICS.remove(id);
        return ResponseEntity.ok().build();
    }
}