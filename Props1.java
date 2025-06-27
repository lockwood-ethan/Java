import java.util.*;
import java.io.*;

class Props1 {
	public static void main(String[] args) {
		Properties p = new Properties();
		p.setProperty("k1", "v1");
		p.setProperty("k2", "v2");
		p.list(System.out); // what's in the object

		try {
			// creates or replaces file
			FileOutputStream out = new FileOutputStream("myProps1.props");
			p.store(out, "test-comment");// adds header comment
			out.close();
		} catch (IOException e) {
			System.out.println("exc 1");
		}
	}
}
