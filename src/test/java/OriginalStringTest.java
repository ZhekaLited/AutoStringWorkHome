import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

public class OriginalStringTest {
    private static final ByteArrayOutputStream out = new ByteArrayOutputStream();
    private static final PrintStream origOut = System.out;

    @BeforeEach
    public void setupStream2 () {
        System.setOut(new PrintStream(out)); //Создаем исскусвенную консоль
    }

    @AfterEach
    public void restoreStream() {
        System.setOut(origOut);
    }

    @Test
    public void test() {
        System.setOut(new PrintStream(out));
        // System.out.print("hello");
        OriginalString.main(new String[]{});
        Assertions.assertEquals("Original String : w3resource.com\r\n" +
                "Character(unicode point) = 51\r\n" +
                "Character(unicode point) = 51\r\n",out.toString());
        //System.setOut(origOut);
    }

    @Test
    public void getIndexUtf() {
        Assertions.assertEquals(51,"w3resource.com".codePointAt(1));
        "w3resource.com".codePointAt(1);
    }


}
