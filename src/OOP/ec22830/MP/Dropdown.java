package OOP.ec22830.MP;

import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Dropdown {
    public JComboBox comboBox1;
    public JPanel panel1;

    public Dropdown(){
        JFrame frame1 = new JFrame();

        frame1.add(panel1);
        AutoCompleteDecorator.decorate(comboBox1);
    }
}
