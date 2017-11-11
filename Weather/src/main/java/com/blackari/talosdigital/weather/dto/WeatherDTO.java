/**
 * 
 */
package com.blackari.talosdigital.weather.dto;

/**
 * @author User
 *
 */
public class WeatherDTO {
	
	private String cityName;
	private String unit;
	private String country;
	private Double latitude;
	private Double longitude;
	private Double currentWeather;
	private Double windSpeed;
	
	public WeatherDTO() {
		super();
	}
	
	/**
	 * @return the cityName
	 */
	public String getCityName() {
		return cityName;
	}
	/**
	 * @param cityName the cityName to set
	 */
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	/**
	 * @return the unit
	 */
	public String getUnit() {
		return unit;
	}
	/**
	 * @param unit the unit to set
	 */
	public void setUnit(String unit) {
		this.unit = unit;
	}
	/**
	 * @return the country
	 */
	public String getCountry() {
		return country;
	}
	/**
	 * @param country the country to set
	 */
	public void setCountry(String country) {
		this.country = country;
	}
	/**
	 * @return the latitude
	 */
	public Double getLatitude() {
		return latitude;
	}
	/**
	 * @param latitude the latitude to set
	 */
	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}
	/**
	 * @return the longitude
	 */
	public Double getLongitude() {
		return longitude;
	}
	/**
	 * @param longitude the longitude to set
	 */
	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}
	/**
	 * @return the currentWeather
	 */
	public Double getCurrentWeather() {
		return currentWeather;
	}
	/**
	 * @param currentWeather the currentWeather to set
	 */
	public void setCurrentWeather(Double currentWeather) {
		this.currentWeather = currentWeather;
	}
	/**
	 * @return the windSpeed
	 */
	public Double getWindSpeed() {
		return windSpeed;
	}
	/**
	 * @param windSpeed the windSpeed to set
	 */
	public void setWindSpeed(Double windSpeed) {
		this.windSpeed = windSpeed;
	}
	

}
