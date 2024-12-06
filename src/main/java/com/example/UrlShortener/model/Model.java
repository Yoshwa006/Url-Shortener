package com.example.UrlShortener.model;

public class Model {
    private String originalUrl;
    private String shortUrl;

    // Default constructor
    public Model() {
    }

    // Getters and setters
    public String getOriginalUrl() {
        return originalUrl;
    }

    public void setOriginalUrl(String originalUrl) {
        this.originalUrl = originalUrl;
    }

    public String getShortUrl() {
        return shortUrl;
    }

    public void setShortUrl(String shortUrl) {
        this.shortUrl = shortUrl;
    }
}
