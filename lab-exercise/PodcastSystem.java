public class PodcastSystem {
    public static void main(String[] args) {
        System.out.println("\n-------------Podcast Services-------------\n");
        PodcastHost podcastHost = new PodcastHost("Technology Podcast", "Sara");
        podcastHost.manageEpisodes();

        TechPodcastHost techPodcastHost = new TechPodcastHost("Tech Insights", "John", "Artificial Intelligence");
        techPodcastHost.provideService();
        techPodcastHost.conductTechInterviews();
        techPodcastHost.processPayment();
        techPodcastHost.requestFeedback();

        LegalPodcastService legalPodcastService = new LegalPodcastService("Legal Insights", "Alex");
        legalPodcastService.provideService();
        legalPodcastService.provideLegalInsights();
        legalPodcastService.processPayment();
        legalPodcastService.requestFeedback();
    }
}

abstract class PodcastService {
    private String serviceName;

    public PodcastService(String serviceName) {
        this.serviceName = serviceName;
    }

    public String getServiceName() {
        return serviceName;
    }

    public abstract void provideService();

    public final void processPayment() {
        System.out.println("Payment processed for " + serviceName + " service.");
    }

    public void requestFeedback() {
        System.out.println("Please provide feedback for the " + serviceName + " service.\n");
    }
}

class PodcastHost extends PodcastService {
    private String hostName;

    public PodcastHost(String serviceName, String hostName) {
        super(serviceName);
        this.hostName = hostName;
    }

    @Override
    public void provideService() {
        System.out.println("\n" + hostName + " is hosting the " + getServiceName() + " podcast service.");
    }

    public void manageEpisodes() {
        System.out.println(hostName + " is managing podcast episodes.");
    }
}

class TechPodcastHost extends PodcastHost {
    private String expertise;

    public TechPodcastHost(String serviceName, String hostName, String expertise) {
        super(serviceName, hostName);
        this.expertise = expertise;
    }

    @Override
    public void provideService() {
        super.provideService();
        System.out.println("Specialized in " + expertise);
    }

    public void conductTechInterviews() {
        System.out.println("Conducting tech interviews for " + getServiceName() + " podcast service.\n");
    }
}

class LegalPodcastService extends PodcastService {
    private String lawyerName;

    public LegalPodcastService(String serviceName, String lawyerName) {
        super(serviceName);
        this.lawyerName = lawyerName;
    }

    @Override
    public void provideService() {
        System.out.println(lawyerName + " is providing " + getServiceName() + " podcast service.");
    }

    public void provideLegalInsights() {
        System.out.println(lawyerName + " is providing legal insights.");
    }
}
