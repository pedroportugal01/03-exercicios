package Exercicio02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Paciente paciente = new Paciente();

       double [] alvo ;



        System.out.println("=== Cadastro - Clínica de Medicina Esportiva ===");

        System.out.print("Nome do paciente: ");
        paciente.nome = sc.nextLine();

        System.out.print("Idade do paciente: ");
        paciente.idade = sc.nextInt();

        alvo = paciente.frequenciaAlvo();

        System.out.println("Paciente: " +paciente.nome);
        System.out.println("Frequencia máxima:  " +paciente.frquenciaMaxima());

        System.out.println("Intervalo da frequencia alvo: [" +alvo[0] + "," +alvo[1]+"]");



    }
}


