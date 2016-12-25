package com.kadriev.weatherpresenter;

import com.github.fedy2.weather.data.Channel;

/**
 *
 * Created by Aqru on 25.12.2016.
 */
public class WeatherPresenterImpl implements WeatherPresenter {
    public String presentWeather(Channel channel) {
        return  "Current temperature in " + channel.getLocation().getCity() +
                " is " + channel.getItem().getCondition().getTemp() + " °C";
    }
}

