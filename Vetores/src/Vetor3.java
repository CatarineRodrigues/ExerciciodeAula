/* Exercícios vetores

3. Faça um programa que receba 10 números inteiros, armazene-os e verifique quais numeros são 
pares, e exiba para o usuário apenas os números pares da lista. */

import java.util.Scanner;

public class Vetor3 {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);  // Scaner p armazenar dados
        // fazer um vetor para receber 10 números
        // fazer um loop para rodar o vetor
        // dentro do loop pedir para o usuário colocar os números
        // fazer outro loop com uma condição de mostrar apenas pares

        int listaNumeros[] = new int[10];                   // criar o vetor
        for(int i = 0; i < listaNumeros.length; i++){       // criar um loop
            System.out.println("Insira um número: ");
            listaNumeros[i] = leitor.nextInt();             // pedir para inserir valores
        }

        for(int i = 0; i < listaNumeros.length; i++){
            if(listaNumeros[i] % 2 == 0){
                System.out.println("É par o número: "+listaNumeros[i]);
            }
        }
    }
}
