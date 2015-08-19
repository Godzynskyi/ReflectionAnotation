package Test2;

import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

/**
 * Created by Java Developer on 17.08.2015.
 */
@SaveTo(path="c:\\file.txt")
public class Container {
    private String content;

    public Container(String content) {
        this.content = content;
    }

    @Save
    public void save(String file) throws IOException {
        System.out.print("Saving \"" + content + "\" to file: " + file);
        OutputStreamWriter out = new FileWriter(file);
        out.write(content);
        out.close();
        System.out.println("    DONE");
    }
}
