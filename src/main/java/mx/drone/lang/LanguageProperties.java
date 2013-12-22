package mx.drone.lang;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.ResourceBundle;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LanguageProperties {

	private static final Logger logger = LoggerFactory.getLogger(LanguageProperties.class);

	private static final Map<Locale, ResourceBundle> languageProperties = new HashMap<Locale, ResourceBundle>();

	public static String getString(String key) {
		Locale locale = Locale.getDefault();
		String string = getLanguageProperties(locale).getString(key);
		logger.debug("got {}={} for locale {}", key, string, locale);
		return string;
	}

	private static ResourceBundle getLanguageProperties(Locale locale) {
		ResourceBundle bundle = languageProperties.get(locale);

		if (bundle == null) {
			bundle = ResourceBundle.getBundle("lang/ui", locale);
		}

		if (bundle == null) {
			throw new IllegalStateException("could not find language properties for " + locale);
		}
		return bundle;
	}

}
