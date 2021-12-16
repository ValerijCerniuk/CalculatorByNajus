package Calculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculationTest {
    private final Calculation calculation = new Calculation();


    @Test
    void testSumAction() {
        calculation.setNum1(10);
        calculation.setNum2(5);

        calculation.sumAction();
        double result = calculation.getResult();

        assertEquals(15.0, result);
    }

    @Test
    void subtractAction() {
        calculation.setNum1(10);
        calculation.setNum2(5);

        calculation.subtractAction();
        double result = calculation.getResult();

        assertEquals(5.0, result);
    }

    @Test
    void multipleAction() {
        calculation.setNum1(10);
        calculation.setNum2(5);

        calculation.multipleAction();
        double result = calculation.getResult();

        assertEquals(50, result);
    }

    @Test
    void divideAction() {
        calculation.setNum1(10);
        calculation.setNum2(5);

        calculation.divideAction();
        double result = calculation.getResult();

        assertEquals(2.0, result);
    }

    @Test
    void clearAction() {


        calculation.clearAction();
        double result = calculation.getResult();

        assertEquals(0.0, result);
    }

    @Test
    void negativeAction() {

        calculation.setResult(5);

        calculation.negativeAction();
        double result = calculation.getResult();

        assertEquals(-5.0, result);
    }

    @Test
    void getNum1() {
        calculation.setNum1(5);
        double result = calculation.getNum1();
        assertEquals(5,result);
    }

    @Test
    void setNum1() {
        calculation.setNum1(5);
        double result = calculation.getNum1();
        assertEquals(5,result);
    }

    @Test
    void getNum2() {
        calculation.setNum2(5);
        double result = calculation.getNum2();
        assertEquals(5,result);
    }

    @Test
    void setNum2() {
        calculation.setNum2(5);
        double result = calculation.getNum2();
        assertEquals(5,result);
    }

    @Test
    void getResult() {
        calculation.setResult(5);
        double result = calculation.getResult();
        assertEquals(5,result);
    }

    @Test
    void setResult() {
        calculation.setResult(5);
        double result = calculation.getResult();
        assertEquals(5,result);
    }
}