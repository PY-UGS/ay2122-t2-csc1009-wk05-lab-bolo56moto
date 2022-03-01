package Qn2;

public class Rectangle extends Shape{
    public Rectangle(double dim1,double dim2){
        super(dim1,dim2);

    }
    
    public double area(){
        
        double area = dim1 * dim2;
        return area;
    
    }
    
}
