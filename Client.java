public class Client {
    public static void main(String[] args) {
        Alarm a1 = new Alarm();
        a1.register("Jannat", 1234567789);
        Snooze s1 = new Snooze();
        s1.snooze();

    }
}
