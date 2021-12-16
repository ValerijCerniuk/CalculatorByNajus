package Calculator;

public class Calculation {
    private double num1 = 0;
    private double num2 = 0;
    private double result = 0;

    public Calculation() {
    }

    public void sumAction(){
        setResult(getNum1() + getNum2());
    }

    public void subtractAction(){
        setResult(getNum1() - getNum2());
    }

    public void multipleAction(){
        setResult(getNum1() * getNum2());
    }

    public void divideAction(){
        if (getNum2() != 0){
            setResult(getNum1() / getNum2());
        }
    }

    public void clearAction(){
        setResult(0);
    }

    public void negativeAction(){
        setResult(getResult() * -1);
    }

    public double getNum1() {
        return num1;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }

    public double getResult() {
        return result;
    }

    public void setResult(double result) {
        this.result = result;
    }
}
