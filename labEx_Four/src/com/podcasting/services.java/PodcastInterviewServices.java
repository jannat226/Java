package src.com.podcasting.services;

import src.com.podcasting.core.Podcaster;
import src.com.podcasting.core.Guest;

public class PodcastInterviewService implements InterviewService {
    @Override
    public void conductInterview(Podcaster podcaster, Guest guest) {
        System.out.println("Interview started...");
        System.out.println("Podcaster: " + podcaster.getName() + " with expertise in " + podcaster.getExpertise());
        System.out.println("Guest: " + guest.getName() + " with occupation " + guest.getOccupation());
        System.out.println("Conducting interview...");
        System.out.println("Interview completed.");
    }
}