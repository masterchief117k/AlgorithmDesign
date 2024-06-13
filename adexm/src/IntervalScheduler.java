import java.util.Calendar;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.TimeUnit;

public class IntervalScheduler {
    public static void main(String[] args) {
        Timer timer = new Timer();
        TimerTask customTask = new TimerTask() {
            @Override
            public void run() {
                // Your task logic here
                System.out.println("Task executed!");
            }
        };

        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.HOUR_OF_DAY, 15); // Set the initial hour (e.g., 15:00)
        calendar.set(Calendar.MINUTE, 40);      // Set the initial minute
        calendar.set(Calendar.SECOND, 0);       // Set the initial second

        // Schedule the task to run every 8 hours
        timer.schedule(customTask, calendar.getTime(), TimeUnit.HOURS.toMillis(8));
    }
}
