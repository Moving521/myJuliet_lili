package javaBasic.somenew;

/**
 * Created by MrSpin on 2017/8/20.
 */
public class GenericDemo<T> {
    private T value;

    public GenericDemo() {
    }

    public GenericDemo(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}
