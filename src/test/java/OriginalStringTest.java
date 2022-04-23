import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class OriginalStringTest {

    @Test
    public void getIndexUtf() {
        Assertions.assertEquals(51,"w3resource.com".codePointAt(1));
        "w3resource.com".codePointAt(1);
    }


}