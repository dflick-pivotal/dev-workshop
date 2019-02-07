package io.spring.pivotal.sensor;

public class SensorData {

	private int sensorId;

	private double temperature;

	public SensorData() {
	}

	public SensorData(int sensorId, double temperature) {
		this.sensorId = sensorId;
		this.temperature = temperature;
	}

	public int getSensorId() {
		return sensorId;
	}

	public double getTemperature() {
		return temperature;
	}
}