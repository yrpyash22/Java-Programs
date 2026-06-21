

//  ------------------------   { # }  Excepiion Handeling   ------------------------//


import java.util.Scanner;

// import javax.naming.InvalidNameException;
// import javax.swing.SortOrder;





class MyException extends Exception
{
    @Override
    public String toString()
    {
        return "I am toString()";
    }

    @Override
    public String getMessage()
    {
        return "I am getMessage() ";
    }
}

class NegativeRadiusExe extends Exception
{
    @Override
    public String toString()
    {
        return "Radius can not be negatiive!";
    }
    @Override
    public String getMessage()
    {
        return "Radios can not be negative!";
    }
}

public class Assignment_13_ {
    

    /*      //   Errors Eamaples
    public static void main(String[] args) {
        // Synntex error 
        // int a = 0

        // Logical Error
        // Write a Program to print number between 1 to 10
        System.out.println(2);
        for(int i = 0; i<5; i++)
        {
            System.out.println(2 * i + 1);
        }



        // Runtime error
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();    // when input take k = 0; 
        System.out.println("Integer part of 1000 divided by k is : "+ 1000/k);
    }*/







    //     try-catch 

    /*
    public static void main(String[] args) {
        int a = 6000;
        int b = 0;
        try{
            int c = a/ b;
            System.out.println(" The result is: "+ c);
        }catch (Exception e){
            System.out.print("We failed to divide0 Reason is : ");
            System.out.println(e);
        }
        System.out.println(" End the Program");
    }*/




    // Handal Specific Exception : by multiple catch method.
    /* 
    public static void main(String[] args) {
        int marks[] = new int[3];
        marks[0] = 7;
        marks[1] = 58;
        marks[2] = 6;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the arry index : ");
        int idx = sc.nextInt();

        System.out.print("Enter the number you want to divides the value with:");
        int number = sc.nextInt();
        try {
            System.out.println(" The value at index entered is  :  " + marks[idx]);
            System.out.println("The value of arry - value/number is : "+ marks[idx]/number);
        }
        catch (ArrayIndexOutOfBoundsException e2) {
            System.out.println("ArrayIndexOutOfBoundsException Found : "+ e2);
        }
        catch (ArithmeticException e) {
            System.out.println("Arithematic error found: " + e);
        }
        catch (Exception e1) {
            System.out.println("Some random error : "+ e1);
        }*/





        // Nested try-catch
        /* 
        public static void main(String[] args) {
        int marks[] = new int[3];
        marks[0] = 7;
        marks[1] = 58;
        marks[2] = 6;

        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        while (flag)
        {
            System.out.print("Enter the arry index : ");
            int idx = sc.nextInt();

            try {
                System.out.println(" Welocomr to 1-Try block");
                try{ 
                    System.out.println(" The value at index entered is  :  " + marks[idx]);
                    flag = false;
                }
                catch (ArrayIndexOutOfBoundsException e2) {
                    System.out.println(" Sory this index not exist : : "+ e2);
                }
            }
            catch (Exception e1) {
                System.out.println("Some random error : "+ e1);
            }
        }
    }*/






    // Exception class in java. 
    /*
    class MyException extends Exception
    {
        @Override
        public String toString()
        {
            return "I am toString()";
        }

        @Override
        public String getMessage()
        {
            return "I am getMessage() ";
        }
    }
     */
    
     // throw Keyword
     /*
    public static void main(String[] args) {
        int a;
        Scanner sc = new Scanner(System.in);
        System.out.print(" Enter number : ");
        a = sc.nextInt();
        if(a<9)
        {
            try{
                throw new MyException();
                //throw new ArithmeticException("This is an expression");
            }
            catch (Exception e){
                // System.out.println(e.getMessage());         // catch ->"This is an expression"
                // System.out.println(e.toString());           // MyException  -> toString()
                // System.out.println(e);                      // MyException  -> toString()

                e.printStackTrace();                           // Exception at (Line _)Assignment_13_.main(Assignment_13_.java:186)
                System.out.println(" Finished");
            }
            System.out.println("Yes Finished");
        }
    }*/



    // throw   vs   throws       keyword 
    /*
    public static int divide(int a, int b) throws ArithmeticException
    {
        int result = a/b;
        return result;
    }
    public static void main(String[] args) {
        try{
            int c = divide(6, 0);
            System.out.println(c);
        }catch(Exception e)
        {
            System.out.println("Exception : "+e);
        }
    }*/





   
    // exammple of throw and throws by class
    /*
    class NegativeRadiusExe extends Exception
    {
        @Override
        public String toString()
        {
            return "Radius can not be negatiive!";
        }
        @Override
        public String getMessage()
        {
            return "Radios can not be negative!";
        }
    }*/
    /*
    public static double area(int r) throws NegativeRadiusExe
    {
        if(r < 0)
        {
            throw new NegativeRadiusExe();
        }
        double result = Math.PI * r * r;
        return result;
    }
    public static void main(String[] args) {
        try {
            double ar = area(-6);
            System.out.println(ar);
        } catch (Exception e) {
            System.out.println(" Exception: "+ e );
        }
    }*/




    // finally {  }     method
    /*
    public static int great()
    {
        try {
            int a = 50;
            int b = 0;
            int c = a/b;
            return c; 
        }
        catch (Exception e) {
            System.out.println(e);
        }
        finally{
            System.out.println("Claning .....up");
        }
        return 0;
    }
    public static void main(String[] args) {
        int k = great();
        System.out.println(k);
    }*/


    // Example of try - catch - finally
    /*
    public static void main(String[] args) {
        int a, b;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        while (true) {
            try {
                System.out.println(a/ b);
            } catch (Exception e) {
                System.out.println(e);
                break;
            }
            finally{
                System.out.println("I am finally method ......."+ b);
            }
            b--;
        }
    }*/
 















    // Paractice set 
    // Custom calculater with following aperations 
    // 1 Add 
    // 2 sub
    // 3 mul
    // 4 div
    // which throws the following Excepiion:
    // 1 invalid input exception ex: 8 & 9;
    // 2 cannot divided bdsy 0 exception
    // 3 Max input Excepiion if any odf the input is greater then 100000
    // 4 dont allow multiplication input to be greater then 7000
    /*
    public static void main(String[] args) throws InvalidInputException, CannotDividedBYZeroException, MaxInputException
    {
        CustomCalculator obj = new CustomCalculator();

        boolean loop = true;
        do {
            System.err.print("Enter the choice :");
            Scanner sc = new Scanner(System.in);
            int n  = sc.nextInt();
            switch (n) {
                case 1: obj.add();
                    break;
                case 2: obj.subtract();
                    break;
                case 3: obj.multiply();
                    break;
                case 4: obj.divide();
                    break;
                case 5: System.out.println("Exit");
                    loop = false;
                    break;
                default: System.out.println("Invalid choice please enter choice between ( 1 to 5)");
                    break;
            }
        } while (loop);
    }*/
}





class InvalidInputException extends Exception
{

    @Override
    public String toString()
    {
        return "can not add 8 and 9";
    }
}
class CannotDividedBYZeroException extends Exception
{
    @Override
    public String toString()
    {
        return "can not Divided by 0";
    }
}
class MaxInputException extends Exception
{
    @Override
    public String toString()
    {
        return "cant give input greater then 100000";
    }
}

class CustomCalculator{
    Scanner sc = new Scanner(System.in);

    void add()  throws InvalidInputException, MaxInputException
    {
        System.out.println("Enter inpuut: ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        if(a>100000 || b> 100000)
        {
            throw new MaxInputException();
        }
        if(a == 8 && b == 9 )
        {
            throw new InvalidInputException();
        }
        System.out.println("Addition is : "+ (a+b));
    }
    void subtract()
    {
        System.out.println("Enter inpuut: ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        System.out.println("Subtract is : "+  (double)(a-b));
    }
    void multiply()
    {
        System.out.println("Enter inpuut: ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        System.out.println("Multiply is : "+ (double)(a*b));
    }
    void divide() throws CannotDividedBYZeroException
    {
        System.out.println("Enter inpuut: ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        if(b == 0)
        {
            throw new CannotDividedBYZeroException();
        }
        System.out.println("Divide is : "+ (double)(a/b));
    }
}





