abstract class Podcast {
    private String title;
    private String host;

    public Podcast(String title, String host) {
        this.title = title;
        this.host = host;
    }

    // Abstract method
    public abstract void play();

    // Getter
    public String getTitle() {
        return title;
    }

    public String getHost() {
        return host;
    }

    // Display
    public void displayInfo() {
        System.out.println("Title: " + title);
        System.out.println("Host: " + host);
    }
}

// Tech Podcast
class TechPodcast extends Podcast {
    private String technology;

    public TechPodcast(String title, String host, String technology) {
        super(title, host);
        this.technology = technology;
    }

    public void play() {
        System.out.println("Playing Tech Podcast: " + getTitle());
    }

    // Getter
    public String getTechnology() {
        return technology;
    }
}

// Tech Podcast episode
final class JavaTechPodcast extends TechPodcast {
    private String javaTopic;

    public JavaTechPodcast(String title, String host, String technology, String javaTopic) {
        super(title, host, technology);
        this.javaTopic = javaTopic;
    }

    // Override

    public void play() {
        System.out.println("Playing Java Tech Podcast: " + getTitle() + " - Topic: " + javaTopic);
    }

    // Getter
    public String getJavaTopic() {
        return javaTopic;
    }
}

public class Podcastt {
    public static void main(String[] args) {

        JavaTechPodcast javaPodcast = new JavaTechPodcast("Java Fundamentals", "John Doe", "Java",
                "Object-Oriented Programming");
        javaPodcast.displayInfo();
        javaPodcast.play();
    }
}