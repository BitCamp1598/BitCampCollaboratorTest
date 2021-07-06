package Data0629Swing;

import jdk.jfr.SettingDefinition;

import javax.swing.*;
import java.awt.*;
import java.awt.BorderLayout;


public class JFreamTest extends JFrame {
    ImageIcon jcon1 = new ImageIcon("img/10.jpg");
    ImageIcon jcon2 = new ImageIcon("img/11.jpg");

    public JFreamTest(){

 //       BorderLayout을 GridLay으로 변경하기

        GridLayout layout = new GridLayout(3,2,10,10);
        setLayout(layout);

        JButton button = new JButton("버튼1");
        add(button);// 버튼을 add한다.
        JButton button1 = new JButton(jcon1);
        add(button1);// 버튼을 add한다.
        JButton button2 = new JButton("버튼",jcon2);
        button2.setPressedIcon(jcon1);
        add(button2);

        JButton button3 = new JButton("버튼",jcon1);
        button3.setPressedIcon(jcon2);
        add(button3);
        button3.setEnabled(false);

        JPanel pane = new JPanel(new GridLayout(3,1));
        JRadioButton rb1 = new JRadioButton("ONE");
        JRadioButton rb2 = new JRadioButton("TWO");
        JRadioButton rb3 = new JRadioButton("THREE");

        //라디오 버튼 그룹만들기
        ButtonGroup bg = new ButtonGroup();
        bg.add(rb1); bg.add(rb2); bg.add(rb3);

        pane.add((rb1));
        pane.add((rb2));
        pane.add((rb3));
        add(pane);

        JToggleButton toggleBtn = new JToggleButton("문자");
        add(toggleBtn);

        JLabel lbl = new JLabel("라벨표시",JLabel.RIGHT);
        add(lbl);
        button.setBackground(Color.orange);
        Color clr = new Color(100,100,100);
        toggleBtn.setBackground(clr);
        lbl.setSize(100,200);
        lbl.setOpaque(true);//true 투명하게 fasle
        lbl.setBackground(Color.pink);

        Font fnt = new Font("궁서체",Font.ITALIC,40);
        lbl.setFont(fnt);
        lbl.setText("Asdf");
        setSize(1000,1000);
        setVisible(true);
//        setDefaultCloseOperation(DISPOSE_ON_CLOSE);// 닫기 기능을 실행한다.
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);///닫기 기능을 실행하지 않는다.
    try {
        Thread.sleep(5000);
    } catch (InterruptedException e) {
       lbl.setText("변경된 라벨");
        }
    }

    public static void main(String[] args) {
        new JFreamTest();
    }
}
