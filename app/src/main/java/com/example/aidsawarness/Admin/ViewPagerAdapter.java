package com.example.aidsawarness.Admin;


import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class ViewPagerAdapter extends FragmentPagerAdapter {

    public ViewPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        Fragment fragment = null;
        if (position == 0) {
            fragment = new HomeTab();
        } else if (position == 1) {
            fragment = new AppSettings();
        } else if (position == 2) {
            fragment = new Account();
        }
        return fragment;
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        String title = null;
        if (position == 0) {
            title = "Home";
        } else if (position == 1) {
            title = "App Settings";
        } else if (position == 2) {
            title = "Account";
        }
        return title;
    }
}

