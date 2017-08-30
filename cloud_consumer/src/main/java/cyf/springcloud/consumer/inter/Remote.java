package cyf.springcloud.consumer.inter;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

//name:远程服务名，及spring.application.name配置的名称
@FeignClient(name = "cloud-provider")
public interface Remote {

    //和远程服务中contoller中的方法名和参数需保持一致。
    @RequestMapping(value = "/provider/hello", method = RequestMethod.GET)
     String hello();

}
