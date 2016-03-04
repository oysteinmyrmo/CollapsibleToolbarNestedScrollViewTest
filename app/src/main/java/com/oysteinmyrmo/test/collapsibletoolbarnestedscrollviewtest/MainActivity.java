package com.oysteinmyrmo.test.collapsibletoolbarnestedscrollviewtest;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

public class MainActivity extends AppCompatActivity
{
	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
		setSupportActionBar(toolbar);

		ViewPager viewPager = (ViewPager) findViewById(R.id.viewpager);
		MyPagerAdapter myPagerAdapter = new MyPagerAdapter(getSupportFragmentManager());
		viewPager.setAdapter(myPagerAdapter);
		viewPager.setOffscreenPageLimit(2);
		viewPager.setCurrentItem(0);

		TabLayout tabLayout = (TabLayout) findViewById(R.id.tablayout);
		tabLayout.setupWithViewPager(viewPager);
	}
}
