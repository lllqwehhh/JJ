package FileReaderWriter;

import org.junit.Test;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author HAO LIU
 * @date 2020-04-13   16:45
 */
public class IOTest {
    @Test
    public void fileReadWrite() throws IOException {
        FileReader fileReader = null;
        FileWriter fileWriter = null;
//        try {
            fileReader = new FileReader("textinput");
            fileWriter = new FileWriter("textoutput",true);


//            int len;
//            char[] cbuf = new char[5];
//            while ((len = fileReader.read(cbuf)) != -1) {
//                fileWriter.write(cbuf,0,len);
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        } finally {
//            try {
//                fileReader.close();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//            try {
//                fileWriter.close();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }
    }
}
