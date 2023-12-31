package com.lmnader.rhassociation;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Data
@Configuration
@ConfigurationProperties(prefix = "com.lmnader.rhassociation")
public class CustomProperties {

    private String apiUrl;
}

