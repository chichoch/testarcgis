package com.arcgisreactnative;

import android.util.Log;

import com.esri.arcgisruntime.mapping.ArcGISMap;
import com.esri.arcgisruntime.mapping.Basemap;
import com.esri.arcgisruntime.mapping.view.MapView;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.ThemedReactContext;

public class ESRIMapViewManager extends SimpleViewManager<MapView> {
    public ESRIMapViewManager(ReactApplicationContext reactContext) {
    }

    @Override
    public String getName() {
        return "ESRIMapView";
    }

    @Override
    protected MapView createViewInstance(ThemedReactContext reactContext) {
        Log.i(getName(), "createViewInstance");

        MapView mapView = new MapView(reactContext); // TODO: or reactContext?
        createMap(mapView);
        return mapView;
    }

    private void createMap(MapView mapView) {
        Basemap.Type basemapType = Basemap.Type.STREETS_VECTOR;
        double latitude = 34.0270;
        double longitude = -118.8050;
        int levelOfDetail = 13;
        ArcGISMap map = new ArcGISMap(basemapType, latitude, longitude, levelOfDetail);
        
        mapView.setMap(map);
    }
}