package aula005.agenda;

public class main {
    public static void main(String[] args) {
        //criando os dados do contato
        Contato contato1 = new Contato("Tiffany", "1199205-0217" , "novomail@novo.com" );
        Contato contato2 = new Contato("Pedro", "1199255-0217" , "novomail@novo.com" );

    //usando o metodo da superclasse p exibir dados
        contato1.exibirContato();

        contato2.exibirContato();


    //usando o getter setter para atualizar o contato
        contato1.setTelefone("1195214-2515");
        contato2.setEmail("pedrin@novo.com");

    //exibir contato atualizado
        System.out.println("\nContato atualizado: ");
        contato1.exibirContato();

        System.out.println("\nContato atualizado: ");
        contato2.exibirContato();
    }

}
