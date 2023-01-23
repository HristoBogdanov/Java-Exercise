import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float width = in.nextFloat();
        float length = in.nextFloat();
        float height = in.nextFloat();
        float averageAstHeight = in.nextFloat();

        float volumeShip=width*height*length;
        float roomVolume=2*2*(averageAstHeight+0.40f);

        float countFloat=volumeShip/roomVolume;
        double d=countFloat;

        int x = (int)Math.round(d);

        if(Math.floor(d)<3)
        {
            System.out.println("The spacecraft is too small.");
        }
        else if(Math.floor(d)>10)
        {
            System.out.println("The spacecraft is too big.");
        }
        else
        {
            System.out.println("The spacecraft holds " + x + " astronauts.");
        }

    }
}