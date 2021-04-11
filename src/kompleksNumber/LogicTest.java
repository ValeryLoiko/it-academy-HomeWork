package kompleksNumber;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LogicTest {

    @Test
    void operationSum() {

        Numbers a = new Numbers(50, -63);
        Numbers b = new Numbers(-43, -12);
        Numbers expectResoult = new Numbers(80, -84);
        Numbers realResoult = Logic.operationSum(a, b);
        Assert.assertEquals(expectResoult, realResoult);

    }

    @Test
    void operationSubtract() {
        Numbers a = new Numbers(50, -63);
        Numbers b = new Numbers(-43, -12);
        Numbers expectResoult = new Numbers(80, -84);
        Numbers realResoult = Logic.operationSubtract(a, b);
        Assert.assertEquals(expectResoult, realResoult);
    }
}