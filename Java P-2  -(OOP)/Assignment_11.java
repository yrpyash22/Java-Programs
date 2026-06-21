
// -----------------------    { Interfaces }   ------------------------//



public class Assignment_11 {




    // Example 
    /* 
    interface Bicycle
    {
        int a = 45;
        void applyBreaks(int dec);
        void speedup(int inc);
    }

    interface HornBicycle
    {
        void blowHorn();
        void ring();
    }

    static class AvonCycle implements Bicycle , HornBicycle 
    {
        void color()
        {
            System.out.println("Red");
        }
        public void applyBreaks(int dec)
        {
            System.out.println("Apply break "+ (a - dec));
        }
        public void speedup(int inc)
        {
            System.out.println("Speed up " + (a-inc) );
        }
        public void blowHorn()
        {
            System.out.println("-------------");
        }
        public void ring()
        {
            System.out.println("//////////////");
        }
    }

    public static void main(String args[])
    {
        AvonCycle cy = new AvonCycle();
        cy.applyBreaks(10);
        System.out.println(cy.a);

        // cy.a = 15;     // error
        cy.blowHorn();
        cy.ring();
    }
    */





    // Inheritanxe in Implement
    /*
    interface SampleInterface
    {
        void meth1();
        void meth2();
    }
    interface ChildSampleInterface extends SampleInterface
    {
        void meth3();
        void meth4();
    }

    static class MyClass implements ChildSampleInterface
    {
        public void meth1()
        {
            System.out.println("Method 1");
        }
        public void meth2()
        {
            System.out.println("Method 2");
        }
        public void meth3()
        {
            System.out.println("Method 3");
        }
        public void meth4()
        {
            System.out.println("Method 4");
        }
    }
    */




    // An interFace has Default METHOD
    /* 
    interface Mycamera
    {
        void takeSnap();
        void recording();
        private void great()
        {
            System.out.println("Nice Camera");
        }
        default void record4kvideo()
        {
            great();
            System.out.println("Recording 4k ....");
        }
    }
    interface Wifi
    {
        String getNetwork();
        void connectTOInternet(String net);
    }
    interface GPS
    {
        void showLocation();
        void get_location(int loc);
    }
    interface Game
    {
        void playgame();
        void start();
    }

    static class Phone
    {
        void cellNumber(int ph)
        {
            System.out.println("Calling" + ph);
        }
        void pickcall()
        {
            System.out.println("Connecting...");
        }
    }
    static class SmartPhone extends Phone implements Wifi, Game, Mycamera, GPS
    {
        public void takeSnap(){}
        public void recording(){}


        public void record4kvideo()
        {
            System.out.println("Record snap in 4k........;");
        }
        
        public String getNetwork()
        {
            String netList = "Herry";
            return netList;
        }
        public void connectTOInternet(String net)
        {
            System.out.println("connscting.." + net);
        }


        public void showLocation(){}
        public void get_location(int loc){}

        public void playgame(){}
        public void start(){}

    }

    public static void main(String args[])
    {
        Mycamera cm = new SmartPhone();
        cm.takeSnap();
        // cm.getNetwork();
        SmartPhone ph = new SmartPhone();
        ph.takeSnap();
        ph.getNetwork();
        ph.cellNumber(945);
        ph.playgame();


        SmartPhone ms = new SmartPhone();
        ms.record4kvideo();
        // ms.great();
        String str = ms.getNetwork();
        System.out.println(str);
    }
    */










    // [A - 1] Print the sum, difference and product of two complex numbers 
    // by creatinga class named 'Complex' with separate methods for each operation 
    // who sereal and imagin ary parts are entered by the user.
    static class Complex 
    {
        int real;
        int img;

        public Complex(int a, int b)
        {
            real = a;
            img = b;
        }
        public static Complex add(Complex a  ,Complex b)
        {
            return new Complex((a.real+b.real),(a.img+b.img));
        }
        public static Complex diff(Complex a,Complex b)
        {
            return new Complex((a.real-b.real),(a.img-b.img));
        }
        public static Complex prod(Complex a, Complex b)
        {
            return new Complex( (a.real * b.real), (a.img * b.img));
        }

        public void printComplex()
        {
            if(real == 0 && img!=0 )
            {
                System.out.println(img+"i");
            }
            else if(img == 0 && real !=0 )
            {
                System.out.println(real);
            }
            else
            {
                System.out.println(real+"+"+img+"i");
            }
        }
    }

    public static void main(String args[])
    {
        Complex c = new Complex(4,5); 
        Complex d = new Complex(9,4);
        Complex e = Complex.add(c,d); 
        Complex f = Complex.diff(c,d);
        Complex g = Complex.prod(c,d);
        e.printComplex(); 
        f.printComplex();
        g.printComplex();
    }
}
