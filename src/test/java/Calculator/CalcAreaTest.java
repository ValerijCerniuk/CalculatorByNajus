package Calculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalcAreaTest {
    private final CalcArea calcArea = new CalcArea();

    @Test
    void TestAreaOfTriangle() {
        calcArea.setNum1(10);
        calcArea.setNum2(5);

        calcArea.areaOfTriangle();
        double result = calcArea.getResult();

        assertEquals(25, result);
    }

    @Test
    void testAreaOfRectangle() {
        calcArea.setNum1(10);
        calcArea.setNum2(5);

        calcArea.areaOfRectangle();
        double result = calcArea.getResult();

        assertEquals(50, result);
    }

    @Test
    void testAreaOfCircle() {
        calcArea.setNum1(10);

        calcArea.areaOfCircle();
        double result = calcArea.getResult();

        assertEquals(314.1592653589793, result);
    }
}