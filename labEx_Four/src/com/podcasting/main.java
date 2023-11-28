package src.com.podcasting;

import src.com.podcasting.core.AbstractPodcaster;
import src.com.podcasting.core.AbstractGuest;
import src.com.podcasting.core.Guest;
import src.com.podcasting.core.Podcaster;
import src.com.podcasting.services.PodcastInterviewService;
import src.com.podcasting.services.InterviewService;

public class Main {
    public static void main(String[] args) {
        // Create a default podcaster
        Podcaster defaultPodcaster = new AbstractPodcaster("Joe Rogan") {
        };
        defaultPodcaster.setExpertise("Comedy");

        // Create a customized podcaster
        Podcaster customizedPodcaster = new AbstractPodcaster("Lex Fridman") {
            @Override
            public void conductInterview() {
                System.out.println("Customized interview conducted by " + getName());
                System.out.println("Expertise: " + getExpertise());
            }
        };
        customizedPodcaster.setExpertise("Artificial Intelligence");

        // Create a default guest
        Guest defaultGuest = new AbstractGuest("Elon Musk") {
        };
        defaultGuest.setOccupation("Entrepreneur");

        // Create a customized guest
        Guest customizedGuest = new AbstractGuest("Neil deGrasse Tyson") {
            @Override
            public void shareInsights() {
                System.out.println("Customized insights shared by " + getName());
                System.out.println("Occupation: " + getOccupation());
            }
        };
        customizedGuest.setOccupation("Astrophysicist");

        InterviewService interviewService = new PodcastInterviewService();

        System.out.println("\nDefault podcaster and guest methods called:");
        // Conduct an interview with the default podcaster and guest
        interviewService.conductInterview(defaultPodcaster, defaultGuest);
        System.out.println("\n");

        System.out.println("Overrided and customized the podcaster and guest methods:");
        // Conduct an interview with the customized podcaster and guest
        interviewService.conductInterview(customizedPodcaster, customizedGuest);
    }
}
