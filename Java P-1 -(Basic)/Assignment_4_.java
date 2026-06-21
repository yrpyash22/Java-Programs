//                                 Chapter 4

//                              Function and method   
//import java.util.*;
public class Assignment_4_ {
    
    // Basic code 
    /*public static void hello_world()
    {
        System.out.println("Hello World");
    }

    public static int sumCal(int a , int b)
    {
        int sum = a + b;
        return sum;
    }
    public static void main (String args[])
    {
        hello_world();
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(sumCal(a,b));
    }*/



//  E-1 Bionimal Cofficienr [nCr] = n!/ r! (n-r)!
//  n = 5, r = 2 
    /*public static int factorial(int n)
    {
        int f = 1;
        for(int i = 1 ; i <= n; i++)
        {
            f = f * n;
        }
        return f;
    }
    public static float bionimal_coff(int n, int r)
    {
        int a = factorial(n);
        int b = factorial(r);
        int c = factorial(n-r);
        float bicoff = a / (b*c);
        return bicoff;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n,r;
        System.out.print("Enter value of n :");
        n = sc.nextInt();
        System.out.print("Enter value of r :");
        r = sc.nextInt();
        float bicoff = bionimal_coff(n, r);
        System.out.println("BionomiaL Cofficient of "+n+"C"+r+" is :" + bicoff);
    }*/



//   E-2 to check the number is prime or not 
    /*public static boolean isPrime(int n)
    {
        boolean isprime = true;
        if(n == 2 || n == 1)
        {
            return true;
        }
        for(int i = 2; i <= Math.sqrt(n); i++)
        {
            if(n % i == 0)
            {
                return false;
            }
        }
        return isprime;
    }

    public static void printPrime(int n)
    {
        for(int i = 2; i<= n; i++)
        {
            if(isPrime(i))
            {
                System.out.print(i+ " ");
            }
        }
        System.out.println();
    }
    public static void main(String args[])
    {
        System.out.println(isPrime(23));
        printPrime(23);
    }*/



//  E-3 Conver
//        Binary to decimal     
    /*public static void binary_to_decimal(int binarynum)
    {
        int mynum = binarynum;
        int pow = 0;
        int decmalNumber = 0;
        while (binarynum > 0)
        {
            int lastDigit = binarynum % 10 ;   // store lastdigit 
            decmalNumber = decmalNumber + (lastDigit * (int)Math.pow(2,pow));
            pow++;
            binarynum = binarynum / 10;     // remove last digit
        }
        System.out.println("Decimal of number :"+ mynum +" is : "+ decmalNumber);
    }

//     Decimal to Binary
    public static void decimal_to_binary(int decimalnum)
    {
        int mynum = decimalnum;
        int pow = 0;
        int binarynum = 0;
        while (decimalnum > 0)
        {
            int reminder = decimalnum % 2 ;   // find reminder 
            binarynum = binarynum + (reminder * (int)Math.pow(10,pow));
            pow++;
            decimalnum = decimalnum / 2;     // devided by 2 of all digit 
        }
        System.out.println("Binary of number :"+ mynum +" is : "+ binarynum);
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        binary_to_decimal(111);
        decimal_to_binary(15);
    }*/






//    E-4 Check the number is polindrome or not 
// NOTE :- 121  <-> 121 [true]  And  154 <-> 451 [false]  
    public static boolean isPolindrome(int num)
    {
        int polindrome = num;
        int reverse = 0;
        while(polindrome > 0)
        {
            int lastDigit = polindrome % 10;
            reverse = (reverse * 10) + lastDigit;
            polindrome = polindrome/10;
        }
        if(num == reverse)
        {
            return true;
        }
        return false;
    }





    public static void main(String args[])
    {
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter number :");
        // int n = sc.nextInt();
        // boolean p = isPolindrome(n);
        // System.out.println(p);
    }
}
