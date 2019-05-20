package People;

import java.util.Date;

public class Professor extends Pessoa {
    public Integer quantidadeDeTurmas;

    public Professor(String nome, String endereco, String telefone, String cpf, String dataDeNascimento, Integer quantidadeDeTurmas) {
        super(nome, endereco, telefone, cpf, dataDeNascimento);
        this.quantidadeDeTurmas = quantidadeDeTurmas;
    }


}
