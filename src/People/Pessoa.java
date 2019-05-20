package People;

import java.util.Date;

public class Pessoa implements Contrato {
    private String nome;
    private String endereco;
    public String telefone;
    private String cpf;
    public String dataDeNascimento;

    public Pessoa(String nome, String endereco, String telefone, String cpf, String dataDeNascimento) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.cpf = cpf;
        this.dataDeNascimento = dataDeNascimento;
    }



    public int tirarCopias(int qtd) { //Retorna o preço para tirar copias
        return 3 * (int) qtd;
    }

    public double tirarCopias(double qtd) { //Retorna o preço para tirar copias
        return 0.10 * (double) qtd;
    }

    @Override
    public String apresentar() {
        return nome;
    }
}
