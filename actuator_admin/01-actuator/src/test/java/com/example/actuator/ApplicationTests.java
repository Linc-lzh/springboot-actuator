package com.example.actuator;

import io.micrometer.core.instrument.Counter;
import io.micrometer.core.instrument.MeterRegistry;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ApplicationTests {

    @Autowired
    MeterRegistry meterRegistry;
    @Test
    void contextLoads() throws InterruptedException {

        Counter counter = meterRegistry.counter("cityService.saveCity.count");
        counter.increment();

        Thread.sleep(60*10*1000);
    }

}
