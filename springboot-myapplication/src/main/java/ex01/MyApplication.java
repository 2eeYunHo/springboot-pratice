package ex01;

import org.springframework.boot.SpringApplication;
import org.springframework.context.ConfigurableApplicationContext;

@Configuration
public class MyApplication {

	@Bean
	public MyComponent myCompoenent() {
		return new MyComponent;
	}

	public static void main(String[] args) {
		try (ConfigurableApplicationContext c = SpringApplication.run(MyApplication.class, args)) {
		
		}
	}
}