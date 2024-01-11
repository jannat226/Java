import java.util.*;

class Podcast {
    private String title;
    private String host;
    private int duration;
    private String releaseDate;
    private String genre;

    public Podcast(String title, String host, int duration, String releaseDate, String genre) {
        this.title = title;
        this.host = host;
        this.duration = duration;
        this.releaseDate = releaseDate;
        this.genre = genre;
    }

    // Getter and Setter methods

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "Podcast{" +
                "title='" + title + '\'' +
                ", host='" + host + '\'' +
                ", duration=" + duration +
                ", releaseDate='" + releaseDate + '\'' +
                ", genre='" + genre + '\'' +
                '}';
    }
}

class  {
    private Set<Podcast> latestPodcasts; // Using HashSet for uniqueness
    private List<Podcast> genrePodcasts;
    private Vector<Podcast> hostPodcasts;

    public PodcastCollection() {
        this.latestPodcasts = new HashSet<>();
        this.genrePodcasts = new ArrayList<>();
        this.hostPodcasts = new Vector<>();
    }

    public void addPodcast(Podcast podcast) {
        updateGenrePodcasts(podcast);
        updateHostPodcasts(podcast);
        updateLatestPodcasts(podcast);
    }

    private void updateGenrePodcasts(Podcast podcast) {
        if (podcast.getGenre().equals("Technology")) {
            genrePodcasts.add(podcast);
        }
    }

    private void updateHostPodcasts(Podcast podcast) {
        if (podcast.getHost().equals("Host1")) {
            hostPodcasts.add(podcast);
        }
    }

    private void updateLatestPodcasts(Podcast podcast) {
        latestPodcasts.add(podcast);
        latestPodcasts.removeIf(p -> p.getReleaseDate().compareTo(podcast.getReleaseDate()) < 0);
    }

    public List<Podcast> getPodcastsByGenre(String genre) {
        List<Podcast> result = new ArrayList<>();
        for (Podcast podcast : genrePodcasts) {
            if (podcast.getGenre().equals(genre)) {
                result.add(podcast);
            }
        }
        return result;
    }

    public List<Podcast> getPodcastsByHost(String host) {
        List<Podcast> result = new ArrayList<>();
        for (Podcast podcast : hostPodcasts) {
            if (podcast.getHost().equals(host)) {
                result.add(podcast);
            }
        }
        return result;
    }

    public Set<Podcast> getLatestPodcasts() {
        return latestPodcasts;
    }

    @Override
    public String toString() {
        return "PodcastCollection{" +
                "genrePodcasts=" + genrePodcasts +
                ", hostPodcasts=" + hostPodcasts +
                ", latestPodcasts=" + latestPodcasts +
                '}';
    }
}

public class PodcastCollectionLab {
    public static void main(String[] args) {
        // Create a podcast collection
        PodcastCollection podcastCollection = new PodcastCollection();

        // Add some podcasts
        podcastCollection.addPodcast(new Podcast("Title1", "Host1", 30, "2022-01-01", "Technology"));
        podcastCollection.addPodcast(new Podcast("Title2", "Host2", 25, "2022-02-01", "Science"));
        podcastCollection.addPodcast(new Podcast("Title3", "Host1", 40, "2022-03-01", "History"));
        podcastCollection.addPodcast(new Podcast("Title4", "Host3", 35, "2022-04-01", "Technology"));

        // Display all podcasts
        System.out.println("All Podcasts: " + podcastCollection);

        // Get podcasts by genre
        System.out.println("Technology Podcasts: " + podcastCollection.getPodcastsByGenre("Technology"));

        // Get podcasts by host
        System.out.println("Host1 Podcasts: " + podcastCollection.getPodcastsByHost("Host1"));

        // Get the latest podcasts
        System.out.println("Latest Podcasts: " + podcastCollection.getLatestPodcasts());
    }
}
