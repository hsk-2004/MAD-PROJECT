package com.example.appactivitylifecycle;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {

  TextView textView;
  Button btnCounter, btnSecondActivity;

  int count = 0;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    EdgeToEdge.enable(this);
    setContentView(R.layout.activity_main);

    Log.i("unique", "FirstActivity onCreate");

    textView = findViewById(R.id.textView);
    btnCounter = findViewById(R.id.btnCounter);
    btnSecondActivity = findViewById(R.id.btnSecondActivity);

    btnCounter.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        count = count + 1;
        textView.setText(String.format(Locale.getDefault(), "%d", count));
      }
    });

    btnSecondActivity.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        Intent i = new Intent(getApplicationContext(),
          SecondActivity.class);
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
    Log.i("unique", "FirstActivity onStart");
  }

  @Override
  protected void onResume() {
    super.onResume();
    Log.i("unique", "FirstActivity onResume");
  }

  @Override
  protected void onRestart() {
    super.onRestart();
    Log.i("unique", "FirstActivity onRestart");
  }

  @Override
  protected void onPause() {
    super.onPause();
    Log.i("unique", "FirstActivity onPause");
  }

  @Override
  protected void onStop() {
    super.onStop();
    Log.i("unique", "FirstActivity onStop");
  }

  @Override
  protected void onDestroy() {
    super.onDestroy();
    Log.i("unique", "FirstActivity onDestroy");
  }
}