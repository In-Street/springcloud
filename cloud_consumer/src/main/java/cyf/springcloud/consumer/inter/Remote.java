package cyf.springcloud.consumer.inter;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

//name:远程服务名，及spring.application.name配置的名称
//fallback : 熔断器回调类 当请求后端服务出现异常的时候, 可以使用fallback方法返回的值. fallback方法的返回值一般是设置的默认值或者来自缓存.

@FeignClient(name = "cloud-provider",fallback = RemoteHystrix.class)
public interface Remote {

    //和远程服务中contoller中的方法名和参数需保持一致。
    @RequestMapping(value = "/provider/hello/{name}", method = RequestMethod.GET)
    String hello(@PathVariable(value = "name") String name);

}
