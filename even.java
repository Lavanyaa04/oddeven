import java.util.Scanner;
public class even
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number; : ");
        int a = sc.nextInt();

        if(a % 2 == 0)
        {
            System.out.println("The given number is even ");
        }
        else
        {
            System.out.println("The given number is odd");
        }
        
    }
}