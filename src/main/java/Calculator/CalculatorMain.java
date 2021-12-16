package Calculator;

import java.lang.reflect.Method;
import java.util.Arrays;

public class CalculatorMain {
    public static void main(String[] args) {

        Calculation calculation = new Calculation();
        calculation.setNum1(10);
        calculation.setNum2(5);

        calculation.sumAction();
        System.out.println(calculation.getResult());

        calculation.subtractAction();
        System.out.println(calculation.getResult());

        calculation.divideAction();
        System.out.println(calculation.getResult());

        calculation.multipleAction();
        System.out.println(calculation.getResult());

        calculation.negativeAction();
        System.out.println(calculation.getResult());

        calculation.clearAction();
        System.out.println(calculation.getResult());

        CalcArea calcArea = new CalcArea();
        calcArea.setNum1(5);
        calcArea.setNum2(3);

        System.out.println("Triangle Area:\n Base: " + calcArea.getNum1() + "; Height: " + calcArea.getNum2());
        calcArea.areaOfTriangle();
        System.out.println(calcArea.getResult());

        System.out.println("Rectangle Area:\n Side A: " + calcArea.getNum1() + "; Side B: " + calcArea.getNum2());
        calcArea.areaOfRectangle();
        System.out.println(calcArea.getResult());

        System.out.println("Circle Area:\n Radius: " + calcArea.getNum1());
        calcArea.areaOfCircle();
        System.out.println(calcArea.getResult());

        CalcVolume calcVolume = new CalcVolume();
        calcVolume.setNum1(5);
        calcVolume.setNum2(5);
        calcVolume.setNum3(3);

        System.out.println("Volume of Right rectangular pyramid:\n" +
                "Side A: " + calcVolume.getNum1() + "; Side B: " + calcVolume.getNum2() +
                "; Height: " + calcVolume.getNum3());
        calcVolume.volumeOfPyramid();
        System.out.println(calcVolume.getResult());

        System.out.println("Volume of rectangular cuboid:\n" +
                "Side A: " + calcVolume.getNum1() + "; Side B: " + calcVolume.getNum2() +
                "; Height: " + calcVolume.getNum3());
        calcVolume.volumeOfRecCuboid();
        System.out.println(calcVolume.getResult());

        System.out.println("Volume of Sphere:" +
                " Radius: " + calcVolume.getNum3());
        calcVolume.volumeOfSphere();
        System.out.println(calcVolume.getResult());



    }
}
