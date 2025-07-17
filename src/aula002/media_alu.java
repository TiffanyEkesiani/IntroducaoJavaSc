package aula002;

public class media_alu {

    public static void main(String[] args) {
        String alu1 = "Amanda";
        String cur = "Rede de computadores";
        double nota1 = 5;
        double nota2 = 3;
        double nota3 = 6;
        double nota4 = 2;

        double media = (nota1 + nota2 + nota3 + nota4) / 4;

        System.out.println("A média de Amanda no curso de Rede de computadores foi: " + Math.round(media));

        if (media >= 6) {
            System.out.println("APROVADO");
        } else {
            System.out.println("REPROVADO");
        }

        String alu2 = "Pedro";
        double nota01 = 6;
        double nota02 = 8;
        double nota03 = 3;
        double nota04 = 9;

        double media01 = (nota01 + nota02 + nota03 + nota04) / 4;

        System.out.println("A média de Pedro no curso de Rede de computadores foi: " + Math.round(media01));
        if (media01 >= 6) {
            System.out.println("APROVADO");
        } else {
            System.out.println("REPROVADO");
        }
        }



    }






