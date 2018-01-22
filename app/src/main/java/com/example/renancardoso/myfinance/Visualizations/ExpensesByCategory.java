package com.example.renancardoso.myfinance.Visualizations;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.renancardoso.myfinance.R;

/**
 * Created by RenanCardoso on 22/01/2018.
 */

public class ExpensesByCategory extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.visualization_expenses_by_category, container, false);
        return rootView;
    }
}
