package org.task.proxy.weather;

import java.util.Random;

public class WeatherForcastProcessor implements WeatherForecast{

    public WeatherForcastProcessor() throws InterruptedException {
        refreshData();
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
