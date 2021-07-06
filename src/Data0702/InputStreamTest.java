package Data0702;

import java.io.IOException;
import java.io.InputStream;

public class InputStreamTest {


    public InputStreamTest() {
        try {
            InputStream is = System.in;

            while (true) {
                byte data[] = new byte[5];
                int cnt = is.read(data);
                //read 한 값이 -1 이 return 됨

//                int code = is.read();
//                System.out.print(is.read());
//                System.out.print("입력");
//                System.out.println((int)code);
//                if(code!=-1)
//                {
//                    System.out.print("--------------");
//                    break;
//                }

                //if(code!=-1){break;}
            }
        }catch(IOException e)
        {

        }
    }



    public static void main(String[] args) {
        new InputStreamTest();
    }
}
