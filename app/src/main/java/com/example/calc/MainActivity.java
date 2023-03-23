package com.example.calc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.example.calc.R;

public class MainActivity extends AppCompatActivity {
    EditText VI, VF;
    TextView result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
        VF = findViewById(R.id.VFin);
        VI = findViewById(R.id.VIni);
        result = findViewById(R.id.result);
    }
    public void calculoSoma(View v){
        int VIn = Integer.parseInt(VI.getText().toString());
        int VFi = Integer.parseInt(VF.getText().toString());
        result.setText((VIn+VFi)+"");
    }
    public void CalculoSubtracao(View v){
        int VIn = Integer.parseInt(VI.getText().toString());
        int VFi = Integer.parseInt(VF.getText().toString());
        result.setText(""+(VIn - VFi));
    }
    public void calculoDivisao(View v){
        int VIn = Integer.parseInt(VI.getText().toString());
        int VFi = Integer.parseInt(VF.getText().toString());
        float resultado = VIn-VFi;
        result.setText(resultado+"");
    }
    public void calculoMultiplicacao(View v){
        int VIn = Integer.parseInt(VI.getText().toString());
        int VFi = Integer.parseInt(VF.getText().toString());
        result.setText(""+(VIn * VFi));
    }
}