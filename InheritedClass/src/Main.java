import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        Car c1=new Car("Трабант",4,25,0.6);

        System.out.println(c1.goToLocation("Sofia"));
        System.out.println(c1.goToLocation("Varna"));
        System.out.println(c1.toString());

        System.out.println("Въведете локация за премахване: ");
        String removedLocation=input.nextLine();
        System.out.println(c1.removeLocation(removedLocation));
        System.out.println(c1.toString());
    }
}