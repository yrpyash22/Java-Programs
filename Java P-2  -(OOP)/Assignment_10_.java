
// -------------------     Object Oriented Programming       -------------------//



public class Assignment_10_ {




    /* 
    //                    {#} Class and Object
    static class Pen              // create a class (Pen)
    {
        String color;
        int tip;

        void setColor(String nameColor)
        {
            color = nameColor;
        }
        void setTip(int newtip)
        {
            tip = newtip;
        }
    }

    public static void main(String args[])
    {
        Pen p1 = new Pen();   // Create a object (p1)
        p1.setColor("blue");
        System.out.println(p1.color);
        p1.tip = 12;
        System.out.println(p1.tip);
        p1.setTip(15);
        System.out.println(p1.tip);
        p1.setColor("red");
        System.out.println(p1.color);
    }*/




    //                         { # } Accessc Modifier 
    // private , default, Protected, public
    
    
    //                       { # } Getters and Setters 
    // get : to return the value
    // set : to set the value
    /*
    static class Student
    {

        private String name;
        private int marks;


        // getters
        String grtName()
        {
            return this.name;
        }
        int getMarks()
        {
            return this.marks;
        }

        // setters
        void setName(String name)
        {
            this.name = name;
        }
        void setMarks(int marks)
        {
            this.marks = marks;
        }

        // void setMarks2(int marks)
        // {
        //     marks = marks;
        // }   produced error so this is used to set the atributes.
    }*/





    //          { # }     Encapulation
    /* 
    static class Human{
        int eye;
        int legs;
        int hands;
        String color;

        void body(String color)
        {
            this.color = color;
        }
        void count(int a, int b, int c)
        {
            eye = a;
            legs = b;
            hands = c;
        }
    }
    */




    //                  { # }  Constructor

    // types 
    // [ 1 , 2] == non-Parameter , parameter
    /*
    static class Student{
        String name;
        int roll;

        Student()          // non-Parameter Constructor
        {
            System.out.println(" This is Non Perameterised constructor");
        }
        Student(String name, int roll)        // Parameter Constructor
        {
            this.name = name;
            this.roll = roll;
            System.out.println(" This Perameterised constructor");
        }
    }

    public static void main(String args[])
    {
        Student s1 = new Student();
        Student s2 = new Student("Yashraj", 1542);
        System.out.println(s2.name+ " " +s2.roll);
    }*/

    // [3 ]  copy constructor
    /*
    static class Student{
        String name;
        int roll;
        String pass;
        int marks[] = new int[3];
        Student(){}  // Deffault constructor
        Student(Student s1)         // copy constructor
        {
            // Shallow copy 
            // this.name = s1.name;
            // this.roll = s1.roll;
            // marks  = new int[3];
            // this.marks = s1.marks;

            // // deep copy
            marks  = new int[3];
            for(int i = 0; i<marks.length; i++)
            {
                this.marks[i] = s1.marks[i];
            }
            
        }
    }
    public static void main(String args[])
    {
        Student s1 = new Student();
        s1.name = "yash";
        s1.roll = 1253;
        s1.pass = "abc";
        s1.marks[0] = 100;
        s1.marks[1] = 80;
        s1.marks[2] = 90;
        Student s2 = new Student(s1);
        s1.marks[2] = 180;
        s2.pass = "xyz";
        // System.out.println(s2.name);
        // System.out.println(s2.roll);
        // System.out.println(s2.pass);
        // System.out.println(s2.marks[0]);  /// default not copy

        // in copy constructor ( shello , deep )copy
        for(int i = 0; i<3; i++)
        {
            System.out.println(s2.marks[i]);
        }
        // for Shallow  output = { 100, 80, 180}  
        // for deep  output = { 100, 80, 90}
    }
    */







    //                       { # }    Inheratiance
    
    // types 
    // [1] single inheritance
    /*
    static class Animal
    {
        String color;
        void eat()
        {
            System.out.println("eats");
        }
        void breath()
        {
            System.out.println("Breaadth");
        }
    }
    static class Fish extends Animal
    {
        int fint;
        void swing()
        {
            System.out.println("Swing in Water");
        }
    }
    public static void main(String args[])
    {
        Animal a1 = new Animal();
        Fish f1 = new Fish(); 
        f1.breath();
        f1.eat();
        f1.swing();

        a1.breath();
        a1.eat();
        // a1.swing();   cause error
    }*/

    // [2] Multilevel Inheritance
    /*
    static class Animal
    {
        String color;
        void eat()
        {
            System.out.println("Animal eat food");
        }
        void breath()
        {
            System.out.println("Animal Bredth");
        }
    }
    static class Mammals extends Animal
    {
        void legs(){System.out.println("Mammals has 2 legs");}
        void eyes(){System.out.println("Mammals has 2 eyes");}
        void run(){System.out.println("Mammals run");}
    }
    static class Dog extends Mammals
    {
        void pat()
        {
            System.out.println("it is a pet animal");
        }
        void bhaw(){System.out.println("bhau bhau hhau");}
    }*/


    // [3] Hierarichical Inheritance
    /* 
    class Animal
    {}
    class WaterAnimal extends Animal
    {}
    class Birds extends Animal
    {}
    class Mammals extends Animal
    {}
    */






    // Constructor in inheritance
    // also about super keyword 
    /*
    static class Base1
    {
        Base1()
        {
            System.out.println("I am a Constructor of Base1");
        }
        Base1(int x)
        {
            System.out.println("hi i am constructor overload : "+ x);
        }
    }
    static class Drived1 extends Base1
    {
        Drived1()
        {
            //super();
            System.out.println("I am Drived1 Construction ");
        }
        Drived1(int x, int y)
        {
            super(x);
            System.out.println("I am overload constructor : " +y);
        }
    }
    static class Drived2 extends Drived1
    {
        Drived2()
        {
            //super();
            System.out.println("I am Drived2 Construction ");
        }
        Drived2(int x, int y, int z)
        {
            super(x,y);
            System.out.println("I am overload constructor : " + z);
        }
    }

    public static void main(String args[])
    {
        //Base1 b = new Base1();
        //Drived1 d1 = new Drived1();
        //Drived1 d2 = new Drived1(14,9);

        //Drived2 dd= new Drived2(14,9,65);
        // Drived2 dd2 = new Drived2();
    }*/







    //            { # } Pollymorphism
    
    // [1] Method overloading
    /*
    static class calculater
    {
        int sum(int a, int b)
        {
            return a+b;
        }
        float sum(float a, float b)
        {
            return a+b;
        }
        int sum(int a, int b, int c)
        {
            return a + b + c;
        }
        int sub(int a, int b)
        {
            return a-b;
        }
        int multiply(int a, int b)
        {
            return a*b;
        }
    }*/


    // [2] Method overeiding
    /* 
    static class Animal
    {
        void eat()
        {
            System.out.println("Eat anything");
        }
    }
    static class Dear extends Animal
    {
        void eat()
        {
            System.out.println("Eat only grass");
        }
    }
    
    public static void main(String args[])
    {
        Dear d = new Dear();
        d.eat();
    }
    */





     

    //                  { # } Abstraction
    /*
    static abstract class Parent
    {
        public Parent()
        {
            System.out.println("Tis is a constructer");
        }
        public void sayHello()
        {
            System.out.println("hello");
        }
        abstract public void great();
    }
    static class Child extends Parent
    {
        public void great()
        {
            System.out.println("Goog Morning");
        }
    }
    abstract class Child2 extends Parent
    {
        public void th()
        {
            System.out.println("I am good");
        }
    }
    public static void main(String args[])
    {
        //Parent p = new Parent();    // form error
        Child c1 = new Child();
        //Child2 c2 = new Child2();   // form error because they are abstract class
        c1.great();
    }
    */







    //               { # } Dynamic Method Dispatch
    /*
    static class Phone
    {
        public void showTime()
        {
            System.out.println("Time is 8 pm");
        }
        public void on()
        {
            System.out.println("Turn on the phone");
        }
    }
    static class SmartPhone extends Phone
    {
        public void music()
        {
            System.out.println("Playing music...");
        }
        public void on()
        {
            System.out.println("Turn on SmartPhone");
        }
    }

    public static void main(String args[])
    {
        Phone objP = new Phone();    // allow
        SmartPhone objSP = new SmartPhone();    // alow

        Phone objP1 = new SmartPhone();      // allow
        // SmartPhone objSP2 = new Phone();      // error

        objP.showTime();
        objP.on();
        objSP.music();
        objSP.on();
        objSP.showTime();
        // objP.music();         // error
    }*/






    
}
