
package com.blackari.talosdigital.weather.model;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "speed",
    "deg"
})
public class Wind implements Serializable
{

    @JsonProperty("speed")
    private Double speed;
    @JsonProperty("deg")
    private Double deg;
    @JsonProperty("gust")
    private Double gust;
    private final static long serialVersionUID = -5298197794629486658L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Wind() {
    }

    /**
     * 
     * @param speed
     * @param deg
     */
    public Wind(Double speed, Double deg) {
        super();
        this.speed = speed;
        this.deg = deg;
    }

    @JsonProperty("speed")
    public Double getSpeed() {
        return speed;
    }

    @JsonProperty("speed")
    public void setSpeed(Double speed) {
        this.speed = speed;
    }

    @JsonProperty("deg")
    public Double getDeg() {
        return deg;
    }

    @JsonProperty("deg")
    public void setDeg(Double deg) {
        this.deg = deg;
    }

    @JsonProperty("gust")
	public Double getGust() {
		return gust;
	}

    @JsonProperty("gust")
	public void setGust(Double gust) {
		this.gust = gust;
	}

}
