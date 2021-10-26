import java.text.DecimalFormat;

/**
 * Project name(项目名称)：作业_P83-2
 * Package(包名): PACKAGE_NAME
 * Class(类名): Clock
 * Author(作者）: mao
 * Author QQ：1296193245
 * Date(创建日期)： 2021/10/26
 * Time(创建时间)： 21:26
 * Version(版本): 1.0
 * Description(描述)： 无
 */

public class Clock
{
    private int hour;
    private int minute;
    private int second;

    public Clock()
    {

    }

    public Clock(int hour, int minute, int second)
    {
        if (hour >= 0 && hour <= 23)
        {
            this.hour = hour;
        }
        else if (hour < 0)
        {
            this.hour = 0;
        }
        else
        {
            this.hour = 23;
        }
        if (minute >= 0 && minute <= 59)
        {
            this.minute = minute;
        }
        else if (minute < 0)
        {
            this.minute = 0;
        }
        else
        {
            this.minute = 59;
        }
        if (second >= 0 && second <= 59)
        {
            this.second = second;
        }
        else if (second < 0)
        {
            this.second = 0;
        }
        else
        {
            this.second = 59;
        }
    }

    public int getHour()
    {
        return hour;
    }

    public void setHour(int hour)
    {
        if (hour >= 0 && hour <= 23)
        {
            this.hour = hour;
        }
        else if (hour < 0)
        {
            this.hour = 0;
        }
        else
        {
            this.hour = 23;
        }
    }

    public int getMinute()
    {
        return minute;
    }

    public void setMinute(int minute)
    {
        if (minute >= 0 && minute <= 59)
        {
            this.minute = minute;
        }
        else if (minute < 0)
        {
            this.minute = 0;
        }
        else
        {
            this.minute = 59;
        }
    }

    public int getSecond()
    {
        return second;
    }

    public void setSecond(int second)
    {
        if (second >= 0 && second <= 59)
        {
            this.second = second;
        }
        else if (second < 0)
        {
            this.second = 0;
        }
        else
        {
            this.second = 59;
        }
    }

    public void incSecond()
    {
        if (hour == 23 && minute == 59 && second == 59)
        {
            this.hour = 0;
            this.minute = 0;
            this.second = 0;
        }
        else if (minute == 59 && second == 59)
        {
            this.hour++;
            this.minute = 0;
            this.second = 0;
        }
        else if (second == 59)
        {
            this.minute++;
            this.second = 0;
        }
        else
        {
            this.second++;
        }
    }

    public String toString()
    {
        DecimalFormat decimalFormat = new DecimalFormat("00");
        return decimalFormat.format(this.getHour()) + ":" + decimalFormat.format(this.getMinute())
                + ":" + decimalFormat.format(this.getSecond());
    }
}
