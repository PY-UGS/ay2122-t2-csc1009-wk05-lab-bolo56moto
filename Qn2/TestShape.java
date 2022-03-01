package Qn2;

import java.text.DecimalFormat;
import java.util.Scanner;

public class TestShape {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of dimension 1: ");
        double dim1 = sc.nextDouble();
        System.out.println("Enter value of dimension 2(Unused for circle): ");
        double dim2 = sc.nextDouble();
        sc.close();
        Rectangle r = new Rectangle(dim1,dim2);
        Triangle t = new Triangle(dim1,dim2);
        Circle c = new Circle(dim1,dim2);
        Ellipse e = new Ellipse(dim1,dim2);
        Square s = new Square(dim1,dim2);
        Shape figref;
        DecimalFormat df = new DecimalFormat("#.##");
        figref = r;
        System.out.println("Area of Rectangle");
        System.out.println("Area is  "+ df.format(figref.area()));
        figref = t;
        System.out.println("Area of Triangle");
        System.out.println("Area is  "+ df.format(figref.area()));
        System.out.println("Area of Circle");
        figref = c;
        System.out.println("Area is  "+ df.format(figref.area()));
        System.out.println("Area of Ellipse");
        figref = e;
        System.out.println("Area is  "+ df.format(figref.area()));
        System.out.println("Area of Square");
        figref = s;
        System.out.println("Area is  "+ df.format(figref.area()));


    }
}
