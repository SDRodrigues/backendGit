import Conta.ContaPoupanca;
import Conta.Count;
import People.Aluno;
import People.Pessoa;
import entity.*;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

//        System.out.println("Heranca");

//        businessAcount.getBalance();

        Account account = new Account(45, "banco", 34.3);
        BusinessAcount businessAcount = new BusinessAcount(45, "awda", 21.2, 19.23  );

//        Account account1 = businessAcount;
//        Account account2 = new BusinessAcount(40, "tete", 89.6, 21.3);
//        Account account3 = new SavingsAccount(1001, "Dono", 44.1, 60.3);

      account.setBalance(23.7);
      account.withdraw(44.6);
      account.withdraw(33);

        Count cp = new ContaPoupanca(44.6);
        cp.imprimeExtrato();
    }
}
