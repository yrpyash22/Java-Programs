
//           Bit  Manipulation 

//import java.util.*;

public class Assignment_9_ {

    // [Q - 1] Check if a number is odd or even
    public static void check_O_E(int n) {
        int bitmark = 1;
        if ((n & bitmark) == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }




    // Operaaton

    // [1] get bit
    public static int get_bit(int n, int i) {
        int bitmark = 1 << i;
        if ((n & bitmark) == 0) {
            return 0;
        } else {
            return 1;
        }
    }

    // [2] set ith bit
    public static int set_bit(int n, int i) {
        int bitmark = 1 << i;
        return n | bitmark;
    }

    // [3] Clear ith bit
    public static int clear_bit(int n, int i) {
        int bitmark = ~(1 << i);
        return n & bitmark;
    }

    // [4] Update ith bit
    public static int update_bit(int n, int i, int newb) {
        // if(newb == 0)
        // {
        // return clear_bit(n, i);
        // }
        // else{
        // return set_bit(n, i);
        // }
        n = clear_bit(n, i);
        int bitmark = newb << i;
        return n | bitmark;
    }









    // [Q- 2] Check if a number is a Power of 2 or not
    public static boolean is_Pow_of_two(int n) {
        int val = n & (n - 1);
        return val == 0;
    }

    // [Q- 3] count set bits in s number
    public static int count_set_bit(int n) {
        int count = 0;
        while (n > 0) {
            if ((n & 1) != 0) {
                count++;
            }
            n = n >> 1;
        }
        return count;
    }





    // Fast Exponentiation
    // a^n, --> 2^5, 3^3
    public static int fast_Exp(int a, int n) {
        int ans = 1;
        while (n > 0) {
            if ((n & 1) != 0) {
                ans = ans * a;
            }
            a = a * a;
            n = n >> 1;
        }
        return ans;
    }





    // [A-2] Seap two number
    public static void swap_by_bit(int a, int b) {
        System.out.println("a = " + a + ", " + "b = " + b);
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println("a = " + a + ", " + "b = " + b);
    }

    // [A - 3] Add 1 to an integer using Bit Manipulation
    public static void add_one_int() {
        int x = 6;
        System.out.println(x + " + " + 1 + " is " + -~x);
        x = -4;
        System.out.println(x + " + " + 1 + " is " + -~x);
        x = 0;
        System.out.println(x + " + " + 1 + " is " + -~x);
    }



    // [A - 4] This question is based on a trick, look at the solution.
    // Convert uppercase characters to lowercase using bits

    public static void conv_up_to_law() 
    {
        // Convert uppercase character to lowercase
        for(char ch ='A'; ch <='Z'; ch++) 
        {
            System.out.println( (char)(ch | ' ' ) );
            // prints abcdefghijklmnopqrstuvwxyz}
        }
    }




    public static void main(String args[]) {
        //System.out.println(2 & 6);

        //int a = 10, b = 25;
        //swap_by_bit(a, b);

        //add_one_int();

        conv_up_to_law();
    }
}
