package OOP.ec22830.MP;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

public class MP_ec22830 {
    private JLabel Icon;
    private JPanel panel;
    private JButton runElectionButton;
    private JButton EXIT;
    private JButton Credits;

    public MP_ec22830() {

        runElectionButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource()==runElectionButton){
                    RunElection RN = new RunElection();
                }
            }
        });
        EXIT.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource()== EXIT){
                    int n = JOptionPane.showConfirmDialog(
                            null,
                            "Would you like to exit the software?",
                            "Exit Software",
                            JOptionPane.YES_NO_OPTION);

                    if(n==0){
                        System.exit(0);
                    }
                    else {
                        JOptionPane.getRootFrame().dispose();
                    }
                }
            }
        });
        Credits.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


                String[] buttons = { "Linkedin", "Github", "My university"};
                int returnValue = JOptionPane.showOptionDialog(null, "This app was written by Kazan Muniesa", "Credits",
                        JOptionPane.OK_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, null, buttons, buttons);

                if(returnValue==0){
                    try {
                        Desktop.getDesktop().browse(new URL("https://www.linkedin.com/in/kazan-muniesa-66893b193/").toURI());
                    } catch (Exception ignored) {
                    }
                }
                else if(returnValue==1){
                    try {
                        Desktop.getDesktop().browse(new URL("https://github.com/KazMns").toURI());
                    } catch (Exception ignored) {
                    }
                }
                else if (returnValue==2){
                    try {
                        Desktop.getDesktop().browse(new URL("https://www.qmul.ac.uk/").toURI());
                    } catch (Exception ignored) {
                    }
                }
                else {
                    JOptionPane.getRootFrame().dispose();
                }
            }
        });
    }

    private void createUIComponents() {
        Icon = new JLabel(new ImageIcon("1902201.png"));
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new MP_ec22830().makeUI();
            }
        });
    }

    public void makeUI() {
        final JFrame frame = new JFrame("Run Election App") {

            @Override
            public void paint(Graphics g) {
                Dimension d = getSize();
                Dimension m = getMaximumSize();
                boolean resize = d.width > m.width || d.height > m.height;
                d.width = Math.min(m.width, d.width);
                d.height = Math.min(m.height, d.height);
                if (resize) {
                    Point p = getLocation();
                    setVisible(false);
                    setSize(d);
                    setLocation(p);
                    setVisible(true);
                }
                super.paint(g);
            }
        };

        frame.setContentPane(new MP_ec22830().panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        frame.setMaximumSize(new Dimension(500, 500));
        frame.setMinimumSize(new Dimension(350, 350));
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.pack();

    }
}
