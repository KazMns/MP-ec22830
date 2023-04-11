package OOP.ec22830.MP;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainPage{
    private JLabel Icon;
    private JPanel panel;
    private JButton runElectionButton;
    private JButton EXIT;
    private JButton Credits;

    public MainPage() {

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
                    System.exit(0);
                }
            }
        });
        Credits.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "This App was written by Kazan Muniesa",
                        "Credits", JOptionPane.INFORMATION_MESSAGE);
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
                new MainPage().makeUI();
            }
        });
    }

    public void makeUI() {
        final JFrame frame = new JFrame("Run Election App") {

            //Solution to set a Maximum size for the window
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

        frame.setContentPane(new MainPage().panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        frame.setMaximumSize(new Dimension(500, 500));
        frame.setMinimumSize(new Dimension(350, 350));
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.pack();

    }
}
