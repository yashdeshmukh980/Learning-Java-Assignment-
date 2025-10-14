import java.util.Scanner;
class demo
{
    public static void main (String [] args)
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a Radius");
        int r=scan.nextInt();
        double a,c;
        a= 3.14*r*r;
        c= 2*3.14*r;
        System.err.println("Area is "+a);
        System.err.println("Circumference is "+c);
    }    
}
