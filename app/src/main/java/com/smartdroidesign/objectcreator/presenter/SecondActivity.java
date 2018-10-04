package com.smartdroidesign.objectcreator.presenter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.smartdroidesign.objectcreator.R;
import com.smartdroidesign.objectcreator.model.User;

public class SecondActivity extends AppCompatActivity {

    private TextView objectField;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);


        User matteo = getIntent().getParcelableExtra("user");

        objectField = findViewById(R.id.objectField);
        objectField.setText(
                String.format("%s\n%s\n%s\n%s", matteo.getName(), matteo.getCreatedBy(), matteo.getPublisher(), matteo.getAbilities()));

    }
}
