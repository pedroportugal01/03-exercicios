package Exercicio02;

public class Paciente {

    //Atributos ou variaveis de instancia
    int idade;
    String nome;

    // Método para calcular frequência cardíaca máxima
    public int frquenciaMaxima(){
        return 220 - idade;
    }

    // // Método para calcular frequência cardíaca mínima alvo
    public double[] frequenciaAlvo() {

        double [] alvo = new double [2];
        int fm = frquenciaMaxima();
        alvo[0] = fm * 0.5;
        alvo[1] = fm * 0.85;
        return alvo;
     }





}
