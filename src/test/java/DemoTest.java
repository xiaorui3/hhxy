import org.example.Demo;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class DemoTest {

    @Test
    public void js() {
        Demo demo = new Demo();
        float actaul = demo.js(2, 0, 4);
        //System.out.println(js);
        float expected =3L;
        Assert.assertEquals(expected,actaul,0);

    }
}