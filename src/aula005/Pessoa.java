package aula005;
//encapsulamento

public class Pessoa {
    // Atributos privados
    private String nome;
    private String cpf;
    public int idade;

    //getter do nome
    public String getNome(){
        return nome;

    }

    //setter do nome
        public void setNome(String nome){
            this.nome = nome;

        }

    //getter do cpf com verificação de null
    public String getCpf(){
        if (cpf != null && cpf.length() == 14) {
            return cpf;
        }else {
            return "CPF inválido ou não informado corretamente!";


        }


    }

    //setter do cpf com validacao basica
        public void setCpf(String cpf){
            if (cpf != null && cpf.length() == 14) {
                this.cpf = cpf;

            }else {
                System.out.println("CPF INVALIDO! Digite no formato 000.000.000-00");
            }


        }}




