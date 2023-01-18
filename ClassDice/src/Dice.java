import java.sql.SQLSyntaxErrorException;
import java.util.Random;

public class Dice {
    private int size;
    private String color;
    private int maxRoll;

    public void setSize(int size) {
        this.size = size;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setBroken(boolean broken) {
        isBroken = broken;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }

    public int getSize() {
        return size;
    }

    public String getColor() {
        return color;
    }

    public boolean isBroken() {
        return isBroken;
    }

    public int getCounter() {
        return counter;
    }

    private boolean isBroken;
    private int counter;

    public int getMaxRoll(){
        return maxRoll;
    }
    public void setMaxRoll(int maxRoll){
        if(maxRoll>0){
            this.maxRoll=maxRoll;
        }
        else{
            System.err.println("Invalid dice!");
        }
    }

    public Dice(int maxRoll)
    {
        this.maxRoll=maxRoll;
    }
    public void printDiceInfo(){
        System.out.println("Size: " + size + " color: "+color+" maxRoll: "+maxRoll+" counter: "+counter);
    }
    public int rollDice(){
        Random rng=new Random();
        int rolledDice=rng.nextInt(0,maxRoll)+1;
        this.counter++;
        return rolledDice;
    }
    public String rollDice(int count)
    {
        int[]a=new int[count];
        for(int i=0;i<count;i++)
        {
            a[i]=rollDice();
            System.out.println(a[i]);
        }
        int max=a[0];
        for (int i=0;i<count;i++)
        {
            if(a[i]>max)max=a[i];
            if(max==maxRoll)return "The max value was "+maxRoll;
        }
        String result="The max value was "+max;
        return result;
    }

}
