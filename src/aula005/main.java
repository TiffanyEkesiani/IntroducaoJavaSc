
package aula005;

public class main {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();// Criando objeto da classe Pessoa
        p1.setNome("Beatriz"); //Usando o setter para definir o nome
        p1.setCpf("454.695.589-99"); //Usando o setter para definir o cpf
        p1.idade = 36;

        System.out.println("Nome: " + p1.getNome());
        System.out.println("CPF: " + p1.getCpf());
        System.out.println("Idade: " + p1.idade);
    }

}


