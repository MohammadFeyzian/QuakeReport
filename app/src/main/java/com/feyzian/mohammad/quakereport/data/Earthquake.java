package com.feyzian.mohammad.quakereport.data;

/**
 * Created by Mohammad on 9/1/2016.
 * object for an item
 */
public class Earthquake {

    private double mMagnitude;
    private String mLocation;
    private long mTimeInMilliseconds;

    /** Website URL of the earthquake */
    private String mUrl;

    /**
     * Constructs a new {@link Earthquake} object.
     *
     * @param magnitude is the magnitude (size) of the earthquake
     * @param location is the city location of the earthquake
     * @param timeInMilliseconds is the time in milliseconds (from the Epoch) when the
     *                           earthquake happened
     */

    public Earthquake(double magnitude, String location, long timeInMilliseconds, String url){

        mMagnitude = magnitude;
        mLocation = location;
        mTimeInMilliseconds = timeInMilliseconds;
        mUrl = url;
    }

    /**
     * Returns the magnitude of the earthquake.
     */
    public double getMagnitude(){
        return mMagnitude;
    }

    /**
     * Returns the location of the earthquake.
     */
    public String getLocation(){
        return mLocation;
    }

    /**
     * Returns the time of the earthquake.
     */
    public long getTimeInMilliseconds(){
        return mTimeInMilliseconds;
    }

    /**
     * Returns the website URL to find more information about the earthquake.
     */
    public String getUrl() {
        return mUrl;
    }
}
