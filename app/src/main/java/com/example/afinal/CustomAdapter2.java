package com.example.afinal;


import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

//np_hard 的recycleView
public class CustomAdapter2 extends RecyclerView.Adapter<CustomAdapter2.ViewHolder> {
    //np_hard的標題
    private String[] localDataSet;
    //np_hard的內容數項
    Activity activity;
    /**
     * Provide a reference to the type of views that you are using
     * (custom ViewHolder).
     */

    public static class ViewHolder extends RecyclerView.ViewHolder {
        private final TextView textView1;
        public ViewHolder(View view) {
            super(view);
            // Define click listener for the ViewHolder's View

            textView1 = (TextView) view.findViewById(R.id.NP_complete_recyler_title_view);
        }
    }

    /**
     * Initialize the dataset of the Adapter.
     *
     * @param dataSet String[] containing the data to populate views to be used
     * by RecyclerView.
     */
    public CustomAdapter2(String[] dataSet) {
        localDataSet = dataSet;

    }

    // Create new views (invoked by the layout manager)
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        // Create a new view, which defines the UI of the list item
        View view = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.recyclerview_set, viewGroup, false);

        return new ViewHolder(view);
    }

    // Replace the contents of a view (invoked by the layout manager)
    @Override
    public void onBindViewHolder(ViewHolder viewHolder, final int position) {

        // Get element from your dataset at this position and replace the
        // contents of the view with that element
        viewHolder.textView1.setText(localDataSet[position]);
        viewHolder.textView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String[]detail=Database.return_np_hard_detail(position);
                MainActivity.onColorItemSelected(view.getContext(),detail,viewHolder.textView1.getText().toString(),position,true);
            }
        });
    }


    // Return the size of your dataset (invoked by the layout manager)
    @Override
    public int getItemCount() {
        return localDataSet.length;
    }
}

