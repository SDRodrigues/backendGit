package People;

import java.util.Date;

public class Aluno extends Pessoa {
    public String turma;

    public Aluno(String nome, String endereco, String telefone, String cpf, String dataDeNascimento, String turma) {
        super(nome, endereco, telefone, cpf, dataDeNascimento);
        this.turma = turma;
    }


    public int tirarCopias(int qtd) {
        return 4 * (int) qtd;
    }
    @Override
    public double tirarCopias(double qtd)
    {
        return 0.07 * (double) qtd;
    }
}
