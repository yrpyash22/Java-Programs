
//                        { # }  MulitTheading


// public class Assignment_12_{


    // Cteate Threads 
    // [1] Extending the Thread class
    /*
    static class MyThread1 extends Thread
    {
        // override
        public void run()
        {
            int i =0;
            while (i<1000) 
            {
                System.out.println("My Thread { 1111 is run }");
                i++;
            }
        }
    }

    static class MyThread2 extends Thread
    {
        public void run()
        {
            int i =0;
            while (i<1000) 
            {
                System.out.println("My Thread {  2222 is run  }");
                i++;
            }
        }
    }

    public static void main(String args[])
    {
        MyThread1 t1 = new MyThread1();
        MyThread2 t2 = new MyThread2();
        t1.start();   // run symantinously t1 and t2 both with start() method of Thread
        t2.start();
    }
    */



    // [2] Implementing the runnable interface
    /* 
    static class MyTh1 implements Runnable
    {
        public void run()
        {

            int i = 0;
            while(i<1000)
            {
                System.out.println("I am a Thread 1");
                i++;
            }
        }
    }
    static class MyTh2 implements Runnable
    {
        public void run()
        {
            int i = 0;
            while(i<1000)
            {
                System.out.println("I am a Thread 2");
                i++;
            }    
        }
    }

    public static void main(String args[])
    {

        MyTh1 bullet1 = new MyTh1();
        Thread gun1 = new Thread(bullet1);


        MyTh2 bullet2 = new MyTh2();
        Thread gun2 = new Thread(bullet2);

        gun1.start();
        gun2.start();
    }*/



    // Constructor method of thread class
    /*
    static class MyTh extends Thread
    {
        public MyTh(String name)
        {
            super(name);
        }
        public void run()
        {
            System.out.println("I am Thread");
        }
    }

    public static void main(String args[])
    {
        String str = "Yashraj";
        String str2 = "Monan";
        MyTh th = new MyTh(str);
        MyTh th2 = new MyTh(str2);

        th.start();
        System.out.println("The Id of thread is : "+ th.getId());
        System.out.println("The Id of thread is : "+ th2.getId());
        System.out.println("The name of thread is : "+ th.getName());
        System.out.println("The name of thread is : "+ th2.getName());
        System.out.println("The name of thread is : "+ th.getClass());

    }
    */





    // Thread Priority
    /* 
    static class MyTh extends Thread
    {
        public MyTh(String name)
        {
            super(name);
        }
        public void run()
        {
            while (true) {
                System.out.println("I am Thread My name is : " + getName());
            }
            
        }
    }

    public static void main(String args[])
    {
        // Ready queue : th1, th2, th3, th4, th5
        MyTh th1 = new MyTh("Yashraj");
        MyTh th2 = new MyTh("Monan");
        MyTh th3 = new MyTh("Yash");
        MyTh th4 = new MyTh("raj");
        MyTh th5 = new MyTh("asraj ( Most important )");
        
        th1.setPriority(Thread.MAX_PRIORITY);
        th2.setPriority(Thread.MIN_PRIORITY);
        th1.start();
        th2.start();
        // th2.join();  /// jabtak up th2 khatam nahi ho jaye 
        th3.start();
        th4.start();
        th5.start();

    }
    */





    // [E - 1] Write a Program to Print "good morning" and "Welcome " continously
    // previous code is the answer


    // [ E- 2] Add a sleep Method in welcome thread for 200 ms of time 
    /*
    static class Practice1 extends Thread
    {
        public void run()
        {
            while(true)
            {
                //.out.println(" Good Morning");
            }
        }
        
    }
    static class Practice2 extends Thread
    {
        public void run()
        {
            while(true)
            {
                //  [ E - 2 ] 
                // try {
                //     Thread.sleep(200);
                // } catch (Exception e) {
                //     System.out.println(e);
                // }
                //System.out.println(" Welcome ");
            }
        }
    }

    public static void main(String args[])
    {
        Practice1 p1 = new Practice1();
        Practice2 p2 = new Practice2();

        System.out.println(p1.getPriority());    // set to 5 automatic
        System.out.println(p2.getPriority());

        p1.setPriority(1);
        p2.setPriority(5);
        //p1.start();
        //p2.start();
        System.out.println(p1.getPriority());

        System.out.println(Thread.currentThread().getState());  // Runnable
        
    }
    */
// }











// Exanmple of multi threading by Bro code.
/* 
class MyThread extends Thread
{
    @Override
    public void run()
    {
        for(int i = 10; i>0; i--)
        {
            System.out.println("Thread #1: " +i);
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        System.out.println("Thread #1 is finished");
    }
}
class MyRunnable implements Runnable
{
    @Override
    public void run()
    {
        for(int i = 0; i<10; i++)
        {
            System.out.println("Thread #2: " +i);
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        System.out.println("Thread #2 is finished");
    } 
}
public class Assignment_12_ {

    public static void main(String[] args) throws InterruptedException {
        // create a subclass of Thread
        MyThread t1 = new MyThread();

        // Implement Runnable interface and pass instance as an argument to Thread
        MyRunnable run1 = new MyRunnable();

        Thread t2 = new Thread(run1);

        // t1.setDaemon(true);
        // t2.setDaemon(true);
        t1.start();
        t1.join(3000);  //calling thread (ex.main) wait until the specified thread dies or for x millsec
        t2.start();
        // System.out.println(5/0);
    }
}
*/





