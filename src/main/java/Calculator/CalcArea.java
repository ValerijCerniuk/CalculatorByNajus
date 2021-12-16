package Calculator;

public class CalcArea extends Calculation{

    public void areaOfTriangle(){
        multipleAction();
        setResult(getResult() / 2);
    }

    public void areaOfRectangle(){
        multipleAction();
    }

    public void areaOfCircle(){
        setResult(Math.PI * Math.pow(getNum1(),2));
    }

}
