public class Main {
    public static void main(String[] args){
        InputHandler inputHandler = new InputHandler();
        Calculator calculator = new Calculator();
        Formatter formatter = new Formatter();

        System.out.println("簡易計算機プログラム（終了するには'exit'と入力）");

        while(true){
            try{
                //終了判定
                String inputCheck = inputHandler.getRawInput("1つ目の数値を入力してください：");
                if(inputCheck.equalsIgnoreCase("exit")){
                    System.out.println("プログラムを終了します。");
                    break;
                }
                double num1 = Double.parseDouble(inputCheck);

                String operator = inputHandler.getOperator("演算子（+,-,:,/,%）を入力してください：");
                double num2 = inputHandler.getNumber("2つ目の数値を入力してください：");

                double result = calculator.calculate(num1,num2,operator);
                String formattedResult = formatter.formatResult(result);

                System.out.println("計算結果："+ formattedResult );

            } catch (Exception e){
                System.out.println("エラー："+e.getMessage());
            }
        }
    }
}
