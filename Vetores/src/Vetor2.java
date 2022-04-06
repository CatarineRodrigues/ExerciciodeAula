/* Exercícios vetores 

2. Faça um programa de lista de chamada que armazene o nome de 10 alunos e apresente a lista 
completa para o usuário */

import java.util.Scanner;

public class Vetor2 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        // criar um loop para rodar o vetor
        // pedir pro usuário colocar os nomes
        // imprimir a lista em um loop

        String[] listaAlunos = new String[10];        // criar o vetor

        for(int i = 0; i < listaAlunos.length; i++){        // criar um loop
            System.out.println("Insira um nome: ");
            listaAlunos[i] = leitor.nextLine();             // pedir para inserir valores
        }

        System.out.println("----------Lista de Alunos----------");
        for(int i = 0; i < listaAlunos.length; i++){
            System.out.println(listaAlunos[i]);
        }
    }
}
