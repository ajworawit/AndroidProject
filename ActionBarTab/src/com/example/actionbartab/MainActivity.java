package com.example.actionbartab;

import java.util.ArrayList;
import java.util.List;
import android.os.Bundle;
import android.app.ActionBar;
import android.app.ActionBar.Tab;
import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentTransaction;
import android.content.Context;
import android.support.v4.view.ViewPager;
import android.support.v4.view.ViewPager.OnPageChangeListener;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.ListFragment;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Switch;
import android.widget.Toast;

public class MainActivity extends FragmentActivity  implements ActionBar.TabListener{

	private ActionBar actionbar;
	private Fragment fm_student = new Fragment_Student();
	private Fragment fm_faculty = new Fragement_Faculty();

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		// เรียกใช้ Action Bar
		actionbar=getActionBar();
		// ให้ Action Bar แสดงในรูปแบบของ Tab
        actionbar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);       
        
        // สร้าง Tab พร้อมระบุชื่อเมนูให้กับ Tab
        Tab tabStudent=actionbar.newTab().setText("Student").setTabListener(this);
        Tab tabFaculty=actionbar.newTab().setText("Faculty").setTabListener(this);
        
        // เพิ่ม Tab ให้กับ Action Bar
        actionbar.addTab(tabStudent);
        actionbar.addTab(tabFaculty);
        
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;

	}
	

	@Override
	public void onTabReselected(Tab tab, FragmentTransaction ft) {
		// TODO Auto-generated method stub
		 Toast.makeText(getApplicationContext(), "Reselected!", Toast.LENGTH_SHORT).show();
	}

	@Override
	public void onTabSelected(Tab tab, FragmentTransaction ft) {
		switch(tab.getPosition()){
		case 0 :
			 ft.replace(R.id.fragment_container, fm_student);
			 break;
		case 1 :
			 ft.replace(R.id.fragment_container, fm_faculty);
			 break;
		}
	}

	@Override
	public void onTabUnselected(Tab tab, FragmentTransaction ft) {
		Toast.makeText(getApplicationContext(), "Unselected!", Toast.LENGTH_SHORT).show();
	}
	

}




