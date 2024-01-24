package com.example.button4;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private Button clickButton;
    private int clickCount = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        clickButton = findViewById(R.id.buttonclickButton);

        clickButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickCount++;
                updateButtonText();
            }
        });
    }

    private void updateButtonText() {
        if (clickCount < 7) {
            clickButton.setText("This is a click number: " + clickCount);
        } else {
            clickButton.setText("BOOM !");
            clickCount = 0;
        }
    }
}
