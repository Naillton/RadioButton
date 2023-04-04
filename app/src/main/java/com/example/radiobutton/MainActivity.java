package com.example.radiobutton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView text;
    // atributos para radio buttons
    private RadioButton masculino, feminino;

    // atributo par RadioGroup
    private RadioGroup opcao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // definindo ids dos atributos
        text = findViewById(R.id.escolha);
        masculino = findViewById(R.id.Masculino);
        feminino = findViewById(R.id.Feminino);
        opcao = findViewById(R.id.radioGroup);

        // chamando metodo para iniciar assim que o app for inicializado
        radioCheck();
    }

    public void radioCheck() {
        // usando ouvinte para escutar assim que marcar um radio diferente
        opcao.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if ( i == masculino.getId()) {
                    text.setText("Masculino escolhido");
                } else {
                    text.setText("Feminino escolhido");
                }
            }
        });

        /*
        int mascId = masculino.getId();
        int femId = feminino.getId();
        String choice = "";
        if (masculino.isChecked()) {
            choice = "Voce escolheu "+ mascId;
        } else {
            choice = "Voce escolheu "+ femId;
        }
        text.setText(choice); */
    }

    public void enviar(View view) {
        //radioCheck();
        System.out.println("Visualizar metodo principal");
    }

    public void limpar(View view) {
        text.setText("");
    }
}