import java.util.Scanner;

public class ExercicioCond5 {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);

        System.out.println("Insira um número");
        float numero1 = leitor.nextFloat();

        System.out.println("Insira um número diferente");
        float numero2 = leitor.nextFloat();
        
        if(numero1 > numero2){
            System.out.println("O número maior é "+numero1);
        } else{
            System.out.println("O número maior é "+numero2);
        }
    }
}