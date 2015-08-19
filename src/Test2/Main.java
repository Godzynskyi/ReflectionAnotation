package Test2;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by Java Developer on 17.08.2015.
 */
public class Main {
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
        Container container = new Container("Hello World");
        Class<?> cls = container.getClass();
        if(cls.isAnnotationPresent(SaveTo.class)) {
            Method[] declaredMethods = cls.getDeclaredMethods();
            for(Method method : declaredMethods) {
                if(method.isAnnotationPresent(Save.class)) {
                    String path = cls.getAnnotation(SaveTo.class).path();
                    method.invoke(container,path);
                }
            }
        }
    }
}
