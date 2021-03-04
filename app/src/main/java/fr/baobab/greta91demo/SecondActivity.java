package fr.baobab.greta91demo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SecondActivity extends AppCompatActivity {
    public static  final String SECOND_ACTIVITY_RES = "SECOND_ACTIVITY_RES";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Button button = (Button)findViewById(R.id.button7);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText et1 = (EditText) findViewById(R.id.editText2);
                EditText et2 = (EditText) findViewById(R.id.editText3);
                int num1 = Integer.parseInt(et1.getText().toString());
                int num2 = Integer.parseInt(et2.getText().toString());
                int res = num1+num2;
                Intent intent = getIntent();
                intent.putExtra(SECOND_ACTIVITY_RES, res);
                setResult(RESULT_OK, intent);
                finish();
            }
        });
        /*button.setOnClickListener((v)->{
            EditText et1 = (EditText) findViewById(R.id.editText2);
            EditText et2 = (EditText) findViewById(R.id.editText3);
            int num1 = Integer.parseInt(et1.getText().toString());
            int num2 = Integer.parseInt(et2.getText().toString());
            int res = num1+num2;
            Intent intent = getIntent();
            intent.putExtra(SECOND_ACTIVITY_RES, res);
            setResult(RESULT_OK, intent);
            finish();
        });*/

    }

}
