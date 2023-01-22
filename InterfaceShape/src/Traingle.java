public class Traingle implements IShape{

    private double a;
    private double b;
    private double c;
    private double ha;

    public Traingle(double a,double b,double c, double ha)
    {
        this.a=a;
        this.b=b;
        this.c=c;
        this.ha=ha;
    }

    @Override
    public double calculateArea() {
        return (a*ha)/2;
    }

    @Override
    public double calculatePerimeter() {
        return a+b+c;
    }
}
