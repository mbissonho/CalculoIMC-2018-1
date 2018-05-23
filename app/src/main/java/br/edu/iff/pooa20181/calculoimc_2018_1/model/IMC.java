package br.edu.iff.pooa20181.calculoimc_2018_1.model;

public class IMC {

    private float resultado;
    private float peso;
    private float altura;

    public IMC(float peso, float altura){
        this.peso = peso;
        this.altura = altura;
        Float potencia = (this.altura*this.altura);
        this.resultado = (this.peso / potencia);
    }

    public float getResultado(){
        return this.resultado;
    }

}
