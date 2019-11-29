package com.example.promedio;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText et1, et2;
    private TextView tv1;
    private Button btnSuma;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        et1 =(EditText) findViewById(R.id.num1);
        et2 =(EditText) findViewById(R.id.num2);
        tv1 =(TextView) findViewById(R.id.txtResultado);
    }

    public void Sumar( View view){
        String valor1 = et1.getText().toString();
        String valor2 = et2.getText().toString();

        int num1 = Integer.parseInt(valor1);
        int num2 = Integer.parseInt(valor2);

        int suma= num1+num2;

        String resultado = String.valueOf(suma);
        tv1.setText(resultado);

    }
}
