package com.app.swaperefresh;

import androidx.appcompat.app.AppCompatActivity;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements SwipeRefreshLayout.OnRefreshListener {

    SwipeRefreshLayout swipe_layout;
    TextView demo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        swipe_layout = findViewById(R.id.swipe_layout);
        demo = findViewById(R.id.demo);

        swipe_layout.setOnRefreshListener(this);
        /*swipe_layout.postDelayed(new Runnable() {
            @Override
            public void run() {
                swipe_layout.setRefreshing(false);
                demo.setText("Demo ABCD");
            }
        }, 2000);*/
    }

    @Override
    public void onRefresh() {
        // swipe_layout.setRefreshing(true);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                demo.setText("Demo 1234");
                demo.setTextColor(Color.RED);
                swipe_layout.setRefreshing(false);
            }
        }, 2000);
    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }
}