package t2;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Project name(项目名称)：Spring_Bean生命周期
 * Package(包名): t2
 * Class(类名): XMLLifeCycleBean
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/2/22
 * Time(创建时间)： 19:34
 * Version(版本): 1.0
 * Description(描述)： 无
 */

public class XMLLifeCycleBean
{
    private static final Log LOGGER = LogFactory.getLog(XMLLifeCycleBean.class);
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
     * 初始化回调方法
     */
    public void init()
    {
        LOGGER.info("在 XML 配置中通过 init-method 属性指定初始化方法：init() 方法");
    }

    /**
     * 销毁回调方法
     */
    public void destroy()
    {
        LOGGER.info("在 XML 配置中通过 destroy-method 属性指定回调方法：destroy() 方法");
    }
}
