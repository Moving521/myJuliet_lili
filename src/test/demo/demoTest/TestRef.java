package demoTest;

import annotionDemo.ParamInfo;
import entity.ErrorInfo;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.*;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by MrSpin on 2017/8/23.
 */
public class TestRef {


    public void searchPOI(){
        File file = new File("");
        try {
            HSSFWorkbook workbook = new HSSFWorkbook(new FileInputStream(file));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }


    public static void main(String[] args) throws IllegalAccessException, InstantiationException {

        Class clazz = ErrorInfo.class;
        Field[] fields=clazz.getDeclaredFields();
        for (Field field:fields) {
            ParamInfo fieldAnno = field.getAnnotation(ParamInfo.class);
            System.out.println(fieldAnno.value());
        }
        Object obj = clazz.newInstance();
        Method[] methods = clazz.getMethods();
        for (Method method:methods) {
            if(method.getName().startsWith("set")){
                try {
                    method.invoke(obj,"1111111");
                } catch (InvocationTargetException e) {
                    e.printStackTrace();
                }

            }

            System.out.println(method.getName());
        }

        System.out.println("=================="+((ErrorInfo)obj).getIdCard());
    }

    private Object createObject(String clazzName) throws Exception {
                Class<?> clazz = Class.forName(clazzName);
             //使用clazz默认构造器创建对象
             return clazz.newInstance();
         }
}
