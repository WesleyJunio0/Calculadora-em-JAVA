package calculadora;

public class CalculadoraJava {
    public float valor1;
    public float valor2;


    public CalculadoraJava(float valor1, float valor2) {
        this.valor1 = valor1;
        this.valor2 = valor2;

    }

    public CalculadoraJava(float valor1, float... valor2){
        this.valor1 = valor1;
        float total = 0;

        for (float c : valor2){
            total += c;

        }

        this.valor2 = total;
    }

    public float somar(){
        return  valor1 + valor2;
    }

    public float subtrair(){
        return  valor1 - valor2;
    }

    public float multiplicar(){
        return  valor1 * valor2;
    }

    public float dividir(){

        if (valor2 == 0){
            return 0;
        }
        return  valor1 / valor2;
    }


    public int somarint(){
        int valorr1 = (int) valor1;
        int valorr2 = (int) valor2;
        return valorr1 + valorr2;
    }

    public int subtrairint(){
        int valorr1 = (int) valor1;
        int  valorr2 = (int) valor2;
        return valorr1 - valorr2;
    }

    public int multiplicarint(){
        int valorr1 = (int) valor1;
        int valorr2 = (int) valor2;
        return valorr1 * valorr2;
    }

    public int dividirint(){
        if (valor2 == 0){
            return 0;
        }

        int valorr1 = (int) valor1;
        int  valorr2 = (int) valor2;

        return valorr1 / valorr2;
    }



}
