/**
 * 
 */
package com.blackari.talosdigital.weather.managedBean;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import com.blackari.talosdigital.weather.dao.WeatherDAO;
import com.blackari.talosdigital.weather.dto.WeatherDTO;

/**
 * @author User
 *
 */
@ManagedBean
@ViewScoped
public class WeatherBean {

	private WeatherDAO weatherDAO;
	private WeatherDTO weather = new WeatherDTO();
	private List<WeatherDTO> weatherList = new ArrayList<WeatherDTO>();

	public void foundWeatherByCity() {
		try {
			weatherList = getWeatherDAO().getWeatherByCity(weather.getCityName(), weather.getUnit());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * @return the weather
	 */
	public WeatherDTO getWeather() {
		return weather;
	}

	/**
	 * @param weather
	 *            the weather to set
	 */
	public void setWeather(WeatherDTO weather) {
		this.weather = weather;
	}

	/**
	 * @return the weatherDAO
	 */
	public WeatherDAO getWeatherDAO() {
		return weatherDAO;
	}

	/**
	 * @param weatherDAO
	 *            the weatherDAO to set
	 */
	public void setWeatherDAO(WeatherDAO weatherDAO) {
		this.weatherDAO = weatherDAO;
	}

	/**
	 * @return the weatherList
	 */
	public List<WeatherDTO> getWeatherList() {
		return weatherList;
	}

	/**
	 * @param weatherList
	 *            the weatherList to set
	 */
	public void setWeatherList(List<WeatherDTO> weatherList) {
		this.weatherList = weatherList;
	}

}
