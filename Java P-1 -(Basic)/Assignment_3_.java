                                // Assignment_3_
                                
                                // Loops Statements

//import java.util.*;

public class Assignment_3_
{

    // Q1 Reverse of number
    /*public static void main(String args[])
    {
        int n = 22092;
        while( n > 0)
        {
            int lastDigit = n % 10;
            System.out.print(lastDigit);
            n = n/10;
        }
        System.out.println();
    }*/


    // Q2 Reverse of a given number
    /*public static void main(String args[])
    {
        int n = 22092;
        int rev = 9;
        while( n > 0)
        {
            int lastDigit = n % 10;
            rev  = (rev*10) + lastDigit;
            System.out.print(lastDigit);
            n = n/10;
        }
        System.out.println();
    }*/



    //  "continue"  and " break " statement
    /*public static void main(String args[])
    {
        System.out.println(" break statement");
        for(int i = 1 ; i <= 8 ; i++)
        {+
            if(i == 4)
            {
                break;
            }
            System.out.println(i);
        }
        System.out.println(" continue statement");
        for(int i = 1 ; i <= 8 ; i++)
        {
            if(i == 3)
            {
                continue;
            }
            System.out.println(i);
        }
    }*/


    // Q3 Check if number is Prime or not
    /*public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean isprime = true;
        if(n == 2 )
        {
            System.out.println(n + " is a prime number");
        }
        else
        {
            for(int i = 2; i <n-1; i++)
            {
                if(n % i == 0)
                {
                    isprime = false;
                }
            }
            if(isprime == true)
            {
                System.out.println(n + " is a Prime number");
            }
            else {
                System.out.println(n + " is not a prime number");
            }
        }
    }*/



    // Q4 Print a pattern
    // *
    // **
    // ***
    // ****
    /*public static void main(String args[])
    {
        int n = 4;
        for(int line = 1; line <= n; line++ )
        {
            for(int star = 1; star <= line; star++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }*/


    // Q5 print a inverse pattern
    // ****
    // ***
    // **
    // *
    /*public static void main(String args[])
    {
        int n = 4;
        for(int line = 1; line <= n; line++ )
        {
            for(int star = 1; star <= (n - line + 1) ; star++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }*/


    // Q6 Print Half pyramid pattern
    // 1
    // 12
    // 123
    // 1234
    /*public static void main(String args[])
    {
        int n = 4;
        for(int line = 1; line <= n; line++ )
        {
            for(int star = 1; star <= line; star++)
            {
                System.out.print(star);
            }
            System.out.println();
        }
    }*/


    // Q7 Print char pyramid
    // A
    // BC
    // DEF
    // GHIJ
    /*public static void main(String args[])
    {
        int n = 4;
        char ch = 'A';
        for(int line = 1; line <= n; line++ )
        {
            for(int star = 1; star <= line; star++)
            {
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }*/



    // Q8 Read set of intiger and print sum of odd and even number ?
    /*public static void main (String args[]) 
    {
        Scanner sc = new Scanner(System.in);
        int num, choice;
        int evensum = 0;
        int oddsum = 0;
        do{
            System.out.print("Enter the number : ");
            num = sc.nextInt();
            if(num%2 == 0)
            {
                evensum = evensum + num;
            }
            else{
                oddsum += num;
            }
            System.out.print("If continue then 1 otherwise 0: ");
            choice = sc.nextInt();
        }while(choice == 1);

        System.out.println("Sum of even : " + evensum);
        System.out.println("Sum of odd : " + oddsum);
    }*/
    



//   Q9 Print Factorial if any number

    public static void main (String args[])
    {
        // Scanner sc = new Scanner(System.in);
        // int num;
        // int f = 1;
        // System.out.print("Enter number : ");
        // num = sc.nextInt();
        // for(int i = 1; i<= num; i++)
        // {
        //     f = f*i;
        // }
        // System.out.println("Factorial of ["+ num +"] is :" + f);
    }
}
