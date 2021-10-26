import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Calendar;

/**
 * Project name(项目名称)：作业_P83-2
 * Package(包名): PACKAGE_NAME
 * Class(类名): test
 * Author(作者）: mao
 * Author QQ：1296193245
 * Date(创建日期)： 2021/10/26
 * Time(创建时间)： 21:38
 * Version(版本): 1.0
 * Description(描述)： 无
 */

public class test
{
    public void testOverLoad(int i)
    {
        System.out.println("int");
    }

    public void testOverLoad(String i)
    {
        System.out.println("String");
    }

    public static void main(String[] args)
    {
        Clock c = new Clock();
        System.out.println(c);
        c.setHour(12);
        c.setMinute(59);
        c.setSecond(69);
        System.out.println(c);
        c.incSecond();
        System.out.println(c);
        test t = new test();
        char x = 'x';
        t.testOverLoad(x);


        Calendar calendar = Calendar.getInstance();// 获取当前时间
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH);
        month = month + 1;                         //月份从 0 开始，所以加 1
        int day = calendar.get(Calendar.DATE);
        int week = calendar.get(Calendar.DAY_OF_WEEK);
        week = week - 1;                             //星期日为第一天
        int hour = calendar.get(Calendar.HOUR_OF_DAY); //时
        int minute = calendar.get(Calendar.MINUTE);   //分
        int second = calendar.get(Calendar.SECOND);   //秒
        int millisecond = calendar.get(Calendar.MILLISECOND); //毫秒
        int dayOfMonth = calendar.get(Calendar.DAY_OF_MONTH); // 获取今天是本月第几天
        int dayOfWeekInMonth = calendar.get(Calendar.DAY_OF_WEEK_IN_MONTH); // 获取今天是本月第几周
        int many = calendar.get(Calendar.DAY_OF_YEAR); // 获取今天是今年第几天
        c.setHour(hour);
        c.setMinute(minute);
        c.setSecond(second);

        try
        {
            while (true)
            {
                c.incSecond();
                System.out.println(c);
                Thread.sleep(250);
            }
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }

    }
}
