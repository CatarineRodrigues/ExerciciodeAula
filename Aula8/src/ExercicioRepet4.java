import java.util.Scanner;

public class ExercicioRepet4 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Insira um número inteiro");
        int i = 1;
        int n = leitor.nextInt();

        while(i <= n){
            if(i % 2 == 0){
            System.out.println(i);
            }
            i++;
        }
    }
}