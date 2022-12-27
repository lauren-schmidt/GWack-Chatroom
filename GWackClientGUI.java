import javax.swing.*;
import java.awt.*;

public class GWackClientGUI {
    public static void main(String args[]) {

        // Create new Frame
        JFrame f = new JFrame();
        f.setLayout(new BorderLayout(10, 10));

        // Set basic features of the window
        f.setTitle("GWack -- GW Slack Server");
        f.setSize(800, 600);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // North panel for Name, IP, Port, and Disconnect button
        JPanel upper = new JPanel(new FlowLayout());

        JTextField nameTextField = new JTextField(10);
        JTextField ipTextField = new JTextField(10);
        JTextField portTextField = new JTextField(10);

        // Add labels and text fields, Flow layout will ensure they display left to
        // right
        upper.add(new JLabel("Name"));
        upper.add(nameTextField);
        upper.add(new JLabel("IP Address"));
        upper.add(ipTextField);
        upper.add(new JLabel("Port"));
        upper.add(portTextField);
        upper.add(new JButton("Disconnect"));

        // Add back to the main JFrame
        f.add(upper, BorderLayout.NORTH);

        // Left panel for Members Online
        JPanel left = new JPanel(new BorderLayout());

        JTextArea memTextArea = new JTextArea(" ", 10, 15);
        memTextArea.setEditable(false);

        JScrollPane areaScrollPane = new JScrollPane(memTextArea);
        areaScrollPane.setVerticalScrollBarPolicy(
                JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);

        // Add to the JPanel left
        left.add(new JLabel("Members Online"), BorderLayout.NORTH);
        left.add(areaScrollPane, BorderLayout.CENTER);

        // Add back to the main JFrame
        f.add(left, BorderLayout.WEST);

        // Text boxes for Messages
        JPanel msg = new JPanel(new BorderLayout());
        JTextArea msgTextArea = new JTextArea(" ", 10, 40);
        msgTextArea.setEditable(false);

        // Make a scrolling pane for the messages
        JScrollPane msgScroll = new JScrollPane(msgTextArea);
        msgScroll.setVerticalScrollBarPolicy(
                msgScroll.VERTICAL_SCROLLBAR_ALWAYS);
        msgScroll.setPreferredSize(new Dimension(250, 250));
        ;

        // Panel and Text box for Compose Message
        JPanel composePanel = new JPanel(new BorderLayout());
        JTextField composeTextField = new JTextField();

        // Make a scrolling pane for the messages
        JScrollPane composeScroll = new JScrollPane(composeTextField);
        msgScroll.setVerticalScrollBarPolicy(
                msgScroll.VERTICAL_SCROLLBAR_ALWAYS);
        msgScroll.setPreferredSize(new Dimension(250, 250));

        // Add the elements to the compose panel
        composePanel.add(new Label("Compose"), BorderLayout.NORTH);
        composePanel.add(composeScroll, BorderLayout.CENTER);
        msg.add(composePanel, BorderLayout.SOUTH);

        // Add the elements to the message panel
        msg.add(new Label("Messages"), BorderLayout.NORTH);
        msg.add(msgScroll, BorderLayout.CENTER);

        // Add back to the main JFrame
        f.add(msg, BorderLayout.CENTER);

        // Bottom right button to send message
        JPanel lower = new JPanel(new BorderLayout());
        JButton button = new JButton("Send");
        lower.add(button, BorderLayout.EAST);

        // Add back to the main JFrame
        f.add(lower, BorderLayout.SOUTH);

        f.pack();
        f.setVisible(true);
    }
}
