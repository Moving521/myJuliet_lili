import java.util.Optional;
import java.util.stream.Stream;

/**
 * Created by MrSpin on 2017/8/6.
 */
public class OptionDemo {
            public static void main(String[] args){

                new OptionDemo().demoStr();
            }

            public void testOf(){
                User user=new  User("ZhangSan",50,"北京");

            }
            public  void demoStr(){
                Stream<String> names = Stream.of("Qamurudu", "Okanbi", "Oduduwa");
                Optional<String> longest = names
                        .filter(name -> name.startsWith("Q"))
                        .findFirst();

                String alternate = longest.orElseGet(() -> {
                    // perform some interesting code operation
                    // then return the alternate value.
                    return "Nimrod";
                });
                System.out.println(alternate);
            }
}
