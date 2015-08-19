package Test1;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by Java Developer on 17.08.2015.
 */
@Target(ElementType.METHOD)
@Retention(value= RetentionPolicy.RUNTIME)
public @interface Test1 {
    int a();
    int b();
}
