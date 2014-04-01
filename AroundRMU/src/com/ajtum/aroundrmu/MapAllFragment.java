package com.ajtum.aroundrmu;

import android.app.Activity;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

import com.google.android.gms.maps.CameraUpdate;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.GoogleMap.OnMyLocationChangeListener;
import com.google.android.gms.maps.LocationSource;
import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.PolylineOptions;

public class MapAllFragment extends Fragment  {

	MapAllClass mapall;
	public static final int DIALOG_DOWNLOAD_XML_PROGRESS = 0;
	private ProgressDialog mProgressDialog;
	private Activity activity;
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		
		View rootView = inflater.inflate(R.layout.map, container, false);
		activity=getActivity();
		
		
		
		activity.setProgressBarIndeterminateVisibility(true); 
	    // Syn XML 	
		new DownloadXMLFileAsync().execute();
		

	
		
		
//		mapall=new MapAllClass(getActivity());
//
//		ImageButton btnType1=(ImageButton)rootView.findViewById(R.id.btnType1);
//		ImageButton btnType2=(ImageButton)rootView.findViewById(R.id.btnType2);
//		ImageButton btnType3=(ImageButton)rootView.findViewById(R.id.btnType3);
//		
//		btnType1.setOnClickListener(new OnClickListener() {
//			@Override
//			public void onClick(View v) {
//				// TODO Auto-generated method stub
//				Toast.makeText(getActivity(), "MAP_TYPE_HYBRID", Toast.LENGTH_LONG).show();
//				mapall.myMap.setMapType(GoogleMap.MAP_TYPE_HYBRID);
//			}
//		}); 
//		
//		btnType2.setOnClickListener(new OnClickListener() {
//			@Override
//			public void onClick(View v) {
//				// TODO Auto-generated method stub
//				Toast.makeText(getActivity(), "MAP_TYPE_SATELLITE", Toast.LENGTH_LONG).show();
//				mapall.myMap.setMapType(GoogleMap.MAP_TYPE_SATELLITE);
//			}
//		});
//		
//		btnType3.setOnClickListener(new OnClickListener() {
//			@Override
//			public void onClick(View v) {
//				// TODO Auto-generated method stub
//				Toast.makeText(getActivity(), "MAP_TYPE_TERRAIN", Toast.LENGTH_LONG).show();
//				mapall.myMap.setMapType(GoogleMap.MAP_TYPE_TERRAIN);
//			}
//		});
		
		
		
		
		return rootView;
	}
	
	
	// dialog context
//	private Fragment getDialogContext() {
//	    Fragment context;
//	    if (getParentFragment() != null) context = getParentFragment();
//	    else context = this;
//	    return context;
//	}
	
	
	// Dialog 
	protected Dialog onCreateDialog(int id) {
        switch (id) {
        case DIALOG_DOWNLOAD_XML_PROGRESS:
            mProgressDialog = new ProgressDialog(getActivity());
            mProgressDialog.setMessage("Download...");
            mProgressDialog.setProgressStyle(ProgressDialog.STYLE_SPINNER);
            mProgressDialog.setCancelable(true);
            mProgressDialog.show();
            return mProgressDialog;
        default:
            return null;
        }
    }
    
    
    
    
    
	
	// Class Download Data in Background
	public class DownloadXMLFileAsync extends AsyncTask<String, Void, Void> {

	    	
	        protected void onPreExecute() {
	         	super.onPreExecute();
	         	activity.showDialog(DIALOG_DOWNLOAD_XML_PROGRESS);
	         }
	    	
			@Override
			protected Void doInBackground(String... params) {
				// TODO Auto-generated method stub
				//getxmlParser();
				return null;
			}
	        
	        @Override
	        protected void onPostExecute(Void result) {
	        	
	        	mapall=new MapAllClass(getActivity());
	        	
	        	//activity.dismissDialog(DIALOG_DOWNLOAD_XML_PROGRESS);
	        	//activity.removeDialog(DIALOG_DOWNLOAD_XML_PROGRESS);
	        }

	    	
	    }// class DownloadXMLFileAsync
	

}
