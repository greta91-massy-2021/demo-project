package fr.baobab.greta91demo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.complex_layout);
        final Button button = (Button)findViewById(R.id.button);//récupère le bouton 1
        final Button button2 = (Button)findViewById(R.id.button2);//récupère le bouton 2
        final Button button3 = (Button)findViewById(R.id.button3);//récupère le bouton 3
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
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        final int id = v.getId();
        switch (id){
            case R.id.button:
                //traitement pour le bouton 1
                EditText editText = (EditText) findViewById(R.id.editText);
                editText.setText("Bonjour le monde !");
            break;
            case R.id.button2:
                //traitement pour le bouton 2
                ImageView iv = (ImageView) findViewById(R.id.imageView);
                iv.setImageResource(R.drawable.paris);
            break;
            case R.id.button3:
                //traitement pour le bouton 3
                //créer un intent explicite
                Intent intent = new Intent(this, SecondActivity.class);
                startActivity(intent);
                break;
            default:
                //traitement par défaut
        }

    }

    /*private class MyListener implements View.OnClickListener{
        @Override
        public void onClick(View v) {
            EditText editText = (EditText) findViewById(R.id.editText);
            editText.setText("Bonjour le monde !");
        }
    }*/
}

