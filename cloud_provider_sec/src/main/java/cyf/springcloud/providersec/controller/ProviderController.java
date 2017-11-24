package cyf.springcloud.providersec.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Cheng Yufei
 * @create 2017-08-29 18:02
 **/
@RestController
@RequestMapping("/provider")
public class ProviderController {

    @RequestMapping(value = "/hello/{name}",method = RequestMethod.GET)
    public String hello(@PathVariable(value = "name") String name){
        System.out.println();
        return "this is second provider " + name;
    }


}
