import java.util.Scanner;

public class ExercicioCond6 {
    public static void main(String[] args){
        Scanner leitor1 = new Scanner(System.in);

        System.out.println("Insira o nome de um time");
        String time1 = leitor1.nextLine();

        System.out.println("Insira a quantidade de gols feitos");
        int gols1 = leitor1.nextInt();
        
        Scanner leitor2 = new Scanner(System.in);

        System.out.println("Insira o nome do outro time");
        String time2 = leitor2.nextLine();

        System.out.println("Insira a quantidade de gols feitos");
        int gols2 = leitor2.nextInt();
        
        if(gols1 > gols2){
            System.out.println("O time vencedor foi o "+time1);
        } else if(gols1 == gols2){
            System.out.println("O jogo terminou em empate");
        } else{
            System.out.println("O time vencedor foi o "+time2);
        }
    }
}