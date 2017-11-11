/**
 * 
 */
package com.blackari.talosdigital.weather.dao.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import org.apache.commons.lang.StringEscapeUtils;
import org.springframework.web.client.RestTemplate;

import com.blackari.talosdigital.weather.dao.WeatherDAO;
import com.blackari.talosdigital.weather.dto.WeatherDTO;
import com.blackari.talosdigital.weather.model.OpenWeatherResponse;

/**
 * @author User
 *
 */
public class WeatherDAOImpl implements WeatherDAO {

	private final RestTemplate restTemplate = new RestTemplate();
	private Properties myProps;

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.blackari.talosdigital.weather.dao.WeatherDAO#getWeatherByCity(java.lang.
	 * String, java.lang.String)
	 */
	@Override
	public List<WeatherDTO> getWeatherByCity(String city, String metricSystem) {
		// String uri =
		// "http://api.openweathermap.org/data/2.5/find?q=london&units=metric&mode=json&appid=a343e1f460cc721d575c45cedf3bae8a";
		String uri = myProps.getProperty("uri");
		String appid = myProps.getProperty("apiKey");
		List<WeatherDTO> weatherList = new ArrayList<WeatherDTO>();
		Map<String, String> params = new HashMap<String, String>();
		params.put("city", StringEscapeUtils.escapeJavaScript(city));
		params.put("metric", StringEscapeUtils.escapeJavaScript(metricSystem));
		params.put("appid", appid);

		try {
		OpenWeatherResponse response = restTemplate.getForObject(uri, OpenWeatherResponse.class, params);
		
			for (com.blackari.talosdigital.weather.model.List weatherDetail : response.getList()) {
				WeatherDTO weatherDTO = new WeatherDTO();
				weatherDTO.setCityName(weatherDetail.getName());
				weatherDTO.setCountry(weatherDetail.getSys().getCountry());
				weatherDTO.setCurrentWeather(weatherDetail.getMain().getTemp());
				weatherDTO.setLatitude(weatherDetail.getCoord().getLat());
				weatherDTO.setLongitude(weatherDetail.getCoord().getLon());
				weatherDTO.setWindSpeed(weatherDetail.getWind().getSpeed());
				weatherList.add(weatherDTO);
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
		return weatherList;
	}

	/**
	 * @return the myProps
	 */
	public Properties getMyProps() {
		return myProps;
	}

	/**
	 * @param myProps
	 *            the myProps to set
	 */
	public void setMyProps(Properties myProps) {
		this.myProps = myProps;
	}

}
