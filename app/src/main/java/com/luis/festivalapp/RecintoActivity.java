package com.luis.festivalapp;

import android.os.Bundle;
import android.util.Log;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class RecintoActivity extends AppCompatActivity {
    private static final String TAG="FESTIVAL";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recinto);
        Log.d(TAG,"RecintoActivity -> onCreate");
        Button btnVolver= findViewById(R.id.btnVolverRecinto);
        btnVolver.setOnClickListener(v -> finish());

    }
    @Override protected void onStart() { super.onStart(); Log.d(TAG, "RecintoActivity -> onStart"); }
    @Override protected void onResume() { super.onResume(); Log.d(TAG, "RecintoActivity  -> onResume"); }
    @Override protected void onPause() { super.onPause(); Log.d(TAG, "RecintoActivity  -> onPause"); }
    @Override protected void onStop() { super.onStop(); Log.d(TAG, "RecintoActivity  -> onStop"); }
    @Override protected void onRestart() { super.onRestart(); Log.d(TAG, "RecintoActivity  -> onRestart"); }
    @Override protected void onDestroy() { super.onDestroy(); Log.d(TAG, "RecintoActivity  -> onDestroy"); }
}
