package pakagecom.github.shoya1002;

public class Calculator {
    public double calculate(double num1,double num2,String operator){
        switch (operator){
            case "+":
                return num1 + num2;
            case "-":
                return num1 - num2;
            case "*":
                return num1 * num2;
            case"/":
                if(num2 == 0) {
                    throw new ArithmeticException("0で割ることはできません");
                }
                return num1 / num2;
            case "%":
                if(num2 == 0){
                    throw new ArithmeticException("0で剰余は計算できません。");
                }
                return num1 % num2;
            default:
                throw new IllegalArgumentException("不明な演算子です。");
        }
    }
}
