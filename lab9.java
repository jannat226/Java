import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PodcastPlayer {
    public static void main(String[] args) {
        // Create a JFrame
        JFrame frame = new JFrame("Podcast Player");

        // Create a JButton for loading podcasts
        JButton loadButton = new JButton("Load Podcasts");

        // Create an ActionListener for the load button
        loadButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Simulate loading podcast feeds (you would fetch this from an RSS feed in a
                // real app)
                String[] podcastFeeds = { "https://example.com/podcast1.xml", "https://example.com/podcast2.xml" };

                // Simulate displaying the loaded podcast feeds (you would display this in a
                // podcast list in a real app)
                JOptionPane.showMessageDialog(frame, "Podcasts Loaded:\n" + String.join("\n", podcastFeeds));
            }
        });

        // Create a JButton for playing podcasts
        JButton playButton = new JButton("Play Podcast");

        // Create an ActionListener for the play button
        playButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Simulate playing the selected podcast (you would handle audio streaming in a
                // real app)
                JOptionPane.showMessageDialog(frame, "Playing Podcast");
            }
        });

        // Create a JPanel and add buttons to it
        JPanel panel = new JPanel();
        panel.add(loadButton);
        panel.add(playButton);

        // Add the panel to the JFrame's content pane
        frame.getContentPane().add(panel);

        // Set the default close operation and size of the frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);

        // Set the frame to be visible
        frame.setVisible(true);
    }
}
