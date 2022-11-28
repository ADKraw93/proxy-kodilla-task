package org.task.proxy.weather;

public interface WeatherForecast {
    String getWeather();
    void refreshData() throws InterruptedException;
}
