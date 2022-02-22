package t1;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Project name(项目名称)：Spring_Bean生命周期
 * Package(包名): t1
 * Class(类名): test
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/2/22
 * Time(创建时间)： 19:31
 * Version(版本): 1.0
 * Description(描述)： 无
 */

public class test
{
    private static final Log LOGGER = LogFactory.getLog(test.class);

    public static void main(String[] args)
    {
        //获取 ClassPathXmlApplicationContext 容器
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        LifeCycleBean lifeCycleBean = context.getBean("lifeCycleBean", LifeCycleBean.class);
        LOGGER.info(lifeCycleBean);
        //手动销毁 Bean
        context.close();
    }
}
