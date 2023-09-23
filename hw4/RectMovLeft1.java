import java.awt.Point;
import java.awt.Rectangle;

public class RectMovLeft1 {

    public static void main(String[] args) {    
        Point p = new Point(3, 4);
        Rectangle box = new Rectangle(0, 0, 100, 200);
        rectchanging(box, p);
    }
    public static void rectchanging(Rectangle box, Point p){


 
        rectmovleft(box, p);


        System.out.println(box);
    }

    public static void rectmovleft(Rectangle box, Point p){

        if(p.x<0){
            throw new Error("Usage: input x is not legal");
    
        }

        box.x = box.x + p.x;
        box.y = box.y + p.y;
        
    }
}