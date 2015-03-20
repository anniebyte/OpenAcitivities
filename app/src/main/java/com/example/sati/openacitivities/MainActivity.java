package com.example.sati.openacitivities;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity implements View.OnClickListener {

    private EditText editText;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        editText = (EditText) findViewById(R.id.editText);
        textView = (TextView) findViewById(R.id.textView);

        Button button1 = (Button) findViewById(R.id.buttonAceptar);
        button1.setOnClickListener(this);

        Button button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(this);

        Button button3 = (Button) findViewById(R.id.button3);
        button3.setOnClickListener(this);

        //        View.OnClickListener onClickListener = new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//            }
//        };
//
//        button.setOnClickListener(onClickListener);



    }



    @Override
    public void onClick(View v) {

        int valor = v.getId();

        switch (valor){

            case R.id.buttonAceptar:
                textView.setText(editText.getText());
                Toast.makeText(this, "Seleccion el boton", Toast.LENGTH_SHORT).show();
                break;

            case R.id.button2:
                Intent intent = new Intent(this, SecondActivity.class);
                startActivity(intent);
                break;
            case R.id.button3:
                //Abrir Otra ACTIVIDAD
                break;
        }


    }
}
