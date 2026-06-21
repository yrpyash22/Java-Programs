
//                   Strings 

import java.util.*;

// used
// import java.util.Arrays;
// import java.util.Scanner;




public class Assignment_8_ {
    // Scanner sc = new Scanner(System.in);
    // String name = sc.next();     // take a input only one word
    // String name2 = sc.nextLine();   // Line with the scape







    // [Q - 1] Check if a string is palindrome.
    // ex- mo|on , madam
    public static boolean isPalindrome(String str)
    {
        int n = str.length();
        for(int i = 0; i< n / 2; i++)
        {
            if(str.charAt(i) != str.charAt(n-i-1))
            {
                return false;
            }
        }
        return true;
    }



    // [Q- 2] A raute containg 4 direction (E,W,N,S) find shortest path to reach destinstion 
    //  "WNEENESENNN"
    public static float get_Shortest_path(String path)
    {
        int x = 0, y =0;
        for(int i = 0; i<path.length(); i++)
        {
            char dir = path.charAt(i);
            // South
            if(dir == 'S') {y--;}
            // North
            else if(dir == 'N'){ y++;}
            else if(dir == 'W'){ x--;}
            else if(dir == 'E'){ x++;}
        } 
        int x2 = x*x;
        int y2 = y*y;
        return (float)Math.sqrt(x2+y2);
    }




    // [Q - 3] For a given set of string print the largest string ("apple", "banana", "mango")
    //  Lexicographiic   compair the two strings 
    // if str1 == str2 === 0
    // if str1 > str2 === +ve
    // if str1 < str2 === -ve
    public static void compair_str()
    {
        String fruits[] = {"apple", "banana", "mango"};
        String larger = fruits[0];
        for(int i = 1; i<fruits.length; i++)
        {
            if(larger.compareTo(fruits[i]) < 0)
            {
                larger = fruits[i];
            }
        }
        System.out.println(larger);
    }






    //  StringBuilder
    // [Q-4] For a given string convert each the first letter oof each words to uppercase.
    // eex = "hi i am yashraj" =  " Hi I Am Yashraj"
    // Character.toupperCase(str);
    public static String to_upperCase(String str)
    {
        StringBuilder strb = new StringBuilder("");
        char ch = Character.toUpperCase(str.charAt(0));
        strb.append(ch);
        for(int i = 1; i<str.length(); i++)
        {
            if(str.charAt(i) == ' ' && i<str.length()-1)
            {
                strb.append(str.charAt(i));
                i++;
                strb.append(Character.toUpperCase(str.charAt(i)));
            }
            else{
                strb.append(str.charAt(i));
            }
        }
        return strb.toString();
    }






    // [Q- 5] String Compression.
    // "aaabbbcccdd"  --> a3b3c3d2

    public static String compress_string(String str)
    {
        StringBuilder strb = new StringBuilder();

        for(int i = 0; i<str.length(); i++)
        {
            Integer count = 1;
            while (i<str.length()-1 && str.charAt(i)== str.charAt(i+1)) 
            {
                count++;
                i++;    
            }
            strb.append(str.charAt(i));
            if(count>1)
            {
                strb.append(count.toString());
            }
        }
        return strb.toString();
    }




    // [A - 4] Check the 2 string are anogroms of eachother
    //  "carrace"(40) , "racecar"(40) --> a+c+a+c+e+r+r = 40

    public static void check_Anogram(String str1, String str2)
    {
        // Convert both in the form of lawercase if has
        String s1 = str1.toLowerCase();
        String s2 = str2.toLowerCase();

        if(s1.length() == s2.length())
        {
            // convert string to arry char
            char s1chararry[] = s1.toCharArray();
            char s2chararry[] = s2.toCharArray();

            // Short the arry
            Arrays.sort(s1chararry);
            Arrays.sort(s2chararry);

            boolean result = Arrays.equals(s1chararry, s2chararry);
            if(result)
            {
                System.out.println(s1+" and "+ s2  +" are Anagostrom ");
                return;
            }
            else{
                System.out.println("not Anagrams");
                return;
            }
        }
        System.out.println("bot are Different length");
    }








    public static void main(String [] args)
    {

        String pal = "racecar";
        System.out.println(isPalindrome(pal));



        String path = "WNEENESENNN";
        System.out.println(get_Shortest_path(path));


        String strb_1 = "hi i am yashraj";
        System.out.println(to_upperCase(strb_1));


        String comp = "aaabbcccdd";
        System.out.println(compress_string(comp));


        String s1 = "earth", s2 = "heart";
        check_Anogram(s1, s2);
    }
}
