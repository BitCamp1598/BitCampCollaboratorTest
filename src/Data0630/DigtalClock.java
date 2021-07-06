package Data0630;

import javax.swing.*;
import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DigtalClock extends JFrame {
    Font ftn = new Font("굴림",Font.BOLD,100);
    Calendar now = Calendar.getInstance();
    JLabel lbl = new JLabel("00:00:00", JLabel.CENTER);
 public DigtalClock()
 {
     super("시계");
     add(lbl);
     lbl.setFont(ftn);

     setSize(1000,200);;
     setVisible(true);
//        setDefaultCloseOperation(DISPOSE_ON_CLOSE);// 닫기 기능을 실행한다.'
     StartClock();
     setDefaultCloseOperation(DISPOSE_ON_CLOSE);///닫기 기능을 실행하지 않는다.
 }
 public void StartClock() {
     do {
         lbl.setText(getTimer());
         try {
             Thread.sleep(1000);
         } catch (InterruptedException e) {
             lbl.setText("변경된 라벨");
         }
      }   while (true) ;
 }

 public String getTimer()
 {
     now = Calendar.getInstance();

     SimpleDateFormat fmt =new SimpleDateFormat("HH:mm:ss");
     return fmt.format(now.getTime());
 }
    public static void main(String[] args) {
        new DigtalClock();
    }
}
