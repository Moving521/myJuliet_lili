/**
 * Created by MrSpin on 2017/7/23.
 */
public class User {

    //成员变量
    private  String name;//String类型

    private  int age;//Integer类型

    private String city;
    //构造方法 无成员变量
    public User() {
    }
//    构造方法
    public User(String name, int age, String city) {
        this.name = name;
        this.age = age;
        this.city = city;
    }
    //
    public void sayHello(){
        System.out.print("hello 我是 "+this.name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
