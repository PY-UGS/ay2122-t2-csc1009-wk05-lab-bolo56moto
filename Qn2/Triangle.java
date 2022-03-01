package Qn2;

public class Triangle extends Shape{
    public Triangle(double dim1,double dim2){
        super(dim1,dim2);
        

    }
    

    public double area(){
        
        double area = dim1 * dim2* 0.5;
        return area;
    
    }
}
