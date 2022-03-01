package Qn2;

public class Ellipse extends Shape{
    public Ellipse(double dim1,double dim2){
        super(dim1,dim2);
        

    }
   
    public double area(){
        
        double area = dim1 * dim2 * pi;
        return area;
    
    }
}
