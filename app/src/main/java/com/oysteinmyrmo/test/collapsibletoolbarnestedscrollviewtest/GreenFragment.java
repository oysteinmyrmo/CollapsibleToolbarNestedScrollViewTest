package com.oysteinmyrmo.test.collapsibletoolbarnestedscrollviewtest;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class GreenFragment extends Fragment
{
	public static GreenFragment newInstance()
	{
		return new GreenFragment();
	}

	@Override
	public void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
	}

	@Nullable
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
	{
		return inflater.inflate(R.layout.green_fragment, container, false);
	}
}
