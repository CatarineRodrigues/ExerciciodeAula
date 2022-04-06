import java.util.Scanner;

public class ExercicioCond7 {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);

        System.out.println("Insira a sua idade");
        int idade = leitor.nextInt();
        
        if(idade >= 18){
            System.out.println("O usuário é maior de idade.");
        } else{
            System.out.println("O usuário não é maior de idade.");
        }
    }
}