import java.util.Scanner;

public class ExercicioCond2 {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);

        System.out.println("Vamos calcular o seu IMC");
        System.out.println("Insira o seu peso");
        float peso = leitor.nextFloat();
        
        System.out.println("Insira a sua altura");
        float altura = leitor.nextFloat();

        float IMC = peso/(altura*altura);
        
        if(IMC <= 18.5){
            System.out.println("Classificação do IMC: Magreza");
        } else if(IMC < 25.0){
            System.out.println("Classificação do IMC: Normal");
        } else if(IMC < 30.0){
            System.out.println("Classificação do IMC: Sobrepeso grau I");
        } else if(IMC < 40.0){
            System.out.println("Classificação do IMC: Obesidade grau II");
        } else{
            System.out.println("Classificação do IMC: Obesidade Grave grau III");
        }
    }
}

/*
IMC CLASSIFICAÇÃO OBESIDADE (GRAU)
MENOR QUE 18,5 MAGREZA 0
ENTRE 18,5 E 24,9 NORMAL 0
ENTRE 25,0 E 29,9 SOBREPESO I
ENTRE 30,0 E 39,9 OBESIDADE II
MAIOR QUE 40,0 OBESIDADE GRAVE III
*/