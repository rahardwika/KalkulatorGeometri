package com.rahardwika.geometriccalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void hitung (View view){
        Spinner bangun = (Spinner) findViewById(R.id.spinner);
        EditText in1 = (EditText) findViewById(R.id.input1);
        EditText in2 = (EditText) findViewById(R.id.input2);
        TextView hLuas = (TextView) findViewById(R.id.hasilLuas);
        TextView hKeliling = (TextView) findViewById(R.id.hasilKeliling);

        String angka1 = in1.getText().toString();
        String angka2 = in2.getText().toString();
        int a1 = Integer.parseInt(angka1);
        int a2 = Integer.parseInt(angka2);

        if (bangun.getSelectedItem().toString().equals("Persegi Panjang")){
            int hasilL = a1*a2;
            String hasilA = String.valueOf(hasilL);
            hLuas.setText(hasilA);

            int hasilK = 2*(a1+a2);
            String hasilB = String.valueOf(hasilK);
            hKeliling.setText(hasilB);
        }
        else if (bangun.getSelectedItem().toString().equals("Segitiga Siku-siku")){
            double hasilL = a1*a2/2;
            String hasilA = String.valueOf(hasilL);
            hLuas.setText(hasilA);

            double r = (float) Math.sqrt(a1*a1+a2*a2);
            double hasilK = a1 + a2 + r;
            String hasilB = String.valueOf(hasilK);
            hKeliling.setText(hasilB);
        }
        else if (bangun.getSelectedItem().toString().equals("Lingkaran")){
            double phi = Math.PI;
            double hasilL = Math.pow(a1, 2)*phi;
            String hasilA = String.valueOf(hasilL);
            hLuas.setText(hasilA);
            double hasilK = phi * 2 * a1;
            String hasilB = String.valueOf(hasilK);
            hKeliling.setText(hasilB);
        }
    }
}
