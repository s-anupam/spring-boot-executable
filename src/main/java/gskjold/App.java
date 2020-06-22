package gskjold;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

/**
 * Created by Gunnar Skjold @ Origin AS on 22.06.2020.
 */
@SpringBootApplication
@EnableConfigurationProperties
public class App {

	public static void main(String[] args) {
		new SpringApplicationBuilder(App.class).run(args);
	}
}
