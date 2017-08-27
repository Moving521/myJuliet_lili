package annotionDemo;

import java.lang.annotation.*;

/**
 * Created by MrSpin on 2017/8/23.
 */
@Documented
@Target(ElementType.FIELD)
@Inherited
@Retention(RetentionPolicy.RUNTIME)
public @interface ParamInfo {
    String type() default "String";
    String value();
}
