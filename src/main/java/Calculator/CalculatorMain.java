package Calculator;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class CalculatorMain {

    public static void main(String[] args) {

        Calculation calculation = new Calculation();
        CalcArea calcArea = new CalcArea();
        CalcVolume calcVolume = new CalcVolume();

        calculation.setNum1(10);
        calculation.setNum2(5);
        calculation.setResult(10);

        calcArea.setNum1(10);
        calcArea.setNum2(5);
        calcArea.setResult(10);

        calcVolume.setNum1(10);
        calcVolume.setNum2(5);
        calcVolume.setNum3(5);
        calcVolume.setResult(10);

        for (Method method : calculation.getClass().getDeclaredMethods()) {
            String methodName = method.getName();
            if (methodName.contains("set") || methodName.contains("get")) {

            } else {
                if (methodName.contains("clear") || methodName.contains("negative")) {
                    System.out.print("Result was: " + calculation.getResult() + ". Now: ");
                } else {
                    System.out.print(calculation.getNum1() + " " + methodName + " " + calculation.getNum2() + " = ");
                }
                try {
                    method.invoke(calculation);
                } catch (IllegalArgumentException e) {
                    System.out.println("Illegal Argument Exception in " + methodName);
                } catch (IllegalAccessException e) {
                    System.out.println("Illegal Access Exception in " + methodName);
                } catch (InvocationTargetException e) {
                    System.out.println("Invocation Target Exception in" + methodName);
                }
                System.out.println(calculation.getResult());
            }
        }
        System.out.println();

        for (Method method : calcArea.getClass().getDeclaredMethods()) {
            String methodName = method.getName();
            if (!(methodName.contains("set") || methodName.contains("get"))) {
                if (methodName.contains("areaOfCircle")) {
                    System.out.print(methodName + "  With radius: " + calcArea.getNum1() + " is ");
                } else {
                    System.out.print(methodName + " With Length: " + calcArea.getNum1() + " Width: "
                            + calcArea.getNum2() + " is ");
                }
                try {
                    method.invoke(calcArea);
                } catch (IllegalArgumentException e) {
                    System.out.println("Illegal Argument Exception in " + methodName);
                } catch (IllegalAccessException e) {
                    System.out.println("Illegal Access Exception in " + methodName);
                } catch (InvocationTargetException e) {
                    System.out.println("Invocation Target Exception in" + methodName);
                }
            } else {
            }

            System.out.println(calcArea.getResult());
        }
        System.out.println();

    /** soo... this code below was successfully replaced with code at top
     *
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
     */

        System.out.println("Volume of Right rectangular pyramid:\n"+
                "Side A: "+calcVolume.getNum1()+"; Side B: "+calcVolume.getNum2()+
                "; Height: "+calcVolume.getNum3());
        calcVolume.volumeOfPyramid();
        System.out.println(calcVolume.getResult());

        System.out.println("Volume of rectangular cuboid:\n"+
                "Side A: "+calcVolume.getNum1()+"; Side B: "+calcVolume.getNum2()+
                "; Height: "+calcVolume.getNum3());
        calcVolume.volumeOfRecCuboid();
        System.out.println(calcVolume.getResult());

        System.out.println("Volume of Sphere:"+
                " Radius: "+calcVolume.getNum3());
        calcVolume.volumeOfSphere();
        System.out.println(calcVolume.getResult());

    }
}
