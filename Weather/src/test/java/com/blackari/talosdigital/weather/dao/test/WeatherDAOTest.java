/**
 * 
 */
package com.blackari.talosdigital.weather.dao.test;

import java.util.List;
import java.util.Properties;

import com.blackari.talosdigital.weather.dao.WeatherDAO;
import com.blackari.talosdigital.weather.dao.impl.WeatherDAOImpl;
import com.blackari.talosdigital.weather.dto.WeatherDTO;

import junit.framework.Assert;
import junit.framework.TestCase;

/**
 * @author User
 *
 */
public class WeatherDAOTest extends TestCase {

	WeatherDAO weatherDao = new WeatherDAOImpl();
	
	/* (non-Javadoc)
	 * @see junit.framework.TestCase#setUp()
	 */
	protected void setUp() throws Exception {
		super.setUp();
		Properties myProps = new Properties();
		myProps.setProperty("uri", "http://api.openweathermap.org/data/2.5/find?q={city}&units={metric}&appid={appid}");
		myProps.setProperty("apiKey", "a343e1f460cc721d575c45cedf3bae8a");
		weatherDao.setMyProps(myProps );
	}

	/**
	 * Test method for {@link com.blackari.talosdigital.weather.dao.impl.CityDAOImpl#getCities()}.
	 */
	public final void testGetWeather() {
		List<WeatherDTO> weatherList = weatherDao.getWeatherByCity("London","Imperial");
		Assert.assertEquals(false, weatherList.isEmpty());
		WeatherDTO weather = weatherList.get(0);
		Assert.assertEquals(true, weather!=null);
		Assert.assertEquals("GB", weather.getCountry());
	}

}
