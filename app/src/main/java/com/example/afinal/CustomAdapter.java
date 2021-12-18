package com.example.afinal;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.ViewHolder> {
    //np_complete的標題
    private String[] localDataSet;
    //np_complete的內容數項
    private String[][]NP_complete_list;
    /**
     * Provide a reference to the type of views that you are using
     * (custom ViewHolder).
     */
    public static class ViewHolder extends RecyclerView.ViewHolder {
        private final TextView textView1;
        private final TextView textView2;
        private final TextView textView3;
        public ViewHolder(View view) {
            super(view);
            // Define click listener for the ViewHolder's View
            textView1 = (TextView) view.findViewById(R.id.NP_complete_recyler_title_view);
            textView2 = (TextView) view.findViewById(R.id.np_complete_list_view1);
            textView3 = (TextView) view.findViewById(R.id.np_complete_list_view2);

        }
    }

    /**
     * Initialize the dataset of the Adapter.
     *
     * @param dataSet String[] containing the data to populate views to be used
     * by RecyclerView.
     */
    public CustomAdapter(String[] dataSet,String[][]dataSet2) {
        localDataSet = dataSet;
        NP_complete_list=dataSet2;
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
        viewHolder.textView2.setText(NP_complete_list[position][0]);
        viewHolder.textView3.setText(NP_complete_list[position][1]);
        viewHolder.textView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String[]detail=Database.return_np_complete_detail(position);
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

