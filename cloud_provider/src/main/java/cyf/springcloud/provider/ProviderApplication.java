package cyf.springcloud.provider;

import org.springframework.beans.factory.support.DefaultBeanNameGenerator;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication(scanBasePackages = {"cyf.springcloud.provider"})
@EnableDiscoveryClient
public class ProviderApplication {

    public static void main(String[] args) {

        new SpringApplicationBuilder(ProviderApplication.class)
                //类名重复bean的处理
                .beanNameGenerator(new DefaultBeanNameGenerator())
                .run(args);

    }
}
