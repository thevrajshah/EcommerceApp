package edu.android.ecommerceapp.bottomNav.profile;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

import edu.android.ecommerceapp.R;


public class ProfileAdapter extends BaseAdapter {
    private static final String TAG = "ProfileAdapter";
    Context context;
    private String[] settingItems;

    public ProfileAdapter(Context context, String[] settingItems) {
        this.context = context;
        this.settingItems = settingItems;
    }

    @Override
    public int getCount() {
        Log.d(TAG, "getCount: " + settingItems.length);
        return settingItems.length;
    }

    @Override
    public Object getItem(int position) {
        return settingItems[position];
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Log.d(TAG, "getView: " + position);
        if(convertView == null) {
            convertView = LayoutInflater.from(context).inflate(R.layout.profile_item, parent, false);
        }

        ((TextView) convertView.findViewById(R.id.item_title)).setText(((CharSequence) getItem(position)));
        return convertView;
    }
}
