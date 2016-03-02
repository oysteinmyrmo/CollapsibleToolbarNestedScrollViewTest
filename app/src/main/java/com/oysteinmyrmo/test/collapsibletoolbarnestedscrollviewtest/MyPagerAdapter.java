package com.oysteinmyrmo.test.collapsibletoolbarnestedscrollviewtest;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class MyPagerAdapter extends FragmentStatePagerAdapter
{
	public MyPagerAdapter(FragmentManager fragmentManager)
	{
		super(fragmentManager);
	}

	@Override
	public Fragment getItem(int position)
	{
		switch (position)
		{
			case 0:
				return PinkFragment.newInstance();
			case 1:
				return YellowFragment.newInstance();
			case 2:
				return GreenFragment.newInstance();
			default:
				return null;
		}
	}

	@Override
	public int getCount()
	{
		return 3;
	}

	@Override
	public CharSequence getPageTitle(int position)
	{
		switch (position)
		{
			case 0:
				return "Pink";

			case 1:
				return "Yellow";

			case 2:
				return "Green";

			default:
				return "Tab";
		}
	}
}
