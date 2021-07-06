package Data0702;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorEx extends JFrame implements ActionListener {
    JTextField tf = new JTextField("0.0");
    JPanel allBtnPane = new JPanel(new BorderLayout());
    JPanel northpath = new JPanel(new GridLayout(1,3));
    JPanel centerPane = new JPanel(new GridLayout(4,4));
    Font fnt = new Font("굴림체",Font.BOLD,25);
    double result=0;
    String operator;

    String btnStr[] ={"Backspace","Clear","End",
            "7", "8", "9", "+",
            "4", "5", "6", "-",
            "1", "2", "3", "*",
            "0", ".", "=","/"};

    public CalculatorEx(){
        setTitle("계산기 만들기");
        add(BorderLayout.NORTH,tf);
        tf.setHorizontalAlignment(JTextField.RIGHT);
        tf.setFont(fnt);

        allBtnPane.add(BorderLayout.CENTER,centerPane);
        allBtnPane.add(BorderLayout.NORTH,northpath);

        add(BorderLayout.NORTH,tf);
        add(allBtnPane);

        for(int i=0; i<btnStr.length; i++)
        {
            JButton btn = new JButton(btnStr[i]);
            btn.setFont(fnt);
            btn.setBackground(Color.pink);
            if(i<=2)
            {
                northpath.add(btn);
            }
            else
            {
                centerPane.add(btn);
            }
            //버튼들을 이벤트 등록한다.
            //System.out.println("프로그램이 종료 됩니다.");
            btn.addActionListener(this);
        }

        setSize(500,300);
        setVisible(true);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }

    public static void main(String[] args) {
        new CalculatorEx();
    }

    public void ac(ActionEvent ae){
        JButton event = (JButton)ae.getSource(); // 눌러진 버튼은 여기로 들어온다.
        String btnLb1= event.getText();
        switch (btnLb1)
        {
            case "End":
                System.out.println("프로그램이 종료 됩니다.");
                System.exit(0);
                break;

            case "Clear":
                setClear();
            case "0":

            case "1":

            case "2":

            case "3":

            case "4":

            case "5":

            case "6":

            case "7":

            case "8":

            case "9":
                inNumber(btnLb1);
                break;
            case "+":  case "-":

            case "*":  case "/":
                setResultOperator(btnLb1);
                break;
            case "BackSpace":
                SetBackSpace();
                break;
            case ".":
                setPoint();
                break;
            case "=":
                setResult();
                break;
        }
    }

    public void setClear(){
        result=0.0;
        operator=null;
        tf.setText("0.0");
    }
    public void setResult() {
        double num2 = Double.parseDouble(tf.getText());
      calcu(num2);
        tf.setText(String.valueOf(result));
        operator=null;
    }

    public void setResultOperator(String btnLb1)
    {
        double second = Double.parseDouble(tf.getText());
        if(operator==null)
        {
            result=second;
            operator=btnLb1;
            //tf값을 보관하고
            //연산자를 보관합니다.
        }
        else{
            //이미 연산자 있으면 보관된 값과 tf의 계산하여 result에 보관
            calcu(second);
        }
        operator = btnLb1;
        tf.setText(" ");
    }
    public void calcu(double second)
    {
        switch (operator){
            case "+": result= result+ second; break;
            case "-": result= result- second;break;
            case "*": result= result* second; break;
            case "/": result= result/ second;break;
        }
    }
    public void setPoint(){
        String str = tf.getText();
        int idx = str.indexOf(".");

        if(idx==-1)
        {
         tf.setText(str+".");
        }

    }
    public void SetBackSpace()
    {
        String str =tf.getText();
        int len = str.length();
        String cutstr = str.substring(0,len-1);
        tf.setText(cutstr);
    }

    public void inNumber(String btnLb1) {
        String tfTxt = tf.getText();
        if(tfTxt.equals("0.0"))
        {
            tf.setText(btnLb1);
        }
        else
        {
            tf.setText(tfTxt+btnLb1);//방금 더해진값에다가 실행한다.
        }
    }

    public void inNumber()
    {

    }

    public void actionPerformed(ActionEvent ae) { // 버튼 눌렀을시에 오버라이딩 해주는 곳입니다.
        Object obj = ae.getSource();

    }

}
