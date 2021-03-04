package fr.baobab.greta91demo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.complex_layout);
        final Button button = (Button)findViewById(R.id.button);//récupère le bouton
        //Méthode 1
        /*button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                EditText editText = (EditText) findViewById(R.id.editText);
                editText.setText("Bonjour le monde !");
            }
        });*/
        //Méthode 1 bis
        /*button.setOnClickListener((v)->{
            EditText editText = (EditText) findViewById(R.id.editText);
            editText.setText("Bonjour le monde !");
        });*/
        //Méthode 2
        //button.setOnClickListener(new MyListener());
        //Méthode 3
        button.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        EditText editText = (EditText) findViewById(R.id.editText);
        editText.setText("Bonjour le monde !");
    }

    private class MyListener implements View.OnClickListener{
        @Override
        public void onClick(View v) {
            EditText editText = (EditText) findViewById(R.id.editText);
            editText.setText("Bonjour le monde !");
        }
    }
}

