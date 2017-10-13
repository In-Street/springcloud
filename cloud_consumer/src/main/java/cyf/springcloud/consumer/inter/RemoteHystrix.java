package cyf.springcloud.consumer.inter;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * Hystrix
 *
 *  一旦后端服务不可用, 断路器会直接切断请求链, 避免发送大量无效请求影响系统吞吐量
 *
 * @author Cheng Yufei
 * @create 2017-09-01 11:34
 **/
@Component
public class RemoteHystrix implements Remote{
    @Override
    public String hello(@PathVariable(value = "name") String name) {
        return "message file  "+name;
    }
}
