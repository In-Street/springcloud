package cyf.springcloud.zipkin;

import org.springframework.beans.factory.support.DefaultBeanNameGenerator;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.Bean;
import zipkin.server.EnableZipkinServer;
import zipkin.storage.mysql.MySQLStorage;

import javax.sql.DataSource;


/**
 */
@SpringBootApplication
@EnableZipkinServer
public class ZipkinServerApplication {

    @Bean
    public MySQLStorage mySQLStorage(DataSource datasource) {
        return MySQLStorage.builder().datasource(datasource).executor(Runnable::run).build();
    }

    public static void main(String[] args) {

        new SpringApplicationBuilder(ZipkinServerApplication.class)
                //类名重复bean的处理
                .beanNameGenerator(new DefaultBeanNameGenerator())
                .run(args);

    }
}
