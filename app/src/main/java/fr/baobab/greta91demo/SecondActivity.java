package fr.baobab.greta91demo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Intent intent = getIntent();
        intent.putExtra("id", 5);
        intent.putExtra("name", "Test");
        setResult(RESULT_OK, intent);
        finish();
    }
}
