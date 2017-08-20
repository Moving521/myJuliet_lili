package javaBasic;

/**
 * Created by MrSpin on 2017/8/12.
 */
public class UserInterfaceImpl implements UserInterface {
    @Override
    public void sleep() {
    System.out.println("多睡一会");
    }

    @Override
    public void eat() {
    System.out.println("吃饺子");
    }

    @Override
    public String see() {

        return "看到一群||00后美女";
    }

    @Override
    public User seeUser() {
        User user = new User();
        user.setName("程春骊");
        user.setAge(22);
        return user;
    }
}
