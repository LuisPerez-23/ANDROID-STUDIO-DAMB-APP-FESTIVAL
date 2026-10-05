package com.luis.festivalapp;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class ProgramacionActivity extends AppCompatActivity {
    private static final String TAG="FESTIVAL";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_programacion);
        Log.d(TAG,"ProgramacionActivity -> onCreate");
        Button btnInfo= findViewById(R.id.btnInfoRecinto);
        btnInfo.setOnClickListener(v -> {
            Intent intent = new Intent(ProgramacionActivity.this, RecintoActivity.class);
            startActivity(intent);
        });
        Button btnVolver= findViewById(R.id.btnVolverProgramacion);
        btnVolver.setOnClickListener(v -> finish());
    }
    @Override protected void onStart() { super.onStart(); Log.d(TAG, "ProgramacionActivity -> onStart"); }
    @Override protected void onResume() { super.onResume(); Log.d(TAG, "ProgramacionActivity -> onResume"); }
    @Override protected void onPause() { super.onPause(); Log.d(TAG, "ProgramacionActivity -> onPause"); }
    @Override protected void onStop() { super.onStop(); Log.d(TAG, "ProgramacionActivity -> onStop"); }
    @Override protected void onRestart() { super.onRestart(); Log.d(TAG, "ProgramacionActivity -> onRestart"); }
    @Override protected void onDestroy() { super.onDestroy(); Log.d(TAG, "ProgramacionActivity -> onDestroy"); }
}