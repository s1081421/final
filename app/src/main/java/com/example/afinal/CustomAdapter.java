package com.example.afinal;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;
//np_complete的recyclerView
public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.ViewHolder> {
    //np_complete的標題
    private String[] localDataSet;
    //np_complete的內容數項
    /**
     * Provide a reference to the type of views that you are using
     * (custom ViewHolder).
     */
    public static class ViewHolder extends RecyclerView.ViewHolder {
        private final TextView textView1;

        public ViewHolder(View view) {
            super(view);
            // tell whether the view should be set up
            textView1 = (TextView) view.findViewById(R.id.NP_complete_recyler_title_view);

        }
    }

    /**
     * Initialize the dataset of the Adapter.
     *
     * @param dataSet String[] containing the data to populate views to be used
     * by RecyclerView.
     */
    public CustomAdapter(String[] dataSet) {
        // load in data
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
    public void onBindViewHolder(ViewHolder viewHolder, int position) {

        //binding textView and listener
        viewHolder.textView1.setText(localDataSet[position]);
        viewHolder.textView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // return data
                String[]detail=Database.return_np_complete_detail(position);
                //send data to MainActivity function(is for starting new intent)
                MainActivity.onColorItemSelected(view.getContext(),detail,viewHolder.textView1.getText().toString(),position,false);
            }
        });
    }

    // Return the size of your dataset (invoked by the layout manager)
    @Override
    public int getItemCount() {
        return localDataSet.length;
    }
}

