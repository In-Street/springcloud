package cyf.springcloud.providersec;

import org.springframework.beans.factory.support.DefaultBeanNameGenerator;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication(scanBasePackages = {"cyf.springcloud.providersec"})
@EnableDiscoveryClient
public class ProviderSecApplication {

	public static void main(String[] args) {

		new SpringApplicationBuilder(ProviderSecApplication.class)
				//类名重复bean的处理
				.beanNameGenerator(new DefaultBeanNameGenerator())
				.run(args);
	}
}
