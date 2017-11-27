package cyf.springcloud.zuul.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Configuration;

import javax.servlet.http.HttpServletRequest;

/**
 * @author Cheng Yufei
 * @create 2017-11-27 14:56
 **/
@Configuration
@Slf4j
public class MyFilter extends ZuulFilter {
    @Override
    public String filterType() {
        return "pre";
    }

    @Override
    public int filterOrder() {
        return 0;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() {
        RequestContext context = RequestContext.getCurrentContext();
        HttpServletRequest request = context.getRequest();
        log.info(String.format("%s >>>>> %s", request.getMethod(), request.getRequestURL().toString()));
        String test = request.getParameter("test");
        if (null == test) {
            log.warn("test is empty");
            context.setSendZuulResponse(false);
            context.setResponseStatusCode(401);
            try {
                context.getResponse().getWriter().write("test is empty");
            } catch (Exception e) {
                log.error(e.getLocalizedMessage());
            }
            return null;
        }
        log.info("ok");
        return null;

    }

}
