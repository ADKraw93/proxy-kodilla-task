package org.task.proxy.weather;

public interface WeatherForecast {
    String getWeather() throws InterruptedException;
    void refreshData() throws InterruptedException;
}
