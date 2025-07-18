package aula004;

// Subclasse - herda de veiculo

class moto extends veiculo {
    boolean temPartidaEletrica; // guardar uma informação sobre o objeto

    void empinar() {
        System.out.println("A moto está dando grau.");
    }

    void verificarPartida() {
        if (temPartidaEletrica) {
            System.out.println("A moto tem partida eletrica, mandar ver. ");

        } else {

        }


    }
}
