package com.ajtum.aroundrmu;

import java.util.ArrayList;

import org.w3c.dom.Document;

import com.google.android.gms.maps.CameraUpdate;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.LocationSource;
import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.GoogleMap.OnMyLocationChangeListener;
import com.google.android.gms.maps.LocationSource.OnLocationChangedListener;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.PolylineOptions;

import android.app.Activity;
import android.graphics.Color;
import android.location.Criteria;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.os.StrictMode;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class MapAllClass extends FragmentActivity implements LocationSource,LocationListener,OnMyLocationChangeListener {

	public static GoogleMap myMap;
	GMapV2Direction md;
	LocationManager locationManager;
	private OnLocationChangedListener mListener;
	
	
	LatLng fromPosition;
	LatLng toPosition = new LatLng(16.196769,103.272696);
	
	LatLng position1 = new LatLng(16.194909,103.273543);
	LatLng position2 = new LatLng(16.194919,103.274413);
	LatLng position3 = new LatLng(16.196769,103.272696);
	LatLng position4 = new LatLng(16.196856,103.273533);
	LatLng position5 = new LatLng(16.196789,103.275373);
	LatLng position6 = new LatLng(16.196511,103.275373);
	LatLng position7 = new LatLng(16.19646,103.272669);
	LatLng position8 = new LatLng(16.198124,103.272809);
	LatLng position9 = new LatLng(16.196403,103.276258);
	LatLng position10 = new LatLng(16.197454,103.275609);
	LatLng position11 = new LatLng(16.19784,103.272851);
	LatLng position12 = new LatLng(16.19663,103.271591);
	LatLng position13 = new LatLng(16.195672,103.271559);
	LatLng position14 = new LatLng(16.196331,103.271226);
	LatLng position15 = new LatLng(16.200771,103.270674);
	LatLng position16 = new LatLng(16.19579,103.272074);
	
	private Activity activity;
	
	// Constructor
	public MapAllClass(Activity act){
		activity=act;
		
		initil();
		

		
		
	}
	

	public void initil(){
		
		md=new GMapV2Direction();
		initilizeMap();
		
		if (android.os.Build.VERSION.SDK_INT > 9) {
            StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
            StrictMode.setThreadPolicy(policy);
        }
		
		
		

		
	 	locationManager=(LocationManager)activity.getSystemService(LOCATION_SERVICE);

	  	Criteria criteria = new Criteria();
	  	
        String provider = locationManager.getBestProvider(criteria, true);
        // Getting Current Location
        Location location = locationManager.getLastKnownLocation(provider);
		String lat=Double.toString(location.getLatitude());
		String lon=Double.toString(location.getLongitude());

		fromPosition=new LatLng(16.200097, 103.272503);
		
		Toast.makeText(activity, "lat :"+fromPosition.latitude+" long:"+fromPosition.longitude, Toast.LENGTH_SHORT).show();

		LatLng coordinates = new LatLng(13.685400079263206, 100.537133384495975);		
		
		
		myMap.animateCamera(CameraUpdateFactory.newLatLngZoom(fromPosition, 15));
		
		myMap.addMarker(new MarkerOptions().position(fromPosition).title("Start")
				.icon(BitmapDescriptorFactory.fromResource(R.drawable.marker1_1)));
		myMap.addMarker(new MarkerOptions().position(toPosition).title("End")
				.icon(BitmapDescriptorFactory.fromResource(R.drawable.marker2_2)));

		
		myMap.addMarker(new MarkerOptions().position(position1).title("End")
		.icon(BitmapDescriptorFactory.fromResource(R.drawable.marker2_2)));
myMap.addMarker(new MarkerOptions().position(position2).title("End")
		.icon(BitmapDescriptorFactory.fromResource(R.drawable.marker2_2)));
myMap.addMarker(new MarkerOptions().position(position3).title("End")
		.icon(BitmapDescriptorFactory.fromResource(R.drawable.marker2_2)));

myMap.addMarker(new MarkerOptions().position(position4).title("End")
		.icon(BitmapDescriptorFactory.fromResource(R.drawable.marker2_2)));
myMap.addMarker(new MarkerOptions().position(position5).title("End")
		.icon(BitmapDescriptorFactory.fromResource(R.drawable.marker2_2)));
myMap.addMarker(new MarkerOptions().position(position6).title("End")
		.icon(BitmapDescriptorFactory.fromResource(R.drawable.marker2_2)));


myMap.addMarker(new MarkerOptions().position(position7).title("End")
		.icon(BitmapDescriptorFactory.fromResource(R.drawable.marker2_2)));
myMap.addMarker(new MarkerOptions().position(position8).title("End")
		.icon(BitmapDescriptorFactory.fromResource(R.drawable.marker2_2)));
myMap.addMarker(new MarkerOptions().position(position9).title("End")
		.icon(BitmapDescriptorFactory.fromResource(R.drawable.marker2_2)));

myMap.addMarker(new MarkerOptions().position(position10).title("End")
		.icon(BitmapDescriptorFactory.fromResource(R.drawable.marker2_2)));
myMap.addMarker(new MarkerOptions().position(position11).title("End")
		.icon(BitmapDescriptorFactory.fromResource(R.drawable.marker2_2)));
myMap.addMarker(new MarkerOptions().position(position12).title("End")
		.icon(BitmapDescriptorFactory.fromResource(R.drawable.marker2_2)));

myMap.addMarker(new MarkerOptions().position(position13).title("End")
		.icon(BitmapDescriptorFactory.fromResource(R.drawable.marker2_2)));
myMap.addMarker(new MarkerOptions().position(position4).title("End")
		.icon(BitmapDescriptorFactory.fromResource(R.drawable.marker2_2)));
myMap.addMarker(new MarkerOptions().position(position15).title("End")
		.icon(BitmapDescriptorFactory.fromResource(R.drawable.marker2_2)));

myMap.addMarker(new MarkerOptions().position(position16).title("End")
		.icon(BitmapDescriptorFactory.fromResource(R.drawable.marker2_2)));

		
		Document doc = md.getDocument(fromPosition, toPosition, GMapV2Direction.MODE_DRIVING);

        ArrayList<LatLng> directionPoint = md.getDirection(doc);
        PolylineOptions rectLine = new PolylineOptions().width(3).color(Color.RED);
        
        for(int i = 0 ; i < directionPoint.size() ; i++) {            
            rectLine.add(directionPoint.get(i));
        }
        
        myMap.addPolyline(rectLine);
        
        
	}
	
	// map
    private void initilizeMap() {
        if (myMap == null) {
            myMap = ((MapFragment)activity.getFragmentManager().findFragmentById(
                    R.id.mapv2)).getMap();
            
            
            myMap.setMapType(GoogleMap.MAP_TYPE_NORMAL);
            
//            // disable button zoom
//            myMap.getUiSettings().setZoomControlsEnabled(false); 
//            // disable gestures zoom
//            myMap.getUiSettings().setZoomGesturesEnabled(false);
//            // disable button location
//            myMap.getUiSettings().setMyLocationButtonEnabled(false);
            
            
//            myMap.getUiSettings().setCompassEnabled(false);
//            myMap.getUiSettings().setRotateGesturesEnabled(false);
 
            // check if map is created successfully or not
            if (myMap == null) {
                Toast.makeText(getApplicationContext(),
                        "Sorry! unable to create maps", Toast.LENGTH_SHORT)
                        .show();
            }
        }
        if (myMap != null) 
        {
        	myMap.setMyLocationEnabled(true);
        }
        
        
    }


    
    
     
    @Override
   public void onMyLocationChange(Location lastKnownLocation) {
        CameraUpdate myLoc = CameraUpdateFactory.newCameraPosition(
                new CameraPosition.Builder().target(new LatLng(lastKnownLocation.getLatitude(),
                        lastKnownLocation.getLongitude())).zoom(15).build());
        myMap.moveCamera(myLoc);
        myMap.setOnMyLocationChangeListener(null);
    }
    
    
    
    
    
    @Override
    public void onPause()
    {
        if(locationManager != null)
        {
            locationManager.removeUpdates(this);
        }

        super.onPause();
    }
     
    @Override
    public void onResume()
    {
    	   super.onResume();

    	   initilizeMap();

    	    if(locationManager != null)
    	    {
    	        myMap.setMyLocationEnabled(true);
    	    }
    }
    

	@Override
	public void onLocationChanged(Location location) {

	    if( mListener != null )
	    {
	        mListener.onLocationChanged( location );

	        //Move the camera to the user's location once it's available!
	        myMap.animateCamera(CameraUpdateFactory.newLatLng(new LatLng(location.getLatitude(), location.getLongitude())));
	    }
	    
		Toast.makeText(activity, "lat :"+location.getLatitude()+" long:"+location.getLongitude(), Toast.LENGTH_SHORT).show();
	}

	@Override
	public void onProviderDisabled(String provider) {
		// TODO Auto-generated method stub
		 Toast.makeText(activity, "provider disabled", Toast.LENGTH_SHORT).show();
		
	}

	@Override
	public void onProviderEnabled(String provider) {
		// TODO Auto-generated method stub
		 Toast.makeText(activity, "provider enabled", Toast.LENGTH_SHORT).show();
	}

	@Override
	public void onStatusChanged(String provider, int status, Bundle extras) {
		// TODO Auto-generated method stub
		 Toast.makeText(activity, "status changed", Toast.LENGTH_SHORT).show();
	}

	
	@Override
	public void activate(OnLocationChangedListener listener) {
		// TODO Auto-generated method stub
		mListener = listener;
	}

	@Override
	public void deactivate() {
		// TODO Auto-generated method stub
		mListener = null;
	}

    
}
