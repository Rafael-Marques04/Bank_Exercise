package org.example;

import java.util.ArrayList;
import java.util.List;

public class Banco {
    private final List<Conta> contas;

    public Banco() {
        this.contas = new ArrayList<>();
    }

    public void adicionarConta(Conta conta) {
        contas.add(conta);
    }

    public void exibirExtrato(Conta conta) {
        System.out.println("| Extrato da Conta " + conta.getNumero() + " |");
        System.out.println("| Saldo: R$" + conta.getSaldo());
        System.out.println("|-------------------------|");

    }
    public void exibirSaldoTotal() {
        double saldoTotal = 0.0;
        for (Conta conta : contas) {
            saldoTotal += conta.getSaldo();
        }
        System.out.println("| Saldo total do banco: R$" + saldoTotal);
    }
}
