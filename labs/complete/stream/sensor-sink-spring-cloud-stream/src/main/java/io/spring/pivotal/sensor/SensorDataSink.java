package io.spring.pivotal.sensor;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.integration.annotation.ServiceActivator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@EnableBinding(Sink.class)
public class SensorDataSink {
	private static Logger logger = LoggerFactory.getLogger(SensorDataSink.class);

	@ServiceActivator(inputChannel=Sink.INPUT)
	public void ingest(Object payload) {
		logger.info("Received: " + payload);
	}
}