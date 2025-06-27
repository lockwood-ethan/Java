import java.util.*;
import java.io.*;

class Props2 {
	public static void main(String[] args) {
		Properties p2 = new Properties();
		try {
			FileInputStream in = new FileInputStream("myProps1.props");
			p2.load(in);
			p2.list(System.out);
			p2.setProperty("newProp", "newData");
			p2.list(System.out);
			FileOutputStream out = new FileOutputStream("myProps2.props");
			p2.store(out, "myUpdate");
			in.close();
			out.close();
		} catch (IOException e) {
			System.out.println("exc 2");
		}
	}
}
