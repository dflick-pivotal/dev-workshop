package io.spring.pivotal.sensor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SensorDataController {

	@Autowired
	SensorDataSource source;

	@RequestMapping(value = "/ingest", method = RequestMethod.POST, headers = "Accept=application/json")
	public SensorData ingest(@RequestBody SensorData sensorData)
	{
	    source.ingest(sensorData);
		return sensorData;
	}
}