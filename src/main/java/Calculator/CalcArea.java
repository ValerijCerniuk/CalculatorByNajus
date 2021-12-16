package Calculator;

public class CalcArea extends Calculation{

    public void areaOfTriangle(){
        multiple();
        setResult(getResult() / 2);
    }

    public void areaOfRectangle(){
        multiple();
    }

    public void areaOfCircle(){
        setResult(Math.PI * Math.pow(getNum1(),2));
    }

}
