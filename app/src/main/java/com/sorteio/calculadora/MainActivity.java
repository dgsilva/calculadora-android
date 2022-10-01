package com.sorteio.calculadora;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void somar(View view){
        EditText n1 = (EditText) findViewById(R.id.txtN1);
        EditText n2 = (EditText) findViewById(R.id.txtN2);
        String v1 = n1.getText().toString();
        String v2 = n2.getText().toString();
        if((v1.trim().isEmpty())||(v2.trim().isEmpty())){
            AlertDialog.Builder dlg =  new AlertDialog.Builder(this);
            dlg.setMessage("Há dados em Branco");
            dlg.setNeutralButton("Ok",null);
            dlg.show();
        }else {
            int num1 = Integer.parseInt(n1.getText().toString());
            int num2 = Integer.parseInt(n2.getText().toString());
            int somar = (num1 + num2);
            AlertDialog.Builder dlg =  new AlertDialog.Builder(this);
            dlg.setMessage("O resultado da soma é: " + somar);
            dlg.setNeutralButton("Ok", null);
            dlg.show();
            Toast.makeText(this, "Resultado: ", +5000+ somar + Toast.LENGTH_SHORT).show();
       }

    }


    public void subtrair(View view){
        EditText n1 = (EditText) findViewById(R.id.txtN1);
        EditText n2 = (EditText) findViewById(R.id.txtN2);
        String v1 = n1.getText().toString();
        String v2 = n2.getText().toString();
        if((v1.trim().isEmpty())||(v2.trim().isEmpty())){
            AlertDialog.Builder dlg =  new AlertDialog.Builder(this);
            dlg.setMessage("Há dados em Branco");
            dlg.setNeutralButton("Ok",null);
            dlg.show();
        }else {
            int num1 = Integer.parseInt(n1.getText().toString());
            int num2 = Integer.parseInt(n2.getText().toString());
            int sub = (num1 - num2);
            AlertDialog.Builder dlg =  new AlertDialog.Builder(this);
            dlg.setMessage("O resultado da subtração foi: " + sub);
            dlg.setNeutralButton("Ok", null);
            dlg.show();
            Toast.makeText(this, "Resultado: ", +5000+ sub + Toast.LENGTH_SHORT).show();
        }

    }
}