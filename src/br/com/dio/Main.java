package br.com.dio;


public class Main {

    public static void main(String[] args) {

        //Calculadora
        System.out.println("Exercício calculadora");
        Calculadora.soma(3, 6);
        Calculadora.subtração(9, 1.8);
        Calculadora.multiplicação(7,8);
        Calculadora.divisão(5, 2.5);

        //Mensagem
        System.out.println("Exercício mensagem");
        Mensagem.obterMensagem( 9);
        Mensagem.obterMensagem( 14);
        Mensagem.obterMensagem( 1);
        Mensagem.obterMensagem( 25);

        }
}
