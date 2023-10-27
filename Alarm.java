public class Alarm {

    public String message;
    protected Boolean active = false;

    public Alarm() {
        this.message = "Alarm is inactive";
        this.active = false;
    }

    public void visualize() {
        active = true;
        if (active) {
            System.out.println("Alarm  is ringing");
        } else {
            System.out.println("Alarm is not active");
        }

    }

    public void register(String name, long phno) {
        System.out.println("Registed");
        System.out.println("Name is" + name + "and registerated pno is" + phno);
    }
}
