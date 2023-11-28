import java.util.*;
import java.text.SimpleDateFormat;

public class PodcastMain {
    public static void main(String[] args) {
        Date date = new Date();
        SimpleDateFormat format = new SimpleDateFormat("HH:mm:ss");
        System.out.println("The current time is: " + format.format(date));
    }
}
