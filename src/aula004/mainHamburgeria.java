package aula004;

// Classe principal para testar - chamar os metodos

public class mainHamburgeria {

    public static void main(String[] args) {
        lanche01 xtudo = new lanche01() {
            @Override
            public void escolherHamburger() {

            }
        };
        lanche02 xsalada = new lanche02() {
            @Override
            public void escolherHamburger() {

            }
        };


        // Métodos da superclasse
        xtudo.preparar();
        // Métodos da classe filha (subclasse)
        xtudo.escolherXTUDO();

        // Métodos da superclasse
        xsalada.preparar();
        // Métodos da classe filha (subclasse)
        xsalada.escolherXSALADA();
    }}


