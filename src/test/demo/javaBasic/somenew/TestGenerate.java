package javaBasic.somenew;

/**
 * Created by MrSpin on 2017/8/20.
 */
public class TestGenerate {
    public static void main(String[] args) throws ClassNotFoundException {
        GenericDemo<String> pair=new GenericDemo<String>("Hello");
        String str=pair.getValue();
        System.out.println(str);
        pair.setValue("World");
        str=pair.getValue();
        System.out.println(str);
    }
}
