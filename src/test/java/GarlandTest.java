
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GarlandTest {
    public static final Garland testGarland = new Garland();

    @Test
     void testGarlandWhenOne(){
        testGarland.setSecond(1);
        int actualCountLightBulb = testGarland.countLightBulb();
        int expectedCountLightBulb = 1;
        assertEquals(actualCountLightBulb,expectedCountLightBulb);
    }
    @Test
     void testGarlandWhenTwo(){
        testGarland.setSecond(2);
        int actualCountLightBulb = testGarland.countLightBulb();
        int expectedCountLightBulb = 1;
        assertEquals(actualCountLightBulb,expectedCountLightBulb);
    }
    @Test
     void testGarlandWhenThree(){
        testGarland.setSecond(3);
        int actualCustLightBulb = testGarland.countLightBulb();
        int expectedCustLightBulb = 2;
        assertEquals(actualCustLightBulb,expectedCustLightBulb);
    }
    @Test
     void testGarlandWhenFour(){
        testGarland.setSecond(4);
        int actualCustLightBulb = testGarland.countLightBulb();
        int expectedCustLightBulb = 1;
        assertEquals(actualCustLightBulb,expectedCustLightBulb);
    }
     @Test
     void testGarlandWhenFive(){
        testGarland.setSecond(5);
        int actualCustLightBulb = testGarland.countLightBulb();
        int expectedCustLightBulb = 2;
        assertEquals(actualCustLightBulb,expectedCustLightBulb);
    }

    @Test
    void testStartArray(){
        testGarland.setSecond(5);
        testGarland.startArray();
        int[] actualStartArray = testGarland.startArray;
        int[] expectedStartArray = {1,0,0,0,0};
        assertArrayEquals(actualStartArray,expectedStartArray);
    }
    @Test
    void testGarlandLightBulbThree(){
        testGarland.setSecond(3);
        testGarland.garlandLightBulb();
        int[] actualGarlandLightBulb = testGarland.startArray;
        int[] expectedGarlandLightBulb = {1,0,1};
        assertArrayEquals(actualGarlandLightBulb,expectedGarlandLightBulb);
    }
    @Test
    void testGarlandLightBulbTwo(){
        testGarland.setSecond(2);
        testGarland.garlandLightBulb();
        int[] actualGarlandLightBulb = testGarland.startArray;
        int[] expectedGarlandLightBulb = {0,1};
        assertArrayEquals(actualGarlandLightBulb,expectedGarlandLightBulb);
    }
    @Test
    void testGarlandLightBulbOne(){
        testGarland.setSecond(1);
        testGarland.garlandLightBulb();
        int[] actualGarlandLightBulb = testGarland.startArray;
        int[] expectedGarlandLightBulb = {1};
        assertArrayEquals(actualGarlandLightBulb,expectedGarlandLightBulb);
    }
    @Test
    void testGarlandLightBulbFour(){
        testGarland.setSecond(4);
        testGarland.garlandLightBulb();
        int[] actualGarlandLightBulb = testGarland.startArray;
        int[] expectedGarlandLightBulb = {0,0,0,1};
        assertArrayEquals(actualGarlandLightBulb,expectedGarlandLightBulb);
    }
    @Test
    void testGarlandLightBulbSix(){
        testGarland.setSecond(6);
        testGarland.garlandLightBulb();
        int[] actualGarlandLightBulb = testGarland.startArray;
        int[] expectedGarlandLightBulb = {0,1,0,0,0,1};
        assertArrayEquals(actualGarlandLightBulb,expectedGarlandLightBulb);
    }
}