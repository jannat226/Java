import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class PodcastEpisodeTask implements Runnable {
    private String episodeTitle;
    private String category;
    private ListenerFeedbackRepository feedbackRepository;

    public PodcastEpisodeTask(String episodeTitle, String category, ListenerFeedbackRepository feedbackRepository) {
        this.episodeTitle = episodeTitle;
        this.category = category;
        this.feedbackRepository = feedbackRepository;
    }

    @Override
    public void run() {
        // Simulate podcast episode creation based on the category
        createEpisode();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Processing feedback for episode: " + episodeTitle);

        // Collect feedback after processing the episode
        ListenerFeedback feedback = generateFeedback();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("\nPodcast episode processed: " + episodeTitle + ". Feedback received:\n" +
                "Rating: " + feedback.getRating() + "\nComment: " + feedback.getComment() + "\n");

        feedbackRepository.addFeedback(feedback);
    }

    private void createEpisode() {
        // Simulate creating episodes for different categories
        System.out.println("Creating podcast episode titled '" + episodeTitle + "' in the " + category + " category.");
    }

    private ListenerFeedback generateFeedback() {
        // Simulate generating feedback with random ratings and comments
        int rating = (int) (Math.random() * 5) + 1; // Rating between 1 and 5
        String[] comments = { "Great content!", "Interesting discussion, very informative.", "Enjoyable experience.",
                "Could use some improvements.", "Not my cup of tea." };
        String comment = comments[(int) (Math.random() * comments.length)];

        return new ListenerFeedback(rating, comment);
    }
}

class ListenerFeedback {
    private int rating;
    private String comment;

    public ListenerFeedback(int rating, String comment) {
        this.rating = rating;
        this.comment = comment;
    }

    public int getRating() {
        return rating;
    }

    public String getComment() {
        return comment;
    }
}

class ListenerFeedbackRepository {
    private List<ListenerFeedback> feedbackList;

    public ListenerFeedbackRepository() {
        this.feedbackList = new ArrayList<>();
    }

    public void addFeedback(ListenerFeedback feedback) {
        feedbackList.add(feedback);
    }

    public List<ListenerFeedback> getAllFeedback() {
        return new ArrayList<>(feedbackList);
    }
}

class PodcastReport {
    private ListenerFeedbackRepository feedbackRepository;

    public PodcastReport(ListenerFeedbackRepository feedbackRepository) {
        this.feedbackRepository = feedbackRepository;
    }

    public void generateReport() {
        List<ListenerFeedback> feedbackList = feedbackRepository.getAllFeedback();

        System.out.println("\nPodcast Feedback Report:");
        System.out.println("-----------------------");

        for (ListenerFeedback feedback : feedbackList) {
            System.out.println("Episode: " + feedback + ", Rating: " + feedback.getRating() + ", Comment: "
                    + feedback.getComment());
        }
    }
}

public class PodcastLab {
    public static void main(String[] args) {
        // Create a thread pool with a fixed number of threads
        int numberOfThreads = 5;
        ExecutorService executorService = Executors.newFixedThreadPool(numberOfThreads);

        ListenerFeedbackRepository feedbackRepository = new ListenerFeedbackRepository();

        // Simulate multiple podcast episodes with different categories
        for (int i = 1; i <= 10; i++) {
            String episodeTitle = "Episode " + i;

            // Randomly select a category for each episode
            String[] categories = { "Technology", "Science", "Comedy" };
            String category = categories[(int) (Math.random() * categories.length)];

            // Submit each episode creation as a task to the thread pool
            executorService.submit(new PodcastEpisodeTask(episodeTitle, category, feedbackRepository));
        }

        executorService.shutdown();
        System.out.println("\n");

        PodcastReport podcastReport = new PodcastReport(feedbackRepository);
        podcastReport.generateReport();
    }
}
