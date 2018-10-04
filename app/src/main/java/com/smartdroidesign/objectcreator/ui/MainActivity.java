package com.smartdroidesign.objectcreator.ui;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.smartdroidesign.objectcreator.R;
import com.smartdroidesign.objectcreator.model.User;
import com.smartdroidesign.objectcreator.presenter.SecondActivity;

public class MainActivity extends AppCompatActivity {

    private Button createctivityButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        createctivityButton = findViewById(R.id.buttonCreator);

        createctivityButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =  new Intent(MainActivity.this, SecondActivity.class);

                User matteo = new User("Matteo", "Me", "Mondadori", "Swordman");

                intent.putExtra("user", matteo);
                startActivity(intent);

            }
        });


    }
}
