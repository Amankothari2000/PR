import java.util.*;

public class Lab6 {
    public static void circleCircleIntersection(double x0, double y0, double r0, double x1, double y1, double r1){
        //Declaring variables
        double a, dx, dy, d, h, rx, ry, xi, yi, xi_prime, yi_prime;
        double x2, y2;

        dx = x1 - x0;
        dy = y1 - y0;

        d = Math.sqrt((dy*dy) + (dx*dx));

        a = ((r0*r0) - (r1*r1) + (d*d)) / (2.0 * d) ;

        x2 = x0 + (dx * a/d);
        y2 = y0 + (dy * a/d);

        h = Math.sqrt((r0*r0) - (a*a));

        rx = -dy * (h/d);
        ry = dx * (h/d);

        xi = x2 + rx;
        xi_prime = x2 - rx;
    
        yi = y2 + ry;
        yi_prime = y2 - ry;


        System.out.println("\nxi = "+xi+"  yi = "+yi+"  xi_prime = "+xi_prime+"  yi_prime = "+yi_prime);
        
    }
    
    public static  void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double x0, y0, r0, x1, y1, r1;
        System.out.println("Enter x0 y0 r0 -->");
        x0 = sc.nextDouble();
        y0 = sc.nextDouble();
        r0 = sc.nextDouble();

        System.out.println("Enter x1 y1 r1 -->");
        x1 = sc.nextDouble();
        y1 = sc.nextDouble();
        r1 = sc.nextDouble();
        
        Lab6.circleCircleIntersection(x0,y0,r0,x1,y1,r1);
        
    }
    
}
