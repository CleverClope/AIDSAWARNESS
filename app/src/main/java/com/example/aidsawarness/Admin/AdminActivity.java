package com.example.aidsawarness.Admin;

import android.app.SearchManager;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.ViewPager;

import com.example.aidsawarness.R;
import com.example.aidsawarness.hospitals.MainActivity;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.tabs.TabLayout;

public class AdminActivity extends AppCompatActivity implements SearchView.OnQueryTextListener, View.OnClickListener {
    TabLayout tabLayout;
    ViewPager viewPager;
    ViewPagerAdapter viewPagerAdapter;
    private SearchView searchView;
    private MenuItem searchMenuItem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });


        tabLayout = findViewById(R.id.tabs);
        viewPager = findViewById(R.id.viewPager);
        viewPagerAdapter = new ViewPagerAdapter(getSupportFragmentManager());
        viewPager.setAdapter(viewPagerAdapter);
        tabLayout.setupWithViewPager(viewPager);

        View card1 = findViewById(R.id.addcounselor);


        View card2 = findViewById(R.id.addhospital);



    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {

            case R.id.addcounselor:
                Intent intent = new Intent(AdminActivity.this, AddCounselor.class);
                startActivity(intent);
                break;
            case R.id.addhospital:
                Intent i = new Intent(AdminActivity.this, MainActivity.class);
                startActivity(i);

                break;

        }
    }




    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.menu_main, menu);
        SearchManager searchManager = (SearchManager)
                getSystemService(Context.SEARCH_SERVICE);
        searchMenuItem = menu.findItem(R.id.action_search);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.HONEYCOMB) {
            searchView = (SearchView) searchMenuItem.getActionView();
        }

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.FROYO) {
            searchView.setSearchableInfo(searchManager.
                    getSearchableInfo(getComponentName()));
        }
        searchView.setSubmitButtonEnabled(true);
        searchView.setOnQueryTextListener(this);

        return super.onCreateOptionsMenu(menu);
    }


    @Override
    public boolean onQueryTextSubmit(String query) {
        return false;
    }

    @Override
    public boolean onQueryTextChange(String newText) {
        // viewPagerAdapter.getFilter().filter(newText);
        return false;
    }

    public void addcounselor(MenuItem item) {
        Intent intent = new Intent(AdminActivity.this, AddCounselor.class);
        startActivity(intent);
    }

    public void logout(MenuItem item) {

    }

    public void onBackPressed() {
        finish();
    }


    public void addhospital(View view) {
        Intent intent = new Intent(AdminActivity.this, AddHospital.class);
        startActivity(intent);
    }

    public void addcounselor(View view) {
        Intent intent = new Intent(AdminActivity.this, AddCounselor.class);
        startActivity(intent);

    }
}