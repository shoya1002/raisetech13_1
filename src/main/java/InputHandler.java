import java.util.Scanner;

public class InputHandler {
    private final Scanner scanner = new Scanner(System.in);

    //生の入力を取得(exit 判定用)
    public String getRawInput(String prompt){
        System.out.print(prompt);
        return scanner.nextLine().trim();
    }
    //数値の入力と検証
    public double getNumber(String prompt){
        String input = getRawInput(prompt);

        if(input.isEmpty()) {
            throw new IllegalArgumentException("数値が入力されていません。");
        }

        try{
            return Double.parseDouble(input);
        }catch (NumberFormatException e){
            throw new IllegalArgumentException("数値を入力してください。");
        }
    }
//演算子の入力と検証
    public String getOperator(String prompt){
        String operator = getRawInput(prompt);

        if (!(operator.equals("+") || operator.equals("-") ||
                operator.equals("*") || operator.equals("/")|| operator.equals("%"))) {
            throw new IllegalArgumentException("演算子が正しくありません。+ - * / % のいずれかを入力してください。");
        }
        return operator;
    }
}
