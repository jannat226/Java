package src.com.podcasting.core;

public abstract class AbstractGuest implements Guest {
    private String name;
    private String occupation;

    public AbstractGuest(String name) {
        this.name = name;
    }

    @Override
    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    @Override
    public String getName() {
        return name;
    }

    public String getOccupation() {
        return occupation;
    }

    @Override
    public void shareInsights() {
        System.out.println("Guest sharing insights...");
    }
}