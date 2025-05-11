package com.visionBridge.backend_vision_bridge_assignment.controller;
import com.visionBridge.backend_vision_bridge_assignment.config.ConfigStore;
import com.visionBridge.backend_vision_bridge_assignment.model.Configuration;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/configuration")
public class ConfigurationController {

    @GetMapping("/{id}")
    public ResponseEntity<?> getConfig(@PathVariable String id) {
        try {
            Configuration config = ConfigStore.CONFIGS.get(id);
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
            System.out.println(ResponseEntity.ok(ConfigStore.CONFIGS));
            return ResponseEntity.ok(ConfigStore.CONFIGS);
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error: " + e.getMessage());
        }
    }

    @PostMapping
    public ResponseEntity<?> addConfig(@RequestParam String id, @RequestBody Configuration config) {
        try {
            ConfigStore.CONFIGS.put(id, config);
            return ResponseEntity.ok().build();
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error: " + e.getMessage());
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> updateConfig(@PathVariable String id, @RequestBody Configuration config) {
        try {
            ConfigStore.CONFIGS.put(id, config);
            return ResponseEntity.ok().build();
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error: " + e.getMessage());
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteConfig(@PathVariable String id) {
        try {
            ConfigStore.CONFIGS.remove(id);
            return ResponseEntity.ok().build();
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error: " + e.getMessage());
        }
    }
}