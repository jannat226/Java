public class Podcast {
    // Data members with different access specifiers
    private String podcastName;
    public int id;
    protected String hostName;
    int[] reviews; // Default access specifier
    private int numListeners;

    // Default constructor to initialize data members with default values
    public Podcast() {
        podcastName = "Untitled Podcast";
        id = 0;
        hostName = "Unknown Host";
        reviews = new int[] { 0, 0, 0, 0, 0 };
        numListeners = 0;
    }

    // Constructor overloading (1)
    public Podcast(String name, int podcastId) {
        this(); // Call the default constructor to set default values
        podcastName = name;
        id = podcastId;
    }

    // Constructor overloading (2)
    public Podcast(String name, int podcastId, String host) {
        this(name, podcastId); // Call the other constructor to set name and id
        hostName = host;
    }

    // Method to set the reviews
    public void setReviews(int[] newReviews) {
        if (newReviews.length == 5) {
            reviews = newReviews;
        } else {
            System.out.println("Invalid number of reviews. Please provide 5 reviews.");
        }
    }

    // Method overloading (1) to set reviews
    public void setReviews(int reviewIndex, int newReview) {
        if (reviewIndex >= 0 && reviewIndex < 5) {
            reviews[reviewIndex] = newReview;
        } else {
            System.out.println("Invalid review index. It should be between 0 and 4.");
        }
    }

    // Method overloading (2) to set number of listeners
    public void setNumListeners(int listeners) {
        numListeners = listeners;
    }

    // Method to display podcast information
    public void displayPodcastInfo() {
        System.out.println("Podcast Name: " + podcastName);
        System.out.println("Podcast ID: " + id);
        System.out.println("Host Name: " + hostName);
        System.out.print("Reviews: ");
        for (int review : reviews) {
            System.out.print(review + " ");
        }
        System.out.println();
        System.out.println("Number of Listeners: " + numListeners);
    }

    public static void main(String[] args) {
        // Create a Podcast object using constructor overloading
        Podcast podcast = new Podcast("On Purpose", 123, "Jay Shetty");

        // Set reviews using method overloading
        int[] newReviews = { 5, 4, 3, 5, 4 };
        podcast.setReviews(newReviews);

        // Set the number of listeners
        podcast.setNumListeners(10000);

        // Display podcast information
        podcast.displayPodcastInfo();
    }
}
