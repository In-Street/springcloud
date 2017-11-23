package cyf.springcloud.configclientsec.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Cheng Yufei
 * @create 2017-10-14 16:28
 **/
@RestController
/**
 * SpringCloud配置中心配置刷新的时候，自动将新的配置更新到该类对应的字段中，需以 post方式访问 ： localhost:8050/refresh，这样在不重新启动客户端的情况下可以获取到新的配置信息
 * 本地测试进行将 localhost：端口 进行映射 ， http://c3dc681b.ngrok.io/refresh
 */
@RefreshScope
public class HeolloSecController {

    @Value("${neo.hello}")
    private String hello;

    @RequestMapping("/helloSec")
    public String from() {
        return this.hello;
    }
}
