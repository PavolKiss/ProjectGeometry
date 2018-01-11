package sk.akademiasovy.main;

import sk.akademiasovy.geometry.Rectangle;
import sk.akademiasovy.geometry.Square;

public class Main {

    public static void main(String[] args) {
        Square square1 = new Square(7.5); //premennej square 1 vytvorim pamatove miesto - (new)
        Square square2 = new Square();

        System.out.println("Area of square 1 is: "+square1.getArea());
        System.out.println("Perimeter: "+square1.getPerimeter());
        System.out.println("Diagonal: "+square1.getDiagonal());


        Rectangle rectangle1 = new Rectangle(18.5,11.15);
        System.out.println("Rectangle area:"+rectangle1.getAreaofRectangle();
    }







}
