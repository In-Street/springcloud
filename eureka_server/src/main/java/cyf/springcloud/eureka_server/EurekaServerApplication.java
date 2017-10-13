package cyf.springcloud.eureka_server;

import org.springframework.beans.factory.support.DefaultBeanNameGenerator;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaServerApplication {

	public static void main(String[] args) {

		new SpringApplicationBuilder(EurekaServerApplication.class)
				//类名重复bean的处理
				.beanNameGenerator(new DefaultBeanNameGenerator())
				.run(args);
	}
}
