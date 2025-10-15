import java.util.Scanner;

class demo
{
    public static void main(String[] args) {
        Scanner sacn=new Scanner(System.in);
        System.out.println("Enter 2 no.");
        int a = sacn.nextInt();
        int b = sacn.nextInt();
        int g = a>b ? a:b;
        System.out.println("Greatest no. is "+g);
    }
}