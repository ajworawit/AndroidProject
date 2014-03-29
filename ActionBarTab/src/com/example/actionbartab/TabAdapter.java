package com.example.actionbartab;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class TabAdapter extends FragmentPagerAdapter  {

	public TabAdapter(FragmentManager fm) {
        super(fm);
    }
 
    @Override
    public Fragment getItem(int index) {
 
//        switch (index) {
//        case 0:
//            // Top Rated fragment activity
//            return new fragment1();
//        case 1:
//            // Games fragment activity
//            return new fragment1();
//        case 2:
//            // Movies fragment activity
//            return new fragment1();
//        default:
//        	 return new fragment1();
//        }
    	return null;
 
    }
 
    @Override
    public int getCount() {
        // get item count - equal to number of tabs
        return 8;
    }



}
