package Data0702;

import javax.swing.*;
import java.awt.*;

public class Calnedarex extends JFrame {
    JPanel allBtnPane = new JPanel(new BorderLayout());
    JComboBox<String> Box1 = new JComboBox<String>();
    JComboBox<String> Box2 = new JComboBox<String>();
    public Calnedarex(){
        setTitle("달력만들기 에헴");

        setSize(500,500);
        setVisible(true);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }

    public static void main(String[] args) {
        new Calnedarex();
    }
}
