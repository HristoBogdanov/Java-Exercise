import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        Dice d20=new Dice(20);
        d20.printDiceInfo();
        System.out.println(d20.rollDice());
        System.out.println("Enter number of throws");
        int number=input.nextInt();
        System.out.println(d20.rollDice(number));
        d20.printDiceInfo();
    }
}