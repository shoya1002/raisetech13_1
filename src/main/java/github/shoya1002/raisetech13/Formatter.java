package github.shoya1002.raisetech13;

import java.text.DecimalFormat;

public class Formatter {
    private final DecimalFormat df = new DecimalFormat("#.###");//小数点以下最大3桁、不要なゼロは表示しない

    public String formatResult(double result){
        return df.format(result);
    }
}

