package Data0629Frame;

import java.awt.*;

//컨테이너 Frame 상속받아 구현한기
public class FrameTest extends Frame{//프레임안에서 상속받음 {//프레임 상속받았다.
    Point xy=new Point(500,300);
    Dimension wh = new Dimension(500,300);
    Rectangle rect = new Rectangle(400,200,400,400);
    public FrameTest(){
        super("하위에서 제목설정");//상위클래스에 있는것을 가져와서 Title을 만들어준다.
//        //setTitle("Test 프로그램입니다.");//title 지정해준다.
//        //setSize(500,400);//창의 크기를 정해줌
          setSize(wh);

//       // setBounds(200,200,500,400); //x , y ,width,height //rectangle
           // setBounds(rect);
//        setSize(500,500); //w, h Dimension 객체 넣을수 있음 폭과 높이를 가지고있다.
//        setLocation(300,300); // x ,y  //point      x좌표 y좌표를 가지고잇다.

//
//        Toolkit tk = Toolkit.getDefaultToolkit();
//        Image icon=Toolkit.getDefaultToolkit().getImage("img/10.jpg");
//        //Image icon =tk.getImage("img/10.jpg"); //객체생성하지 않고 그것들을 이용해 객체를 만들어서 이미지를 생성한다.
//
//        //Button 제공 클래스
//        Button btn = new Button("1");
//        Button btn1 = new Button("2");
//        Button btn2= new Button("3");
//        Button btn3 = new Button("4");
//        Button btn4 = new Button("5");
//        add(btn);
//        add(BorderLayout.NORTH,btn1);
//        add(BorderLayout.SOUTH,btn2);
//        add(BorderLayout.EAST,btn3);
//        add(BorderLayout.WEST,btn4);

//        setIconImage(icon);//타이틀바에 이미지 아이콘 추가하기

        setVisible(true);//창의 화면에 true : 보여줌 false: 안보여줌

    }
    public static void main(String[] args) {

        new FrameTest();
    }
}
