import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

interface EpisodeFilter {
    boolean test(PodcastEpisode episode);
}

class PodcastEpisode {
    String title;
    int duration; // in minutes

    public PodcastEpisode(String title, int duration) {
        this.title = title;
        this.duration = duration;
    }

    public String getTitle() {
        return title;
    }

    public int getDuration() {
        return duration;
    }
}

public class LambdaExpressionPodcast {

    private static List<PodcastEpisode> episodes = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;

        do {
            System.out.println("\n Podcasts Data :");
            System.out.println("1. Add Episode");
            System.out.println("2. List All Episodes");
            System.out.println("3. Filter Short Episodes");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // consume the newline character

            switch (choice) {
                case 1:
                    addEpisode();
                    break;
                case 2:
                    listAllEpisodes();
                    break;
                case 3:
                    filterShortEpisodes();
                    break;
                case 4:
                    System.out.println("Exiting the Podcast Manager. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }

        } while (choice != 4);
    }

    private static void addEpisode() {
        System.out.print("Enter the title of the episode: ");
        String title = scanner.nextLine();
        System.out.print("Enter the duration of the episode (in minutes): ");
        int duration = scanner.nextInt();
        episodes.add(new PodcastEpisode(title, duration));
        System.out.println("Episode added successfully!");
    }

    private static void listAllEpisodes() {
        System.out.println("\n List of All Episodes ");
        for (PodcastEpisode episode : episodes) {
            System.out.println(episode.getTitle() + "-" + episode.getDuration() + " minutes");
        }
    }

    private static void filterShortEpisodes() {
        System.out.print("Enter the maximum duration for short episodes: ");
        int maxDuration = scanner.nextInt();

        List<PodcastEpisode> shortEpisodes = filterEpisodes(episode -> episode.getDuration() < maxDuration);

        System.out.println("\n=== Short Episodes (Duration < " + maxDuration + " minutes) ===");
        for (PodcastEpisode episode : shortEpisodes) {
            System.out.println(episode.getTitle() + " - " + episode.getDuration() + " minutes");
        }
    }

    private static List<PodcastEpisode> filterEpisodes(EpisodeFilter filter) {
        List<PodcastEpisode> filteredEpisodes = new ArrayList<>();
        for (PodcastEpisode episode : episodes) {
            if (filter.test(episode)) {
                filteredEpisodes.add(episode);
            }
        }
        return filteredEpisodes;
    }

}
