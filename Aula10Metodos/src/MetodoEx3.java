/* Exercícios sobre métodos

3. Faça um algoritmo que contenha uma função que calcule o IMC de um
usuário a partir da inserção do seu peso e de sua altura. Exiba a
classificação do usuário após a verificação do seu IMC.

IMC CLASSIFICAÇÃO OBESIDADE (GRAU)
MENOR QUE 18,5 MAGREZA 0
ENTRE 18,5 E 24,9 NORMAL 0
ENTRE 25,0 E 29,9 SOBREPESO I
ENTRE 30,0 E 39,9 OBESIDADE II
MAIOR QUE 40,0 OBESIDADE GRAVE III    */ 

import java.util.Scanner;

public class MetodoEx3 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Vamos calcular o seu IMC");
        System.out.println("Insira o seu peso");
        float p = leitor.nextFloat();
        
        System.out.println("Insira a sua altura");
        float a = leitor.nextFloat();
        calculoIMC(p, a);
    }
        public static void calculoIMC(float peso, float altura){

        float IMC = peso/(altura*altura);
        
        if(IMC < 18.5){
            System.out.println("Classificação do IMC: Magreza");
        } else if(IMC >= 18.5 & IMC <= 24.9){
            System.out.println("Classificação do IMC: Normal");
        } else if(IMC >= 25 & IMC <= 29.9){
            System.out.println("Classificação do IMC: Sobrepeso grau I");
        } else if(IMC >= 30 & IMC <= 39.9){
            System.out.println("Classificação do IMC: Obesidade grau II");
        } else{
            System.out.println("Classificação do IMC: Obesidade Grave grau III");
        }

        }

}

