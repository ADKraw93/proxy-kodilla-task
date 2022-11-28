package org.task.proxy;

import org.task.proxy.weather.WeatherForcastProcessor;
import org.task.proxy.weather.WeatherForcastProcessorProxy;
import org.task.proxy.weather.WeatherForecast;

import java.util.Random;

public class AppWeather {

    public static void main(String[] args) throws InterruptedException {
        long begin = System.currentTimeMillis();
        for (int n = 0; n < 3; n++) {
            WeatherForecast forecast = new WeatherForcastProcessorProxy();
            System.out.println(forecast.getWeather());

            int number = new Random().nextInt(100);
            if (number < 20) {
                System.out.println("Weather data has been refreshed.");
                forecast.refreshData();
            }

            System.out.println("Execution #" + n + " just finished");
        }

        long end = System.currentTimeMillis();
        System.out.println("The execution took: " + (end - begin) + " [ms]");
    }
}
