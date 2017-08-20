package javaBasic;

/**
 * Created by MrSpin on 2017/8/12.
 */
public class TestUser {

    public static  void main(String[] args){

        TestUser tu = new TestUser();
//        testMan();
//        testWomen();
        testInterface();

    }
    public static void testInterface(){
        UserInterfaceImpl userInterface = new UserInterfaceImpl();
        userInterface.eat();
        userInterface.sleep();
        String seeWhat = userInterface.see();
        System.out.println(seeWhat);

        User seeUser = userInterface.seeUser();

        System.out.println(seeUser.getName());

    }

    public static void testUser(){
        User user = new User();
        user.setName("CIO");
        user.setAge(22);
        user.setCity("商丘");
        user.sayHello();
    }

    public static void testMan(){
        Man man = new Man();
        man.makeMoney();
        man.setName("CIO");
        man.sayHello();
    }



    public static void testWomen(){
        Women women = new Women();
        women.careFamily("一心一意");
//        women.careFamily();
        women.setName("CIO");
        women.sayHello();
    }
}
