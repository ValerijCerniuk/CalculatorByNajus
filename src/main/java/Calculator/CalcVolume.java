package Calculator;

public class CalcVolume extends CalcArea{
    private double num3 = 0;

    public void volumeOfPyramid(){
/** variantas 1 naudojant methodus is Calculatuin */
//        multipleAction();
//        setNum1(getResult());
//        setNum2(num3);
//        multipleAction();
//        setNum1(getResult());
//        setNum3(3);
//        divideAction();
/**variantas 2 naudojant methoda is tos pacios klases */
//        volumeOfCube();
//        setResult(getResult()/3);
/** variantas 3 naudojant tik kintamosius */
        setResult((getNum1() * getNum2() * num3) / 3);
    }

    public void volumeOfRecCuboid(){
        areaOfRectangle();
        this.setResult(getResult() * num3);
    }

    public void volumeOfSphere(){
        setResult((4.0/3.0) * Math.PI * Math.pow(num3,3));
    }

    public double getNum3() {
        return num3;
    }

    public void setNum3(double num3) {
        this.num3 = num3;
    }
}
