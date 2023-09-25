package org.example;

public class CurrentConditionsDisplay implements Observer, DisplayElement {

    private float temperature;
    private float humidity;
    private float heatIndex;
    private Subject weatherData;

    public CurrentConditionsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Current conditions: " + temperature
                + "F degrees and " + humidity + "% humidity"
                + " and HeatIndex: " + heatIndex);
    }

    @Override
    public void update(float temp, float humidity, float pressure, float heatindex) {
        this.temperature = temp;
        this.humidity = humidity;
        this.heatIndex = heatindex;
        display();
    }
}
