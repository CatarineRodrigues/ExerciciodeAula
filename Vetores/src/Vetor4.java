/* Exercícios vetores

4. Faça um programa que receba de lista de compras sendo que o usuário irá inserir a quantidade 
de itens que quer adicionar na lista de compras e após inserir a quantidade o programa deverá 
permitir que o usuário insira os produtos nessa lista. Exiba a lista completa para o usuário. */

import java.util.Scanner;

public class Vetor4 {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);  // Scaner p armazenar dados
        // criar um vetor de tamanho variável
        // criar uma variável para o tamanho do vetor
        // fazer um loop para o usuário inserir os dados
        // fazer um loop para exibir os dados

        System.out.println("----------Lista de compras----------");
        System.out.println("Insira a quantidade de itens que deseja comprar: ");
        int qnt = leitor.nextInt();
        String[] listaCompras = new String[qnt];

        for(int i=0; i<listaCompras.length; i++){
            System.out.print("Insira um item que deseja comprar: ");
            listaCompras[i] = leitor.next();
        }

        System.out.println("-----Lista completa-----");
        System.out.println("Os itens da lista são:");
        for(int i=0; i<listaCompras.length; i++){
            System.out.println(listaCompras[i]);
        }
    }
}
