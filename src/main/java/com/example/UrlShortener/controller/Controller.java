package com.example.UrlShortener.controller;

import com.example.UrlShortener.model.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@RestController
@RequestMapping("/api")
public class Controller {

    private final ConcurrentHashMap<String, String> urlMap = new ConcurrentHashMap<>();

    // Health check endpoint
    @GetMapping("/status")
    public String status() {
        return "Application is running";
    }

    // Display all URL mappings
    @GetMapping("/urls")
    public Map<String, String> getAllUrls() {
        return urlMap; // Returns the entire map
    }

    // Add a new URL mapping
    @PostMapping()
    public String addUrl(@RequestBody Model model) {
        if (model.getShortUrl() == null || model.getOriginalUrl() == null) {
            return "URL and Short URL cannot be null!";
        }
        urlMap.put(model.getShortUrl(), model.getOriginalUrl());
        return "URL added successfully!";
    }

    // Get the original URL by its short ID
    @GetMapping("/url/{shortId}")
    public String getOriginalUrl(@PathVariable String shortId) {
        String originalUrl = urlMap.get(shortId);
        if (originalUrl != null) {
            return originalUrl;
        } else {
            return "Short URL not found!";
        }
    }
}
