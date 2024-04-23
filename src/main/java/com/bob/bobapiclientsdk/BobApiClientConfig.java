package com.bob.bobapiclientsdk;

import com.bob.bobapiclientsdk.client.BobApiClient;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties("bobapi-client")
@Data
@ComponentScan
public class BobApiClientConfig {

    private String accessKey;

    private String secretKey;

    @Bean
    public BobApiClient bobApiClient() {
        return new BobApiClient(accessKey, secretKey);
    }

}
