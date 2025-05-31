import calculadora.CalculadoraJava;

public class TestCalculadora {
    public static void main(String[] args){

        CalculadoraJava exemplo = new CalculadoraJava(1f,6f);
        System.out.println(exemplo.subtrair());

        /*
        float[] somar = new float[]{-90.9f,-50.8f,-50f,-90f};

        var totaç = 0f;

        for (float c : somar){
            totaç += c;
        }

        System.out.println(totaç);

         */
    }
}
