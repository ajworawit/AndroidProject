package com.ajtum.actionbartabswipe;

import android.os.Bundle;
import android.app.ActionBar;
import android.app.Activity;
import android.app.ActionBar.Tab;
import android.app.FragmentTransaction;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v4.view.ViewPager.OnPageChangeListener;
import android.view.Menu;
import android.view.View;

public class MainActivity extends FragmentActivity implements ActionBar.TabListener {

	ViewPager pager;
	ActionBar actionBar;
	ViewPagerAdapter pagerAdapter;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		pager=(ViewPager)findViewById(R.id.pager);
		
		actionBar=getActionBar();
		actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);
		//actionBar.setHomeButtonEnabled(false);
		
		pagerAdapter = new ViewPagerAdapter(getSupportFragmentManager());
		
		pager.setAdapter(pagerAdapter);
		
		
        // สร้าง Tab พร้อมระบุชื่อเมนูให้กับ Tab
        Tab tabStudent=actionBar.newTab().setText("Student").setTabListener(this);
        Tab tabFaculty=actionBar.newTab().setText("Faculty").setTabListener(this);
        
        // เพิ่ม Tab ให้กับ Action Bar
        actionBar.addTab(tabStudent);
        actionBar.addTab(tabFaculty);
		
        // อีเวนต์ pager 
		pager.setOnPageChangeListener(new OnPageChangeListener() {
			
			@Override
			public void onPageSelected(int position) {
				// TODO Auto-generated method stub
				// 
				getActionBar().setSelectedNavigationItem(position);
			}
			
			@Override
			public void onPageScrolled(int arg0, float arg1, int arg2) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void onPageScrollStateChanged(int arg0) {
				// TODO Auto-generated method stub
				
			}
		});
		
		
		
	}

	@Override
	public void onTabReselected(Tab arg0, FragmentTransaction arg1) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTabSelected(Tab tab, FragmentTransaction arg1) {
		// TODO Auto-generated method stub
		pager.setCurrentItem(tab.getPosition());
	}

	@Override
	public void onTabUnselected(Tab arg0, FragmentTransaction arg1) {
		// TODO Auto-generated method stub
		
	}


}
