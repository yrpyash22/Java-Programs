// --------------------------------(   Timer  Task )-----------------------------------//
/*
import java.util.Calendar;
import java.util.Timer;
import java.util.TimerTask;

public class Assignment_25 {
    public static void main(String[] args) {
        
        Timer time = new Timer();

        TimerTask task = new TimerTask() {
            int count = 10;
            @Override
            public void run() {
                if(count > 0)
                {
                    System.out.println("Second : "+ count);
                    count--;
                }else
                {
                    System.out.println("Happy NewYear");
                    time.cancel();
                }
            }
        };
        //time.schedule(task, 3000);

        Calendar date = Calendar.getInstance();
        date.set(Calendar.YEAR, 2025);
        date.set(Calendar.MONTH, Calendar.OCTOBER);
        date.set(Calendar.DAY_OF_MONTH, 23);
        date.set(Calendar.HOUR_OF_DAY, 7);
        date.set(Calendar.MINUTE, 54);
        date.set(Calendar.SECOND, 0);
        date.set(Calendar.MILLISECOND, 0);
        // time.schedule(task,date.getTime());
        
        // time.scheduleAtFixedRate(task, 0, 1000);

        //time.scheduleAtFixedRate(task, date.getTime(), 1000);      // this is used in future 
    }
}
*/