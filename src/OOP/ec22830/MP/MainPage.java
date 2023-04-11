package OOP.ec22830.MP;

import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;

import javax.swing.*;

public class MainPage {

    private JComboBox comboBox1;
    private JPanel panel1;

    public MainPage(){
        AutoCompleteDecorator.decorate(comboBox1);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame();

        frame.setVisible(true);
        frame.setSize(300,300);
        frame.setContentPane(new MainPage().panel1);
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
        frame.pack();
    }
}
