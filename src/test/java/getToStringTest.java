import org.assertj.core.internal.Numbers;
import org.assertj.core.internal.bytebuddy.implementation.bind.annotation.This;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class getToStringTest {


    @Test
  public void reduce() {
       assertEquals(-1,getToString.add());
    }

    @Test
    public void truee() {
        assertEquals(0,getToString.add());
    }

    @Test
    public void increase() {
        assertEquals(1,getToString.add());
    }
}
