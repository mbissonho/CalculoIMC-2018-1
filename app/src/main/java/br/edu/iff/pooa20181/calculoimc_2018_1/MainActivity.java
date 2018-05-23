package br.edu.iff.pooa20181.calculoimc_2018_1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.Button;
import android.widget.EditText;
import br.edu.iff.pooa20181.calculoimc_2018_1.controller.MainActivityController;

public class MainActivity extends AppCompatActivity {

    private EditText tPeso;
    private EditText tAltura;
    private Button btn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle("Índice de Massa Corporal(IMC)");
        //setSupportActionBar(toolbar);

        this.tPeso = (EditText) findViewById(R.id.tPeso);
        this.tAltura = (EditText) findViewById(R.id.tAltura);
        this.btn = (Button) findViewById(R.id.btn);

        this.btn.setOnClickListener(new MainActivityController(this));
    }

    public String getPeso(){
        return this.tPeso.getText().toString();
    }


   public String getAltura(){
       return this.tAltura.getText().toString();
   }
}
