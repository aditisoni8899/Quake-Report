package com.example.android.quakereport;

/**
 * Created by DELL STORE on 4/1/2017.
 */

public class Earthquake {
    /**magnitude of the earthquake**/
    private double mMagnitude;

    /**Locatin of the earthquake **/
    private String mLocation;

    /**date of the earthquake**/
    private long mTimeInMilliseconds ;
    /** Website URL of the earthquake */
    private String mUrl;

    /**
     * Constructs a new {@link Earthquake} object.
     *
     * @param magnitude is the magnitude (size) of the earthquake
     * @param location is the location where the earthquake happened
     * @param timeInMilliseconds is the time in milliseconds (from the Epoch) when the
     *                           earthquake happened
     * @param url is the website URL to find more details about the earthquake
     */
    public Earthquake(double magnitude, String location, long timeInMilliseconds, String url) {
        mMagnitude = magnitude;
        mLocation = location;
        mTimeInMilliseconds = timeInMilliseconds;
        mUrl = url;
    }
    /**
     * Get the magnitude of earthquake
     */
    public double getMagnitude() {
        return mMagnitude;
    }

    /**
     * Get the location of earthquake
     */
    public String getLocation() {
        return mLocation;
    }

    /**
     * Get the date of earthquake
     */
    public long getTimeInMilliseconds () {
        return mTimeInMilliseconds;
    }

    /**
     * Returns the website URL to find more information about the earthquake.
     */
    public String getUrl() {
        return mUrl;
    }
}
