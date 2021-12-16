package Calculator;

public class Calculation {
    private double num1 = 0;
    private double num2 = 0;
    private double result = 0;

    public Calculation() {
    }

    public void sum(){
        setResult(getNum1() + getNum2());
    }

    public void subtract(){
        setResult(getNum1() - getNum2());
    }

    public void multiple(){
        setResult(getNum1() * getNum2());
    }

    public void divide(){
        if (getNum2() != 0){
            setResult(getNum1() / getNum2());
        }
    }

    public void clear(){
        setResult(0);
    }

    public void negative(){
        if(getResult() != 0) {
            setResult(getResult() * -1);
        }else {
            setResult(0);
        }
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
