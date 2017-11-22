package cyf.springcloud.consumersec.controller;

import cyf.springcloud.consumersec.inter.RemoteSec;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * consumer
 *
 * @author Cheng Yufei
 * @create 2017-08-25 15:24
 **/
@RestController
@RequestMapping("/consumersec")
public class ConsumerSecController {

    @Autowired
    RemoteSec remote;

    @RequestMapping("/oneConsumer/{name}")
    public String oneConsumer(@PathVariable(value = "name") String name) {
        System.out.println();
        return remote.hello(name);
    }
}
