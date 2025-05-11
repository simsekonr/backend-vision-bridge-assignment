package com.visionBridge.backend_vision_bridge_assignment.model;
import lombok.Getter;

import java.util.List;
import java.util.Map;
@Getter
public class SpecificConfiguration {
    private Map<String, List<String>> pages;
    private Map<String, List<String>> urls;
    private Map<String, List<String>> hosts;

    public void setPages(Map<String, List<String>> pages) { this.pages = pages; }

    public void setUrls(Map<String, List<String>> urls) { this.urls = urls; }

    public void setHosts(Map<String, List<String>> hosts) { this.hosts = hosts; }
}
