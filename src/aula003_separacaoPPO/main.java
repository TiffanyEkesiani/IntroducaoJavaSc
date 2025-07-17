package aula003_separacaoPPO;

// Classe principal
public class main {
        public static void main(String[] args) {  //definindo valores para os atributos
            Carro meuCarro = new Carro();
            meuCarro.cor = "Branco";
            meuCarro.modelo = "TIGGO";
            meuCarro.ano = 2025;

            meuCarro.piscar(); //chamando o objeto para o metodo piscar()
        }
    }

