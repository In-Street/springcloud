package cyf.springcloud.turbine;

import org.springframework.beans.factory.support.DefaultBeanNameGenerator;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.turbine.EnableTurbine;

/**
 *   turbine 是汇聚信息，然后将信息传入 hystrix 形成图形监控，
 *   在hystrix中： 写入 http://localhost:8001/turbine.stream 进行monitor ，监控之前要访问一次监控的consumer
 */

@SpringBootApplication
@EnableDiscoveryClient
@EnableTurbine
public class TurbineApplication {

	public static void main(String[] args) {

		new SpringApplicationBuilder(TurbineApplication.class)
				//类名重复bean的处理
				.beanNameGenerator(new DefaultBeanNameGenerator())
				.run(args);
	}
}
