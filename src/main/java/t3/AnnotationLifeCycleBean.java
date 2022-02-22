package t3;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * Project name(项目名称)：Spring_Bean生命周期
 * Package(包名): t3
 * Class(类名): AnnotationLifeCycleBean
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/2/22
 * Time(创建时间)： 19:38
 * Version(版本): 1.0
 * Description(描述)： 无
 */

public class AnnotationLifeCycleBean
{
    private static final Log LOGGER = LogFactory.getLog(AnnotationLifeCycleBean.class);
    //网站名称
    private String webName;
    //网站地址
    private String url;

    public AnnotationLifeCycleBean(String webName, String url)
    {
        this.webName = webName;
        this.url = url;
    }

    @Override
    @SuppressWarnings("all")
    public String toString()
    {
        final StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("webName：").append(webName).append('\n');
        stringbuilder.append("url：").append(url).append('\n');
        return stringbuilder.toString();
    }

    /**
     * 初始化回调方法
     */
    @PostConstruct
    public void init()
    {
        LOGGER.info("通过 @PostConstruct 注解，指定初始化方法：init() 方法");
    }

    /**
     * 销毁回调方法
     */
    @PreDestroy
    public void destroy()
    {
        LOGGER.info("通过 @PreDestroy 注解，指定初始化方法：destroy() 方法");
    }
}
