package io.spring.pivotal.sensor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.messaging.MessageChannel;

@EnableBinding(Source.class)
public class SensorDataSource {

    @Autowired
	private MessageChannel output;

	public void ingest(SensorData sensorData)
	{
		output.send(MessageBuilder.withPayload(sensorData).build());
	}
}