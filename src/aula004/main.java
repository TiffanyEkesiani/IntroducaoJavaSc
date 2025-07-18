package aula004;

// Classe principal para testar - chamar os metodos
public class main {
    public static void main(String[] args) {
       moto moto01 = new moto();
       caminhao caminhao01 = new caminhao();

       moto01.modelo = "Toyota";
       caminhao01.modelo = "Voksvagem";

        // Métodos da superclasse
       moto01.ligar();
        // Métodos da classe filha (subclasse)
       moto01.empinar();

        // Métodos da superclasse
        caminhao01.ligar();
        // Métodos da classe filha (subclasse)
        caminhao01.emitirBosina();
    }
}
