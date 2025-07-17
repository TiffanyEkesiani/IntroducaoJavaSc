package aula002;

public class aula02_aritimetica {

    public static void main(String[] args) {
    double base = 10;
    double expoente = 5;

        System.out.println("1. Potenciação:");
        System.out.println(base + " elevado à " + expoente + " é: " + Math.pow(base, expoente));

        int negativo = -10;
        System.out.println("Valor absoluto:");
        System.out.println("O valor absoluto de " + negativo + " é: " + Math.abs(negativo));

        int a = 7, b = 15;
        System.out.println("Maior valor:");
        System.out.println("O maior entre " + a + " e " + b + " é: " + Math.max(a, b));

        System.out.println("Menor valor:");
        System.out.println("O menor entre " + a + " e " + b + " é: " + Math.min(a, b));

        double valor = 3.5;
        System.out.println("Arredondamento:");
        System.out.println("Arredondando " + valor + ": " + Math.round(valor));

        System.out.println("Número aleatório:");
        double aleatorio = Math.random() * 100;
        System.out.println("Número aleatório entre 0 e 100: " + " " + String.format("%.3f", aleatorio));
        //Strinf.format = definir formato de como a string será apresentada, no caso de função aritimetica, seria qnts numero após a virgula, será apresentado





    }







}
