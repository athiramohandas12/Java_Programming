import java.util.Scanner;
public class Shapes
{
    int r, l, b, a,ch;
    double pi = 3.14,Area;
    Scanner s = new Scanner(System.in);
    void circle()
    {
        System.out.print("Enter radius of circle:");
        r = s.nextInt();
        Area =  pi * r*r;
        System.out.println("Area of circle:"+Area);
    } 
    void rectangle()
    {
        System.out.print("Enter length of rectangle:");
        l = s.nextInt();
        System.out.print("Enter breadth of rectangle:");
        b = s.nextInt();
        Area = l*b;
        System.out.println("Area of rectangle:"+Area);
    }
    void square()
    {
        System.out.print("Enter side of square:");
        a = s.nextInt();
        Area = a*a;
        System.out.println("Area of triangle:"+Area);
    }
    public static void main(String[] args) {
    while(true) {
     int ch;
    Scanner s = new Scanner(System.in);
    	System.out.print("Enter your choice\n");
    	 
    	System.out.print("1.Area of Cirlce\n");
    	System.out.print("2.Area of Rectangle\n");
    	System.out.print("3.Area of Square\n");
    	System.out.print("4.Exit");
    	ch = s.nextInt();
       Shapes obj = new Shapes();
       switch (ch) {
       case 1:
        obj.circle();
        break;
       case 2:
        obj.rectangle();
        break;
       case 3:
        obj.square();
        break;
       case 4:
    	   System.exit(0);
    
    default:
    System.out.println("Make valid choice");
    }
}
}
    }