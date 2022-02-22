package t1;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

/**
 * Project name(项目名称)：Spring_Bean生命周期
 * Package(包名): t1
 * Class(类名): LifeCycleBean
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/2/22
 * Time(创建时间)： 19:28
 * Version(版本): 1.0
 * Description(描述)： 无
 */

public class LifeCycleBean implements InitializingBean, DisposableBean
{
    private static final Log LOGGER = LogFactory.getLog(LifeCycleBean.class);
    //网站名称
    private String webName;
    //网站地址
    private String url;

    public void setWebName(String webName)
    {
        this.webName = webName;
    }

    public void setUrl(String url)
    {
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
     * 初始化回调逻辑
     */
    @Override
    public void afterPropertiesSet() throws Exception
    {
        LOGGER.info(" 调用接口：InitializingBean，方法：afterPropertiesSet，无参数");
    }

    /**
     * 销毁回调逻辑
     */
    @Override
    public void destroy() throws Exception
    {
        LOGGER.info(" 调用接口：DisposableBean，方法：destroy，无参数");
    }

}
