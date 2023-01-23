import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Въведи число от 5 до 200");
        int a=input.nextInt();
        while(true)
        {
            if(a>5 && a<200) {
                System.out.println("Браво");
                break;
            }
            else {
                System.out.println("Въведи число в правилния интервал");
                a=input.nextInt();
            }
        }
    }
}