package Test3;

import java.io.*;
import java.lang.reflect.Field;

/**
 * Created by Java Developer on 17.08.2015.
 */
public class Main {
    public static void main(String[] args) throws IOException, IllegalAccessException, ClassNotFoundException {
        String path = "c:\\file1.txt";

        Serialize ser = new Serialize(1,"Hello world", "ssss");
        Class<?> cls = ser.getClass();
        Field[] fields = cls.getDeclaredFields();

        //Serialize
        FileOutputStream out = new FileOutputStream(path);
        ObjectOutputStream oos = new ObjectOutputStream(out);
        for(Field field : fields) {
            if(field.isAnnotationPresent(Save.class)) {
                Object o = field.get(ser);
                oos.writeObject(o);
            }
        }
        oos.close();
        out.close();

        //Deserialize
        Serialize ser1 = new Serialize();
        FileInputStream in = new FileInputStream(path);
        ObjectInputStream ois = new ObjectInputStream(in);
        Field[] fields1 = ser1.getClass().getDeclaredFields();
        for(Field field : fields1) {
            if(field.isAnnotationPresent(Save.class)) {

                Object o = ois.readObject();
                Class<?> cl = o.getClass();
                field.set(ser1, cl.cast(o));
            }
        }
        ois.close();
        in.close();

        System.out.println(ser1.toString());




    }
}
