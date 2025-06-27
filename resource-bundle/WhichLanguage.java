import java.util.Locale;
import java.util.ResourceBundle;
import java.util.ListResourceBundle;

public class WhichLanguage {
	public static void main(String[] args) {
		Locale locale = new Locale("en", "UK");
		ResourceBundle rb = ResourceBundle.getBundle("RB", locale);
		System.out.println(rb.getString("ride.in") + " " + rb.getString("elevator"));
	}
}

public class Labels_en_CA extends ListResourceBundle {
	protected Object[][] getContents() {
		return new Object[][] {
				{ "hello", new StringBuilder("from Java") }
		};
	}
}
