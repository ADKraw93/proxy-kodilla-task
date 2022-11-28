package org.task.proxy.weather;

import java.util.Random;

public class WeatherForcastProcessorProxy implements WeatherForecast{

    private WeatherForecast forecast;

    public WeatherForcastProcessorProxy() throws InterruptedException {
        if(forecast==null) {
            forecast = new WeatherForcastProcessor();
        }
    }

    @Override
    public String getWeather() throws InterruptedException {
        if(forecast==null) {
            forecast = new WeatherForcastProcessor();
        }
        return forecast.getWeather();
    }

    @Override
    public void refreshData() throws InterruptedException {
        if(forecast==null) {
            forecast = new WeatherForcastProcessor();
        }
        forecast.refreshData();
    }
}
