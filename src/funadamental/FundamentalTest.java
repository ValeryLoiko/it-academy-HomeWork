package funadamental;

import funadamental.Fundamental;
import org.junit.Assert;
import org.junit.Test;

//import static org.junit.jupiter.api.Assertions.*;

public class FundamentalTest {

    @Test
   public void resoult() {
        double a = 20;
        double b = 21;
        double c = 22;
        double d = 23;
        double expectedResoult = 0.04347826086956508;
       double testResoult = Fundamental.resoult(a, b, c, d);
      Assert.assertEquals( testResoult, expectedResoult,0000001);
    }
}