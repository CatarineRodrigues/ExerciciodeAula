/* Exercícios sobre métodos

2. Faça um algoritmo que contenha uma função que receba o nome de um
usuário e retorne a mensagem Meu nome é <NomeDigitado>. */ 

import java.util.Scanner;

public class MetodoEx2 {
    public static void main(String[] args) {

        // criar um método
        // pedir o nome do usuário
        // criar variáveis para o nome
        // exibir o resultado final da somatória

        Scanner leitor = new Scanner(System.in);
        System.out.println("Seja Bem vindo!");
        System.out.println("Por favor insira seu nome: ");
        String nomeDigitado = leitor.nextLine();

        mensagem(nomeDigitado);
    }
    public static void mensagem(String nomeDigitado){
        System.out.println("Meu nome é "+nomeDigitado);

    }

}

