import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Въведи число");
        int number1=input.nextInt();
        System.out.println("Въведи число");
        int number2=input.nextInt();
        int resultPlus,resultMultiply,resultDevide,resultDevide2,resultMinus;
        resultMultiply=number1*number2;
        resultDevide=number1/number2;
        resultPlus=number1+number2;
        resultDevide2=number1%number2;
        resultMinus=number1-number2;
        System.out.println("a+b= " + resultPlus);
        System.out.println("a*b= " + resultMultiply);
        System.out.println("a/b= " + resultDevide);
        System.out.println("a%b= " + resultDevide2);
        System.out.println("a-b= " + resultMinus);

    }
}