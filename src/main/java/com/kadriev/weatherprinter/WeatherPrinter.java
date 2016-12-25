package com.kadriev.weatherprinter;

import com.kadriev.weatherfinder.WeatherFinder;
import com.kadriev.weatherpresenter.WeatherPresenter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 *
 * Created by Aqru on 25.12.2016.
 */
@Component  // аннотация для любого компонента
public class WeatherPrinter {
    private WeatherFinder weatherFinder;
    private WeatherPresenter weatherPresenter;

    public void printWeather() {
        String currentWeather = weatherPresenter.presentWeather(weatherFinder.findChannel());
        System.out.println(currentWeather);
    }


    @Autowired // отметка что поле требует автозап.
    public void setWeatherFinder(WeatherFinder weatherFinder) {
        this.weatherFinder = weatherFinder;
    }


    @Autowired
    public void setWeatherPresenter(WeatherPresenter weatherPresenter) {
        this.weatherPresenter = weatherPresenter;
    }
}