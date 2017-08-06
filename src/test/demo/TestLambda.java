import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * Created by MrSpin on 2017/7/23.
 */
public class TestLambda {



    public static void main(String[] args) {
        testWithUser();


        // 使用lambda表达式
//        List<Integer> costBeforeTax = Arrays.asList(100, 200, 300, 400, 500);
//        costBeforeTax.stream().map((cost) -> cost +.12* cost).forEach(System.out::println);
//
//        // 新方法：
//        List<Integer>  costBeforeTax1 = Arrays.asList(100, 200, 300, 400, 500);
//        double bill = costBeforeTax1.stream().map((cost) -> cost + .12*cost).reduce((sum, cost) -> sum + cost).get();
//        System.out.println("Total : " + bill);

//      / Java 8方式：
// 甚至可以用and()、or()和xor()逻辑函数来合并Predicate，
// 例如要找到所有以J开始，长度为四个字母的名字，你可以合并两个Predicate并传入
//  List languages = Arrays.asList("Java", "Scala", "C++", "Haskell", "Lisp");
//
//        Predicate<String> startsWithJ = (n) -> n.startsWith("J");
//        Predicate<String> fourLetterLong = (n) -> n.length() == 4;
//        languages.stream()
//                .filter(startsWithJ.and(fourLetterLong))
//                .forEach((n) -> System.out.print(n+"\t Name, which starts with 'J' and four letter long"));
//


    }


    public static void testWithUser(){
        User user1=new  User("ZhangSan",50,"北京");
        User user2=new  User("LiSi",20,"北京");
        User user3=new  User("LiWu",30,"上海");
        User user4=new  User("LILI",40,"上海");
        User user5=new  User("Lucy",55,"北京");
        User user6=new  User("Lucy4",15,"天津");
        User user7=new  User("Lucy5",50,"北京");

        List<User>  userList = Arrays.asList(user1, user2,user3, user4, user5);
        Predicate<User> lte40 = (n) -> n.getAge()>=40;
//        userList.stream().filter(lte40).forEach(n->System.out.println(n.getName()));

        List<User>  newUserList=  userList.stream().filter(lte40).collect(Collectors.toList());
        for (User user:
             newUserList) {
            System.out.println(user.getName()+"\t"+user.getAge());
        }
// 用所有不同的数字创建一个正方形列表
        List<Integer> numbers = Arrays.asList(9, 10, 3, 4, 7, 3, 4);
        List<Integer> distinct = numbers.stream().map( i -> i*i).distinct().collect(Collectors.toList());
        System.out.printf("Original List : %s,  Square Without duplicates : %s %n", numbers, distinct);
    }

}
