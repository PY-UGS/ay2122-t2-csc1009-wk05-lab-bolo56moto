package Qn1;
import java.util.Date;

public class GeometricObject {
    private String color;
    private boolean filled;
    private Date dateCreate = new Date();

    public GeometricObject(){
        
    }
    public GeometricObject(String color, boolean filled){
        this.color = color;
        this.filled = filled;
        
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return this.filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public Date getDateCreate() {
        return this.dateCreate;
    }

    public String toString(){
       return "created on "+getDateCreate()+"\ncolor: "+getColor()+" and filled "+isFilled();
    
   }

}
