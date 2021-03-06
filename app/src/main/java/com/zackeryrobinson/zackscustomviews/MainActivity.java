package com.zackeryrobinson.zackscustomviews;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.zackeryrobinson.zackscustomviews.views.CustomView;

public class MainActivity extends AppCompatActivity {

    private CustomView mCustomView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mCustomView  = (CustomView) findViewById(R.id.customView);
        findViewById(R.id.btnSwapColor).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mCustomView.swapColor();
            }
        });
    }
}
