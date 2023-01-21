import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a:");
        double a= input.nextInt();
        System.out.println("Enter b:");
        double b= input.nextInt();
        System.out.println("Enter c:");
        double c= input.nextInt();

        double d=b*b-(4*a*c);

        if(d==0)System.out.println("The result is "+ ((b*(-1))/2*a));
        else if (d<0)System.out.println("The result is not a real number");
        else {
            double result1=(b*(-1)+Math.sqrt(d))/(2*a);
            double result2=(b*(-1)-Math.sqrt(d))/(2*a);

            System.out.println("The one result is: "+Math.round(result1));
            System.out.println("The other1 result is: "+Math.round(result2));
        }
    }
}