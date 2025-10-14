import java.util.Scanner;
class demo
{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter Percentage");
        double n=scan.nextInt();
        if(n>=75)
        {
            System.out.println("Passed with DT");
        }
        else
            if(n>=60)
            System.out.println("Passed with 1st class");
            else
                if(n>=40)
                System.out.println("Passed");
                else
                    System.out.println("Failed");
    }
}