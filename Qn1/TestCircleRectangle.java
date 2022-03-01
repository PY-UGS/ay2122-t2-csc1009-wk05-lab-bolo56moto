package Qn1;
import java.util.Scanner;
public class TestCircleRectangle {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
            
            System.out.println("What is the color : ");
            String color = sc.next();
            System.out.println("Is it filled (0. True 1. False)");
            int check = sc.nextInt();
            System.out.println("What is the radius : ");
            double radius = sc.nextDouble();
            System.out.println("What is the width of the Square: ");
            double width = sc.nextDouble();
            System.out.println("What is the height of the Square: ");
            double height = sc.nextDouble();
            boolean filled;
            Circle circle = new Circle();
                if(check == 0){
                    filled = true;
                    circle = new Circle(radius,color,filled);
                } else if (check == 1){
                    filled = false;
                    circle = new Circle(radius,color,filled);
                } else{
                    System.out.println("Error, value can only be 1 or 0");
                }
                System.out.println("A circle "+circle.toString());
                System.out.println("The color is "+circle.getColor());
                System.out.println("The radius is "+circle.getRadius());
                System.out.println("The area is "+circle.getArea());
                System.out.println("The diameter is "+circle.getDiameter());
        
        
        
        
            
            Rectangle rectangle = new Rectangle();
                if(check == 0){
                    filled = true;
                    rectangle = new Rectangle(width,height,color,filled);
                } else if (check == 1){
                    filled = false;
                    rectangle = new Rectangle(width,height,color,filled);
                } else{
                    System.out.println("Error, value can only be 1 or 0");
                }
                
                System.out.println("\nA rectangle "+rectangle.toString());
                System.out.println("The area is "+rectangle.getArea());
                System.out.println("The perimeter is "+rectangle.getPerimeter());
            
            
            sc.close(); 
    }
}
