/* Exercícios sobre métodos

1. Faça um algoritmo que contenha um método que receba um número do
usuário e realize a somatório de todos os números no intervalo de 1 até o
número digitado pelo usuário. Exiba o resultado final da somatória. */ 

import java.util.Scanner;

public class MetodoEx1 {
    public static void main(String[] args) {

        // criar um método
        // pedir um número para o usuário
        // fazer um loop de 1 até o número
        // somar todos os  números nesse intervalo
        // exibir o resultado final da somatória
        System.out.println(somandoNumeros());
        
    }
    public static int somandoNumeros(){
        Scanner leitor = new Scanner(System.in);
        System.out.println("Insira um número: ");
        int numero = leitor.nextInt();

        int soma = 0;
        for(int i=0; i <= numero; i++){
            soma = soma + i;                        
        }

        return soma;
    }
}

