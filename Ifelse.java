import java.util.Scanner;

class demo 
{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a Number:");
        int N=scan.nextInt();
        if(N%2==0)
        {
            System.out.println("Even Number.");
        }
        else
        {
            System.out.println("Odd Number.");
        }
    }
}
