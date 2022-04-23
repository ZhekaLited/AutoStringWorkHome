import org.assertj.core.internal.Numbers;
import org.assertj.core.internal.bytebuddy.implementation.bind.annotation.This;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class getToStringTest {


    @Test
  public void reduce() {
       assertEquals(-1,getToString.add(18));
    }

    @Test
    public void truee () {

        assertEquals(0,getToString.add(18));
    }

    @Test
    public void increase() {
        assertEquals(2,getToString.add(19));
    }
}