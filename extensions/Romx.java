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
        String n = "";
        int len = a.length();

        System.out.println("Get result "+result);

        if (result.equals(a)) return new Romx(n.concat(b));

        int i;
        for (i = 0; i <= result.length()-len; i += len){
            String sub = result.substring(i, i+len);
            if (sub.equals(a)) n = n.concat(b);
            else n = n.concat(sub);
//            System.out.println(n);
        }

        return new Romx(n.concat(result.substring(i)));
    }

    public Romx pipeEnd(String a, String b) {
        String n = "";
        int len = a.length();
        int cut = result.length() > len? result.length() - len : 0;

        System.out.println("Get result "+result);

        String sub = result.substring(cut);
        if (sub.equals(a)) return new Romx(result.substring(0, cut).concat(b));
        return new Romx(result);
    }

    public String getResult() {
        return result;
    }
}
