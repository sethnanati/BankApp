package com.ubank.bankagent.Activities;

/**
 * Created by ravi on 3/8/2017.
 */

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;

import com.ubank.bankagent.R;


public class BaseActivity extends AppCompatActivity {

    DrawerLayout drawerLayout;
    ActionBarDrawerToggle actionBarDrawerToggle;
    Toolbar toolbar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_base);
        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);


        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        drawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        actionBarDrawerToggle = new ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawerLayout.setDrawerListener(actionBarDrawerToggle);

        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(MenuItem item) {
                final String appPackageName = getPackageName();

                switch (item.getItemId()) {

                    case R.id.nav_dashboard:
                        Intent dash = new Intent(getApplicationContext(), MainActivity.class);
                        startActivity(dash);
//                        finish();
                        drawerLayout.closeDrawers();
                        break;


                    case R.id.nav_about_us:
                        Intent anIntent = new Intent(getApplicationContext(), AboutUS.class);
                        startActivity(anIntent);
//                        finish();
                        drawerLayout.closeDrawers();
                        break;

                    case R.id.nav_balance:
                        Intent bal = new Intent(getApplicationContext(), BalanceActivity.class);
                        startActivity(bal);
//                        finish();
                        drawerLayout.closeDrawers();
                        break;

                    case R.id.nav_cashin:
                        Intent cashin = new Intent(getApplicationContext(), CashIn.class);
                        startActivity(cashin);
//                        finish();
                        drawerLayout.closeDrawers();
                        break;

                    case R.id.nav_cashout:
                        Intent cashout = new Intent(getApplicationContext(), CashOut.class);
                        startActivity(cashout);
//                        finish();
                        drawerLayout.closeDrawers();
                        break;

                    case R.id.nav_enquiries:
                        Intent enquiries = new Intent(getApplicationContext(), Enquiries.class);
                        startActivity(enquiries);
//                        finish();
                        drawerLayout.closeDrawers();
                        break;
                    case R.id.nav_onboard:
                        Intent onboard = new Intent(getApplicationContext(), Onboard.class);
                        startActivity(onboard);
//                        finish();
                        drawerLayout.closeDrawers();
                        break;

                    case R.id.nav_contactus:
                        Intent contactus = new Intent(getApplicationContext(), ContactUs.class);
                        startActivity(contactus);
//                        finish();
                        drawerLayout.closeDrawers();
                        break;

                    case R.id.nav_faq:
                        Intent faq = new Intent(getApplicationContext(), Faq.class);
                        startActivity(faq);
//                        finish();
                        drawerLayout.closeDrawers();
                        break;


                }
                return false;
            }
        });

    }

    @Override
    protected void onPostCreate(Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);

        actionBarDrawerToggle.syncState();
    }

    @Override
    public void finish() {
        super.finish();
        overridePendingTransitionExit();
    }

    @Override
    public void startActivity(Intent intent) {
        super.startActivity(intent);
        overridePendingTransitionEnter();
    }

    /**
     * Overrides the pending Activity transition by performing the "Enter" animation.
     */
    protected void overridePendingTransitionEnter() {
        overridePendingTransition(R.anim.slide_from_right, R.anim.slide_to_left);
    }

    /**
     * Overrides the pending Activity transition by performing the "Exit" animation.
     */
    protected void overridePendingTransitionExit() {
        overridePendingTransition(R.anim.slide_from_left, R.anim.slide_to_right);
    }
}