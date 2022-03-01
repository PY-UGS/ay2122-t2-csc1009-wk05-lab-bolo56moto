package Qn2;

abstract class Shape{
    double dim1;
    double dim2;
    double pi;
    public abstract double area();

    public Shape(){

    }
    public Shape(double dim1,double dim2){
        this.dim1 = dim1;
        this.dim2 = dim2;
        this.pi = Math.PI;
        
    }
    
    

    

    

}