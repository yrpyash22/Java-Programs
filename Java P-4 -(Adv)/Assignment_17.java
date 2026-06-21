
// =-------   Some Adv Topics 




// Annotations
/* 
class Phone
{
    public void showTime()
    {
        System.out.println("The time is 8 Am");
    }
}
class SmartPhone extends Phone
{
    @Override
    public void showTime()
    {
        System.out.println("The time is 8 Pm");
    }
}


class Cal{
    @Deprecated
    public int sum(int a, int b)
    {
        return a+b;
    }
}

// [4] @Functional Interface.
    @FunctionalInterface
    interface myFunInterface
    {
        void meth1();
        //void meth2();     // only onr function is allow
    }



public class Assignment_17 {
    

    // Annotations (take meta data)
    @SuppressWarnings("@Deprecated")
    public static void main(String[] args) 
    {
    // [1] @Override
        // SmartPhone sp = new SmartPhone();
        // sp.showTime();


    // [2] @Deprected
        // Cal cl = new Cal();
        // System.out.println("Sum is : "+ cl.sum(15, 58));


    // [3] @SuppressWarning
        Cal cl2 = new Cal();
        System.out.println("Sum is : "+ cl2.sum(150, 580));
    }
}

*/







// Asomymous Classes
/*
interface DemoAno{
    void meth1();
    void meth2();
}

// class AnnoyDemo implements DemoAno
// {
//     @Override
//     public void meth1()
//     {
//         System.out.println("I am meth 1");
//     }
//     @Override
//     public void meth2()
//     {
//         System.out.println("I am meth 2");
//     }
// }

public class Assignment_17
{
    public static void main(String[] args) {
        //     // Anonymous class
        DemoAno obj  = new DemoAno() {
            @Override
            public void meth1()
            {
                System.out.println("I am meth 1");
            }
            @Override
            public void meth2()
            {
                System.out.println("I am meth 2");
            }
        };
        obj.meth1();
        obj.meth2();
    }
}
*/






// Lambda Expressions
/*
@FunctionalInterface
interface Lambda
{
    Void method1(int a);
}

public class Assignment_17
{
    public static void main(String[] args) 
    {
        Lambda obj = (a)->{ 
            System.out.println("I am method1 from lambda interface "+ a);
        };
        obj.method1(10);
    }
}
*/