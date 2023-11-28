package src.com.podcasting.core;

public abstract class AbstractPodcaster implements Podcaster {
    private String name;
    private String expertise;

    public AbstractPodcaster(String name) {
        this.name = name;
    }

    @Override
    public void setExpertise(String expertise) {
        this.expertise = expertise;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getExpertise() {
        return expertise;
    }

    @Override
    public void conductInterview() {
        System.out.println("Podcaster conducting interview...");
    }
}