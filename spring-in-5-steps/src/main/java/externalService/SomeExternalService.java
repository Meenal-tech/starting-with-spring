package externalService;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SomeExternalService {

	// take value from the file - "app.properties"

	@Value("{external.service.url}")
	private String url;

	public String returnUrlService() {
		return url;
	}
}
