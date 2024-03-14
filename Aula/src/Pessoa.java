public class Pessoa {
    private String nome;
    private Integer idade;
    private String cpf;

    private Endereco endereco;

    public Pessoa(String nome, Integer idade, String cpf,Endereco endereco) {
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
        this.endereco = endereco;
    }
}
