import java.util.Scanner;

public class ExercicioRepet1 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        for(int i = 0; i <= 100; i++){
            if(i % 2 == 0){
            System.out.println(i);
            }
        }
    }
}