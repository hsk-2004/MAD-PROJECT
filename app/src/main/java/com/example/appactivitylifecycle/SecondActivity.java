package com.example.appactivitylifecycle;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class SecondActivity extends AppCompatActivity {

  Button btnFirstActivity;
  TextView textView;

  @SuppressLint("DefaultLocale")
  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    EdgeToEdge.enable(this);
    setContentView(R.layout.activity_second);

    Log.i("unique", "SecondActivity onCreate");
    
    btnFirstActivity = findViewById(R.id.btnFirstActivity);
    textView = findViewById(R.id.textView2);

    btnFirstActivity.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        Intent i = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(i);
      }
    });

    ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main),
      (v, insets) -> {
        Insets systemBars = insets.getInsets(
          WindowInsetsCompat.Type.systemBars());
        v.setPadding(systemBars.left, systemBars.top, systemBars.right,
          systemBars.bottom);
        return insets;
      });
  }

  @Override
  protected void onStart() {
    super.onStart();
    Log.i("unique", "SecondActivity onStart");
  }

  @Override
  protected void onResume() {
    super.onResume();
    Log.i("unique", "SecondActivity onResume");
  }

  @Override
  protected void onRestart() {
    super.onRestart();
    Log.i("unique", "SecondActivity onRestart");
  }

  @Override
  protected void onPause() {
    super.onPause();
    Log.i("unique", "SecondActivity onPause");
  }

  @Override
  protected void onStop() {
    super.onStop();
    Log.i("unique", "SecondActivity onStop");
  }

  @Override
  protected void onDestroy() {
    super.onDestroy();
    Log.i("unique", "SecondActivity onDestroy");
  }
}