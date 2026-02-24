package Exercicio01;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        Conta conta = new Conta();
        double valor;


        System.out.println("Nome do correntista -->");
        conta.correntista = sc.next();
        conta.numero = rd.nextInt(1000, 9999);


        System.out.println("Saldo inicial: R$ " +conta.saldo);
        System.out.print("Informe o valor para depósito: R$");
        valor = sc.nextDouble();
        conta.depositar(valor);
        System.out.print("Informe o valor para saque: R$");
        valor = sc.nextDouble();
        conta.sacar(valor);
       System.out.println("Saldo atual: R$ " +conta.saldo);
    }
}
