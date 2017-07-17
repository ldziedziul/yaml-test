package com.example.demo;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.Map;
import java.util.Optional;

@ConfigurationProperties(prefix = "spring.rabbitmq")
@Component
public class QueueProperties {

    private Map<String, Object> queueConfig;

    public Optional<Map<String, Object>> queueConfig() {
        return Optional.ofNullable(queueConfig);
    }

    public Map<String, Object> getQueueConfig() {
        return queueConfig;
    }

    public void setQueueConfig(Map<String, Object> queueConfig) {
        this.queueConfig = queueConfig;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("QueueProperties{");
        sb.append("queueConfig=").append(queueConfig);
        sb.append('}');
        return sb.toString();
    }
}