package Test1;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by Java Developer on 17.08.2015.
 */
public class Main {
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
        Foo foo = new Foo();
        Class<?> cls = foo.getClass();
        Method[] methods = cls.getMethods();
        for(Method method:methods) {
            if(method.isAnnotationPresent(Test1.class)) {
                Test1 annotation = method.getAnnotation(Test1.class);
                int a = annotation.a();
                int b = annotation.b();
                method.invoke(foo,a,b);
            }
        }
    }
}
