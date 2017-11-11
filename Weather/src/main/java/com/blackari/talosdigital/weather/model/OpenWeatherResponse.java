
package com.blackari.talosdigital.weather.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "message",
    "cod",
    "count",
    "list"
})
public class OpenWeatherResponse implements Serializable
{

    @JsonProperty("message")
    private String message;
    @JsonProperty("cod")
    private String cod;
    @JsonProperty("count")
    private Integer count;
    @JsonProperty("list")
    private java.util.List<com.blackari.talosdigital.weather.model.List> list = null;
    private final static long serialVersionUID = 8833187219792745666L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public OpenWeatherResponse() {
    }

    /**
     * 
     * @param message
     * @param count
     * @param cod
     * @param list
     */
    public OpenWeatherResponse(String message, String cod, Integer count, java.util.List<com.blackari.talosdigital.weather.model.List> list) {
        super();
        this.message = message;
        this.cod = cod;
        this.count = count;
        this.list = list;
    }

    @JsonProperty("message")
    public String getMessage() {
        return message;
    }

    @JsonProperty("message")
    public void setMessage(String message) {
        this.message = message;
    }

    @JsonProperty("cod")
    public String getCod() {
        return cod;
    }

    @JsonProperty("cod")
    public void setCod(String cod) {
        this.cod = cod;
    }

    @JsonProperty("count")
    public Integer getCount() {
        return count;
    }

    @JsonProperty("count")
    public void setCount(Integer count) {
        this.count = count;
    }

    @JsonProperty("list")
    public java.util.List<com.blackari.talosdigital.weather.model.List> getList() {
        return list;
    }

    @JsonProperty("list")
    public void setList(java.util.List<com.blackari.talosdigital.weather.model.List> list) {
        this.list = list;
    }

}
