import java.util.Locale;
import java.util.ResourceBundle;



public class HellowWorldi18n {
	
	
	static String language = System.getProperty("user.country");
    static String country = System.getProperty("user.language");
	
    
    static String sring1;
    static String sring2;
	static String sring3;
    static String sring4;
    static String sring5;
	static String sringexir;
	
	protected static void setLanguage(String language ) {
		HellowWorldi18n.language = language;
	}

	protected static void setCountry(String country) {
		HellowWorldi18n.country = country;
	}



	public static void translate() {
		
		
	        Locale currentLocale;
	        ResourceBundle messages;

	        currentLocale = new Locale(language, country);

	        messages = ResourceBundle.getBundle("MessagesBundle", currentLocale);
	        sring1 = messages.getString("greetings");
	        sring2 = messages.getString("inquiry");
	        sring3 = messages.getString("farewell");
	        sring4 = messages.getString("farewelli");
	        sring5 = messages.getString("idioma");
	        sringexir = messages.getString("exit");
	}
	
	 protected static String getSring1() {
			return sring1;
	}

	protected static String getSring2() {
			return sring2;
	}

	protected static String getSring3() {
			return sring3;
	}
	protected static String getSring4() {
		return sring4;
	}
	
	protected static String getSring5() {
		return sring5;
	}
	protected static String getSringexir() {
		return sringexir;
	}
	
	

}
