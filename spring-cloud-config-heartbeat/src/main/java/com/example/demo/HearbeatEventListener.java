package com.example.demo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.client.discovery.event.HeartbeatEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class HearbeatEventListener {

    @EventListener
    public void heartbeat(final HeartbeatEvent event) {
        log.info("HeartbeatEvent:" + event.getValue());
    }
}
