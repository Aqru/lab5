package com.kadriev;

import com.kadriev.utils.WConfiguration;
import com.kadriev.weatherprinter.WeatherPrinter;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author Chernyshov Daniil
 */
public class Weather {
    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(WConfiguration.class);
        WeatherPrinter weatherPrinter = ctx.getBean(WeatherPrinter.class);
        weatherPrinter.printWeather();
    }
}