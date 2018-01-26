package com.example.renancardoso.myfinance;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.renancardoso.myfinance.Transactions.AddExpenseActivity;
import com.example.renancardoso.myfinance.Transactions.AddRevenueActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    void openFutureReleases(View v) {
        startActivity(new Intent(this, FutureReleasesActivity.class));
    }

    void openVisualizations(View v) {
        startActivity(new Intent(this, VisualizationsActivity.class));
    }

    void openAddRevenue(View v) {
        startActivity(new Intent(this, AddRevenueActivity.class));
    }

    void openAddExpense(View v) {
        startActivity(new Intent(this, AddExpenseActivity.class));
    }
}
