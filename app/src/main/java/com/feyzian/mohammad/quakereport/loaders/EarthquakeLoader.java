package com.feyzian.mohammad.quakereport.loaders;

import android.support.v4.content.AsyncTaskLoader;
import android.content.Context;

import com.feyzian.mohammad.quakereport.EarthquakeActivity;
import com.feyzian.mohammad.quakereport.data.Earthquake;
import com.feyzian.mohammad.quakereport.data.QueryUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Mohammad on 9/5/2016.
 */
public class EarthquakeLoader extends AsyncTaskLoader<List<Earthquake>> {

    public EarthquakeLoader(Context context) {
        super(context);
    }

    private String requestUrl = EarthquakeActivity.USGS_REQUEST_URL;

    @Override
    public ArrayList<Earthquake> loadInBackground() {
        if (requestUrl.equals(null)) {
            return null;
        }

        return QueryUtils.fetchEarthquakes(requestUrl);
    }
}
