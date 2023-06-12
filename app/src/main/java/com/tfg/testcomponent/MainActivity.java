package com.tfg.testcomponent;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.tfg.componentcapturaescriptura.CustomComponent;
import com.tfg.componentcapturaescriptura.DrawingView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        CustomComponent customComponent = findViewById(R.id.custom_component);
        customComponent.setComponentBackgroundColor(Color.GRAY);
        customComponent.setInkColor(Color.RED);
    }
}