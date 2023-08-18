package extensions;

import java.util.function.BiFunction;
import java.util.function.Function;

public class Opx<T> {
    private T res;
    public Opx(T t) {
        res = t;
    }

    public static <T> Opx<T> start(T in) {
        return new Opx<>(in);
    }

    public <Tout> Opx<Tout> pipe(Function<T, Tout> func){
        return new Opx<>(func.apply(res));
    }

    public <Tin, Tout> Opx<Tout> pipe(BiFunction<T, Tin, Tout> func, Tin in){
        return new Opx<>(func.apply(res, in));
    }

    public T getResult() {
        return res;
    }
}
