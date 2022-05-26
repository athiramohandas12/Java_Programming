import java.util.Scanner;
class OddOrEven{
    public static void main(String[] args) // Main Driver Method
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();
        if (num % 2 == 0) {
            System.out.println( num+" is Even");
        }
 
        else {
            System.out.println(num+" is Odd");
        }
    }
}

