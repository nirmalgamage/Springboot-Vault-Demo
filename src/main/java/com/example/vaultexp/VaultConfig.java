package com.example.vaultexp;

import org.springframework.context.annotation.Configuration;
import org.springframework.beans.factory.annotation.Value;

@Configuration
public class VaultConfig {
    @Value("${API_KEY}")
    private String API_KEY;

    public String getAPI_KEY() {
        return API_KEY;
    }
}