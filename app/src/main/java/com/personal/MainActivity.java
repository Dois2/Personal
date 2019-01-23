package com.personal;

import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextClock;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView tvView = (TextView) findViewById(R.id.textView3);
        final TextView txtVa11 = (TextView) findViewById(R.id.edtValor1);
        final TextView txtVa12 = (TextView)findViewById(R.id.edtValor3);
        final TextView txtVa13 = (TextView)findViewById(R.id.edtValor2);
        Button botao = (Button) findViewById(R.id.button);

        botao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



                int valor1 = Integer.parseInt(txtVa11.getText().toString());
                int valor2 = Integer.parseInt(txtVa12.getText().toString());
                int valor3 = Integer.parseInt(txtVa13.getText().toString());


                int resultado = (valor3 * valor2)/valor1;
                tvView.setText(""+resultado);

            }
        });
    }

}
