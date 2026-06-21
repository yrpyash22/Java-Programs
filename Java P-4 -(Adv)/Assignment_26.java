

// --------------------------(   Threads  )-----------------------------------------//



class MyThread extends Thread
{
    @Override
    public void run()
    {
        System.out.println("This thread is running ");
    }
}
public class Assignment_26 {
    public static void main(String[] args) throws InterruptedException {
        
        // System.out.println(Thread.activeCount());       // how many thread run

        // // Thread.currentThread().setName("MAin by yrp");
        // System.out.println(Thread.currentThread().getName());

        // // Thread.currentThread().setPriority(1);
        // System.out.println(Thread.currentThread().getPriority());

        // System.out.println(Thread.currentThread().isAlive());

        // for(int i = 5; i>0; i--)
        // {
        //     System.out.println(i);
        //     Thread.sleep(1000);
        // }
        // System.out.println("you are done:-:)");

        MyThread th2 = new MyThread();
        th2.start();

        System.out.println(th2.isAlive());

        th2.setName("2nd Thread");  
        System.out.println(th2.getName());

        // th2.setPriority(1);
        // System.out.println(th2.getPriority());

        System.out.println(Thread.activeCount());
    }
}
