package org.example;

import java.util.Locale;
import java.util.Scanner;

import entities.Conta;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Conta conta = new Conta();
        System.out.println();

        System.out.print("Entre com numero da conta:");
        conta.setNumeroConta(Integer.parseInt(sc.nextLine()));

        System.out.print("Entre com nome do cliente:");
        conta.setNomeTitularConta(sc.nextLine());

        System.out.print("Voce vai adcionar um deposito inicial (y/n):");
        String opcoes = sc.next();

        if (opcoes.equalsIgnoreCase("y")) {
            conta.setInitialDeposit(true);
        } else if (opcoes.equalsIgnoreCase("n")) {
            conta.setInitialDeposit(false);
        }

        if (conta.isInitialDeposit()) {
            System.out.println("Enter com valor do deposito inicial:");
            conta.setSaldoInicial(sc.nextDouble());
        }

        System.out.println();

        System.out.println("Dados da Conta:");
        System.out.println(conta.toString());

        System.out.println("Entre com um deposito:");
        conta.deposito(sc.nextDouble());

        System.out.println("Update nos Dados da conta:");
        System.out.println(conta.toString());

        System.out.println("Entre com um saque:");
        conta.saque(sc.nextDouble());

        System.out.println("Update nos Dados da conta:");
        System.out.println(conta.toString());

    }
}