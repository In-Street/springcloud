package cyf.springcloud.configserver;

import org.springframework.beans.factory.support.DefaultBeanNameGenerator;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableDiscoveryClient
@EnableConfigServer
public class ConfigServerApplication {

	public static void main(String[] args) {

		new SpringApplicationBuilder(ConfigServerApplication.class)
				//类名重复bean的处理
				.beanNameGenerator(new DefaultBeanNameGenerator())
				.run(args);
	}
}
