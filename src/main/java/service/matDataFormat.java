package main.java.service;

import java.util.Date;

/**
 * Created by nickd on 1/20/2017.
 */
public class matDataFormat
{
    int currentPopulation;
    Date lastUpdate;


    String locationName;
    int zipCode;
    String streetAddress;
    String locationType;
    String city;
    String state;

    public void matDataFormat()
    {
        setCurrentPopulation(100);
        setLastUpdate(new Date());
        setLocationName("Ambler Recreation Center");
        setZipCode(66044);
        setStreetAddress("");
    }

    public int getCurrentPopulation() {
        return currentPopulation;
    }

    public Date getLastUpdate() {
        return lastUpdate;
    }
    
    public String getLocationName()
    {
    	return locationName;
    }
    
    public int getZipcode()
    {
    	return zipCode;
    }
    
    public String getStreetAddress()
    {
    	return streetAddress;
    }
    
    public String getLocationType()
    {
    	return locationType;
    }
    
    public String getCity()
    {
    	return city;
    }
    
    public String getState()
    {
    	return state;
    }

    public void setCurrentPopulation(int currentPopulation) {
        this.currentPopulation = currentPopulation;
    }

    public void setLastUpdate(Date lastUpdate) {
        this.lastUpdate = lastUpdate;
    }
    
    public void setLocationName(String locationName)
    {
    	this.locationName = locationName;
    }
    
    public void setZipCode(int zipCode)
    {
    	this.zipCode = zipCode;
    }
    
    public void setStreetAddress(String streetAddress)
    {
    	this.streetAddress = streetAddress;
    }
    
    public void setLocationType(String locationType)
    {
    	this.locationType = locationType;
    }
    
    public void setCity(String city)
    {
    	this.city = city;
    }
    
    public void setState(String state)
    {
    	this.state = state;
    }
}
