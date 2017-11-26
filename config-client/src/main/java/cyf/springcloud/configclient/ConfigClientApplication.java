package cyf.springcloud.configclient;

import org.springframework.beans.factory.support.DefaultBeanNameGenerator;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 上面这些与spring-cloud相关的属性必须配置在bootstrap.properties中，config部分内容才能被正确加载。
 * 因为config的相关配置会先于application.properties，而bootstrap.properties的加载也是先于application.properties
 */
@SpringBootApplication

@EnableDiscoveryClient
public class ConfigClientApplication {

    public static void main(String[] args) {

        new SpringApplicationBuilder(ConfigClientApplication.class)
                //类名重复bean的处理
                .beanNameGenerator(new DefaultBeanNameGenerator())
                .run(args);

    }
}
