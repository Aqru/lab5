package com.kadriev.utils;

import com.kadriev.weatherfinder.WeatherFinder;
import com.kadriev.weatherfinder.WeatherFinderImpl;
import com.kadriev.weatherpresenter.WeatherPresenter;
import com.kadriev.weatherpresenter.WeatherPresenterImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 *
 * Created by Aqru on 25.12.2016.
 */
@Configuration
@ComponentScan(value = {"com.kadriev.weatherprinter", "com.kadriev.weatherfinder", "com.kadriev.weatherprinter"})
public class WConfiguration {

    @Bean // классы, управляемые spring'ом, должны быть описаны в конфиге
    public WeatherFinder getWeatherFinder() {
        return new WeatherFinderImpl();
    }

    @Bean
    public WeatherPresenter getWeatherPresenter() {
        return new WeatherPresenterImpl();
    }
}
