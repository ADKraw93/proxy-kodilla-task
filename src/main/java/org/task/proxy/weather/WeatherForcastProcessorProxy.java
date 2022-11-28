package org.task.proxy.weather;

import java.util.Random;

public class WeatherForcastProcessorProxy implements WeatherForecast{

    public WeatherForcastProcessorProxy() {
    }

    @Override
    public String getWeather() {
        int number = new Random().nextInt(3);
        if(number==0) {
            return "sun";
        } else if(number==1) {
            return "rain";
        } else {
            return "snow";
        }
    }

    @Override
    public void refreshData() throws InterruptedException {
        Thread.sleep(5000);
    }
}
