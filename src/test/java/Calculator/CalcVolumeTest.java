package Calculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalcVolumeTest {
private final CalcVolume calcVolume = new CalcVolume();

    @Test
    void testVolumeOfPyramid() {
        calcVolume.setNum1(10);
        calcVolume.setNum2(5);
        calcVolume.setNum3(5);

        calcVolume.volumeOfPyramid();
        double result = calcVolume.getResult();

        assertEquals(83.33333333333333, result);
    }

    @Test
    void volumeOfRecCuboid() {
        calcVolume.setNum1(10);
        calcVolume.setNum2(5);
        calcVolume.setNum3(5);

        calcVolume.volumeOfRecCuboid();
        double result = calcVolume.getResult();

        assertEquals(250.0, result);
    }

    @Test
    void volumeOfSphere() {
        calcVolume.setNum1(10);
        calcVolume.setNum2(5);
        calcVolume.setNum3(5);

        calcVolume.volumeOfSphere();
        double result = calcVolume.getResult();

        assertEquals(523.5987755982989, result);
    }

    @Test
    void getNum3() {
        calcVolume.setNum3(5);
        double result = calcVolume.getNum3();
        assertEquals(5,result);
    }

    @Test
    void setNum3() {
        calcVolume.setNum3(5);
        double result = calcVolume.getNum3();
        assertEquals(5,result);
    }
}