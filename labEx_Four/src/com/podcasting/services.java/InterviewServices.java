package src.com.podcasting.services;

import src.com.podcasting.core.Podcaster;
import src.com.podcasting.core.Guest;

public interface InterviewService {
    void conductInterview(Podcaster podcaster, Guest guest);
}