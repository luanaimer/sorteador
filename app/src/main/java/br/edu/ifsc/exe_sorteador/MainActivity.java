package br.edu.ifsc.exe_sorteador;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private TextView textoResultado;
    private EditText editTextMenor;
    private  EditText editTextMaior;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.i("teste", "1");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i("teste", "2");
        this.editTextMenor =  (EditText) findViewById(R.id.editTextMenor);
        this.editTextMaior =  (EditText) findViewById(R.id.editTextMaior);
        this.textoResultado =  (TextView) findViewById(R.id.textoResultado);
        Log.i("teste", "3");
    }

    public void sortearNumero( View view ){

        Log.i("teste", "4");
        int x = new Random().nextInt( Integer.parseInt (this.editTextMaior.getText().toString())-Integer.parseInt (this.editTextMenor.getText().toString()) )+Integer.parseInt (this.editTextMenor.getText().toString());
        this.textoResultado.setText("O número selecionado é:"+ x);


    }
}
