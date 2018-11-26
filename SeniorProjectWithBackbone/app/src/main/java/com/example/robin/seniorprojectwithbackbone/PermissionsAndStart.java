package com.example.robin.seniorprojectwithbackbone;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class PermissionsAndStart extends AppActivityBuilderMethods {

    TextView title;
    TextView message;
    Button start;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_permissions_and_start);

        // --- layout IDs ---
        LinearLayout everything = (LinearLayout) findViewById(R.id.everything);

        // --- variables ---
        String messageString = "This is where we can put permission stuff or otherwise things " +
                "pertaining to the start page.";

        // --- Views ---
        title = titleBuilder("Welcome!", everything);
        message = textViewBuilder(messageString, everything);
        start = activityButtonBuilder("Start!", PermissionsAndStart.this, BuildingSelect.class, false, everything);

        title.setGravity(Gravity.CENTER);
        message.setGravity(Gravity.CENTER);

        start.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, 250));
        ViewGroup.MarginLayoutParams params = (ViewGroup.MarginLayoutParams) start.getLayoutParams();
        params.topMargin = 100;

    }
}
