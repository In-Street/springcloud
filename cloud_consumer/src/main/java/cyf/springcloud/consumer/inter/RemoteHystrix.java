package cyf.springcloud.consumer.inter;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * Hystrix
 *
 * @author Cheng Yufei
 * @create 2017-09-01 11:34
 **/
@Component
public class RemoteHystrix implements Remote{
    @Override
    public String hello(@PathVariable(value = "name") String name) {
        return "message file"+name;
    }
}
