package io.pivotal.spring.hellospringboot;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import io.micrometer.core.instrument.Counter;
import io.micrometer.core.instrument.MeterRegistry;


@Component
public class GreetingService {

    @Value("${greeting}")
    String greeting;

    private final Counter counter;

	public GreetingService(MeterRegistry registry) {
		this.counter = registry.counter("my.counter");
	}

    public String getGreeting() {
		this.counter.increment();
        return greeting;
    }
}
