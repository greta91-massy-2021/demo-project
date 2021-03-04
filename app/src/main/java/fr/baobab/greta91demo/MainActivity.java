package fr.baobab.greta91demo;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    public static final int SECOND_ACTIVITY = 1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.complex_layout);
        final Button button = (Button)findViewById(R.id.button);//récupère le bouton 1
        final Button button2 = (Button)findViewById(R.id.button2);//récupère le bouton 2
        final Button button3 = (Button)findViewById(R.id.button3);//récupère le bouton 3
        final Button button4 = (Button)findViewById(R.id.button4);//récupère le bouton 4
        final Button button5 = (Button)findViewById(R.id.button5);//récupère le bouton 5
        final Button button6 = (Button)findViewById(R.id.button6);//récupère le bouton 6
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
        button4.setOnClickListener(this);
        button5.setOnClickListener(this);
        button6.setOnClickListener(this);
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
                //finish();
                break;
            case R.id.button4:
                //traitement pour le bouton 4
                //créer un intent implicite
                Uri uri = Uri.parse("https://google.fr");
                Intent intent2 = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent2);
                break;
            case R.id.button5:
                //traitement pour le bouton 5
                //créer un intent explicite
                Intent intent3 = new Intent(Intent.ACTION_MAIN);
                intent3.addCategory(Intent.CATEGORY_LAUNCHER);
                intent3.setClassName("fr.baobab.greta91demo2",
                                            "fr.baobab.greta91demo2.MainActivity");
                startActivity(intent3);
                break;
            case R.id.button6:
                //traitement pour le bouton 6
                //créer un intent explicite
                Intent intentAvecRes = new Intent(this, SecondActivity.class);
                startActivityForResult(intentAvecRes, SECOND_ACTIVITY);
                break;
            default:
                //traitement par défaut
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        if (resultCode == RESULT_CANCELED) return;
        switch (requestCode){
            case SECOND_ACTIVITY:
                if(null != data){
                    int res = data.getIntExtra(SecondActivity.SECOND_ACTIVITY_RES, 0);
                    //afficher une notification
                    String msg = "Voici le résultat " + res;
                    Toast.makeText(this, msg, Toast.LENGTH_LONG).show();
                }
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

