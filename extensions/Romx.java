package extensions;

import java.util.ArrayList;
import java.util.List;

public class Romx {
    private String result = "";

    public Romx(Integer in) {
        for(int i = 0; i < in; i++){
            result = result.concat("I");
        }
    }

    public Romx(String rom) {
        result = rom;
    }

    public static Romx start(Integer in) {
        return new Romx(in);
    }

    public Romx pipe(String a, String b) {
        String n = result.replace(a, b);
        return new Romx(n);
    }

    public String getResult() {
        return result;
    }
}
