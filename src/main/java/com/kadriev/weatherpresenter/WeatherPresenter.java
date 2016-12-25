package com.kadriev.weatherpresenter;

import com.github.fedy2.weather.data.Channel;
import org.springframework.stereotype.Component;

/**
 *
 * Created by Aqru on 25.12.2016.
 */
@Component
public interface WeatherPresenter {
    String presentWeather(Channel channel);
}
