package sk.akademiasovy.geometry;

public class Rectangle {
    private double a,b;

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public Rectangle(double value, double value2){
        a  = value;
        b = value2;
    }

    public Rectangle {
        a=0;
        b=0;
    }

    public double getAreaofRectangle(){
        return a*b;
    }

    public double getPermiterof(){
        return 2*(a+b);
    }

    public  void transpose(){
        double temp;
        temp=a;
        a=b;
        b=temp;
    }
}
