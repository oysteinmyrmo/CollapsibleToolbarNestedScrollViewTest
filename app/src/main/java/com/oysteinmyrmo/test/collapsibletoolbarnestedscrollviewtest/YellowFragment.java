package com.oysteinmyrmo.test.collapsibletoolbarnestedscrollviewtest;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class YellowFragment extends Fragment
{
	public static YellowFragment newInstance()
	{
		return new YellowFragment();
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
		View rootView = inflater.inflate(R.layout.yellow_fragment, container, false);

		RecyclerView recyclerView = (RecyclerView) rootView.findViewById(R.id.yellow_recyclerview);
		recyclerView.setAdapter(new YellowFragmentRecyclerViewAdapter());
		recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

		return rootView;
	}
}
