package com.example.sanabelalkhayr.adapters.admin;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.navigation.NavController;
import androidx.recyclerview.widget.RecyclerView;

import com.example.sanabelalkhayr.R;
import com.example.sanabelalkhayr.model.CharitableEvent;

import java.util.ArrayList;
import java.util.List;

public class EventsListAdapter extends RecyclerView.Adapter<EventsListAdapter.ViewHolder> {


    Context context;
    private List<CharitableEvent> events;
    public NavController navController;

    // RecyclerView recyclerView;
    public EventsListAdapter(Context context, ArrayList<CharitableEvent> events) {
        this.context = context;
        this.events = events;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View listItem = layoutInflater.inflate(R.layout.item_admin_event, parent, false);

        return new ViewHolder(listItem);
    }


    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        CharitableEvent event = events.get(position);

        holder.address.setText(event.getAddress());

        holder.description.setText(event.getDescription());

        holder.start_at.setText(event.getStart_at());
        holder.end_at.setText(event.getEnd_at());


        holder.delete.setOnClickListener(v -> {
            deleteEvent(event);
        });


    }

    private void deleteEvent(CharitableEvent event) {

    }

    @Override
    public int getItemCount() {
        return events.size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder {

        public TextView address;
        public TextView description;
        public TextView start_at;
        public TextView end_at;
        public Button delete;

        public ViewHolder(View itemView) {
            super(itemView);
            this.address = itemView.findViewById(R.id.address);
            this.description = itemView.findViewById(R.id.description);
            this.start_at = itemView.findViewById(R.id.start_at);
            this.end_at = itemView.findViewById(R.id.end_at);
            this.delete = itemView.findViewById(R.id.delete);
        }
    }


}