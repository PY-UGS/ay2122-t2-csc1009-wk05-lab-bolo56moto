package Qn1;

public class Circle extends GeometricObject{
    private double radius;

    public Circle(){

    } 
    public Circle(double radius){
        this.radius = radius;
    }
    public Circle(double radius,String color, boolean filled){
        super(color,filled);
        this.radius = radius;
        
       
    }
    

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea(){
        double area = Math.pow(getRadius(),2)*Math.PI;
        return area;

    }

    public double getPerimeter(){
        double perimeter = 2*Math.PI *getRadius();
        return perimeter;

    }

    public double getDiameter(){
        return 2*radius;
    }

    public void printCircle(){
        
    }

   
}
