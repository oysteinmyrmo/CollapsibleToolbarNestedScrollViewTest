package com.oysteinmyrmo.test.collapsibletoolbarnestedscrollviewtest;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class YellowFragmentRecyclerViewAdapter extends RecyclerView.Adapter<YellowFragmentRecyclerViewAdapter.YellowViewHolder>
{
	private int mCount = 100;
	private String[] mTexts;

	public YellowFragmentRecyclerViewAdapter()
	{
		mTexts = new String[mCount];
		for (int i = 0; i < mCount; i++)
		{
			mTexts[i] = "foo " + i;
		}
	}

	public static class YellowViewHolder extends RecyclerView.ViewHolder
	{
		private TextView text;

		public YellowViewHolder(View v)
		{
			super(v);
			text = (TextView) v.findViewById(R.id.yellow_textview);
		}
	}

	@Override
	public YellowViewHolder onCreateViewHolder(ViewGroup parent, int viewType)
	{
		View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.yellow_fragment_item, parent, false);
		return new YellowViewHolder(v);
	}

	@Override
	public void onBindViewHolder(YellowViewHolder holder, int position)
	{
		holder.text.setText(mTexts[position]);
	}

	@Override
	public int getItemViewType(int position)
	{
		return 0;
	}

	@Override
	public int getItemCount()
	{
		return mCount;
	}
}
