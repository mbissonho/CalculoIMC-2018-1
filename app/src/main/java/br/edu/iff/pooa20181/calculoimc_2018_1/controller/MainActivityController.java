package br.edu.iff.pooa20181.calculoimc_2018_1.controller;

import android.support.v7.app.AlertDialog;
import android.view.View;

import br.edu.iff.pooa20181.calculoimc_2018_1.MainActivity;
import br.edu.iff.pooa20181.calculoimc_2018_1.model.IMC;

public class MainActivityController implements View.OnClickListener {

    private MainActivity activity;
    private IMC imc;

    public MainActivityController(MainActivity activity){
       this.activity = activity;
    }

    @Override
    public void onClick(View v) {
        AlertDialog.Builder dialog = new AlertDialog.Builder(this.activity);

        if((this.activity.getPeso().trim().equals("")) || (this.activity.getAltura().trim().equals(""))){

            dialog.setTitle("Uso");
            dialog.setMessage("Preencha os campos para calcular!");
            dialog.setNeutralButton("OK",null);
            dialog.show();

        }else{

            Float peso = Float.parseFloat(this.activity.getPeso());
            Float altura = Float.parseFloat(this.activity.getAltura());

            this.imc = new IMC(peso, altura);

            Float resultado = this.imc.getResultado();
            String mensagem = "";

            if(resultado < 17){
                mensagem = "Muito abaixo do peso";
            }else if((resultado >= 17) && (resultado <= 18.49)){
                mensagem = "Abaixo do peso";
            }else if((resultado >= 18.5) && (resultado <= 24.99)){
                mensagem = "Peso normal";
            }else if((resultado >= 25) && (resultado <= 29.99)){
                mensagem = "Acima do peso";
            }else if((resultado >= 30) && (resultado <= 34.49)){
                mensagem = "Obesidade I";
            }else if((resultado >= 35) && (resultado <= 39.99)){
                mensagem = "Obesidade II(Severa)";
            }else if(resultado >= 40){
                mensagem = "Obesidade III(Mórbida)";
            }

            dialog.setTitle("Resultado");
            dialog.setMessage(resultado+"\n"
                    +mensagem);
            dialog.setNeutralButton("OK",null);
            dialog.show();

        }
    }
}
