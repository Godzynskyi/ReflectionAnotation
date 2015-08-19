package Test3;


import java.io.Serializable;

/**
 * Created by Java Developer on 17.08.2015.
 */
public class Serialize implements Serializable{
    @Save
    int a;

    @Save
    String str;

    String str1;

    public Serialize(int a, String str, String str1) {
        this.a = a;
        this.str = str;
        this.str1 = str1;
    }

    public Serialize() {
    }

    @Override
    public String toString() {
        return "a= " + a + " ; str= " + str + " ; str1= " + str1;
    }
}
