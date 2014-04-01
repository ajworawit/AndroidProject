package com.ajtum.aroundrmu;

import com.ajtum.aroundrmu.ShowPlace.PlaceAdapter;
import com.ajtum.database.DatabaseConfig;
import com.ajtum.database.DatabaseHelper;
import com.ajtum.database.DatabaseManager;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class PlaceAllFragment extends Fragment {

	private Cursor cursor;
	private SQLiteDatabase db;
	private DatabaseConfig dbconfig;
	private DatabaseHelper dbHelper;
	private DatabaseManager manage;
	
	ListView  lv;
	
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {

		View rootView = inflater.inflate(R.layout.showplace_layout, container, false);
				
	      dbHelper=new DatabaseHelper(getActivity(),SQLiteDatabase.OPEN_READWRITE);
	      dbHelper.createDatabase();
	      db =  dbHelper.openDatabase();
	      
	     // String place[]={"_place_id,place_name"};
	      cursor=manage.getAllInTable(db, dbconfig.TABLE_Place, dbconfig.COLUMNS_Place);
	      
	      
	      
	      lv=(ListView)rootView.findViewById(R.id.lv_place);
	      
	      lv.setAdapter(new PlaceAdapter(getActivity()));
        
        lv.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,
					long arg3) {
				Intent intent=new Intent(getActivity(),ShowDetail.class);
				startActivity(intent);
			}
		});
		
		
		return rootView;
	}
	
	
	// Adapter
		class PlaceAdapter extends BaseAdapter{
			
			private LayoutInflater inflater;
			private Activity context;
			public PlaceAdapter(Activity ct){
				context=ct;
				inflater = context.getLayoutInflater();
			}
			
			@Override
			public int getCount() {
				// TODO Auto-generated method stub
				if(cursor==null) return 0;
				return cursor.getCount();
			}

			@Override
			public Object getItem(int position) {
				// TODO Auto-generated method stub
				return position;
			}

			@Override
			public long getItemId(int position) {
				// TODO Auto-generated method stub
				return position;
			}

			@Override
			public View getView(int position, View convertView, ViewGroup arg2) {
				// TODO Auto-generated method stub
				
				if(convertView==null){
					convertView = inflater.inflate(R.layout.showplace_item, null);
				}
				
				ImageView imgLogo=(ImageView)convertView.findViewById(R.id.imgLogo);
				TextView txtName = (TextView)convertView.findViewById(R.id.txtName);
				
				if(cursor.getCount()>0){
		    		cursor.moveToPosition(position);
		    		String name = cursor.getString(1);
		    		txtName.setText(name);
				}
				
				
				
				return convertView;
			}
			
		}// class adapter
	
	
	
	
	
	
	
	
}
