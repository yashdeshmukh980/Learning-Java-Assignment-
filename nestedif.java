import java.util.Scanner;

class demo
{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter your number: ");
        int n=scan.nextInt();
        if(n>=10 && n<=99)
        {
            System.out.println("It is 2 digit no.");
            int f=n/10;
            int l=n%10;
            if(f==l)
            {
                System.out.println("Both digit are same");
            }
            else
            {
                System.out.println("Both digit are not same");
            }
        }
        else
        {
            System.out.println("It is not 2 digit no.");
        }
    }
}
