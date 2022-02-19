package com.example.sanabelalkhayr.fragments.donor;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.sanabelalkhayr.Constants;
import com.example.sanabelalkhayr.R;
import com.example.sanabelalkhayr.adapters.donor.UserOrdersAdapter;
import com.example.sanabelalkhayr.model.Order;

import java.util.ArrayList;


public class UserOrdersFragment extends Fragment {

    Context ctx;

    ArrayList<Order> orders;
    RecyclerView mList;
    UserOrdersAdapter mAdapter;


    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        ctx = context;
    }

    public UserOrdersFragment() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_user_orders, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        mList = view.findViewById(R.id.rv);

        orders = new ArrayList<Order>(){{
            add(new Order(1, 1, "butger", 10, -1, "reason why", "10/10/2021"));
            add(new Order(1, 1, "butger", 10, Constants.REQUEST_STATUS_ACCEPTED, "reason why", "10/10/2021"));
            add(new Order(1, 1, "butger", 10, Constants.REQUEST_STATUS_REJECTED, "reason why", "10/10/2021"));
            add(new Order(1, 1, "butger", 10, -1, "reason why", "10/10/2021"));
            add(new Order(1, 1, "butger", 10, Constants.REQUEST_STATUS_ACCEPTED, "reason why", "10/10/2021"));
            add(new Order(1, 1, "butger", 10, Constants.REQUEST_STATUS_REJECTED, "reason why", "10/10/2021"));
            add(new Order(1, 1, "butger", 10, -1, "reason why", "10/10/2021"));
            add(new Order(1, 1, "butger", 10, Constants.REQUEST_STATUS_ACCEPTED, "reason why", "10/10/2021"));
            add(new Order(1, 1, "butger", 10, Constants.REQUEST_STATUS_REJECTED, "reason why", "10/10/2021"));
        }};

        mAdapter = new UserOrdersAdapter(ctx, orders);
        mList.setAdapter(mAdapter);
    }
}