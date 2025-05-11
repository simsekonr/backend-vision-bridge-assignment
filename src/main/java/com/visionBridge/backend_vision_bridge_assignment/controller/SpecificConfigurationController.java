package com.visionBridge.backend_vision_bridge_assignment.controller;
import com.visionBridge.backend_vision_bridge_assignment.config.ConfigStore;
import com.visionBridge.backend_vision_bridge_assignment.model.SpecificConfiguration;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/specific")
public class SpecificConfigurationController {

    @GetMapping("/{id}")
    public ResponseEntity<?> getSpecific(@PathVariable String id) {
        try {
            SpecificConfiguration config = ConfigStore.SPECIFICS.get(id);
            if (config == null) {
                return ResponseEntity.notFound().build();
            }
            return ResponseEntity.ok(config);
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error: " + e.getMessage());
        }
    }

    @GetMapping("/all")
    public ResponseEntity<?> getAll() {
        try {
            return ResponseEntity.ok(ConfigStore.SPECIFICS);
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error: " + e.getMessage());
        }
    }

    @PostMapping
    public ResponseEntity<?> addSpecific(@RequestParam String id, @RequestBody SpecificConfiguration config) {
        try {
            ConfigStore.SPECIFICS.put(id, config);
            return ResponseEntity.ok().build();
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error: " + e.getMessage());
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> updateSpecific(@PathVariable String id, @RequestBody SpecificConfiguration config) {
        try {
            ConfigStore.SPECIFICS.put(id, config);
            return ResponseEntity.ok().build();
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error: " + e.getMessage());
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteSpecific(@PathVariable String id) {
        try {
            ConfigStore.SPECIFICS.remove(id);
            return ResponseEntity.ok().build();
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error: " + e.getMessage());
        }
    }
}