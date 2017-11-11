/**
 * 
 */
package com.blackari.talosdigital.weather.dao;

import java.util.List;
import java.util.Properties;

import com.blackari.talosdigital.weather.dto.WeatherDTO;

/**
 * @author User
 *
 */
public interface WeatherDAO {
	public List<WeatherDTO> getWeatherByCity(String city, String metricSystem);
	public Properties getMyProps();
	public void setMyProps(Properties myProps);

}
