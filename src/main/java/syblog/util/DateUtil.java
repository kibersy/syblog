package syblog.util;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @author kibersy
 * @date 2019/3/9 17:42
 */
public class DateUtil {

    /**
     * 获得当前系统时间
     *
     * @returnType Date
     */
   public static Date getSystemTime(){
       return Calendar.getInstance().getTime();
   }

    /**
     * 获得当前系统时间
     * @param format time
     * @returnType Stirng
     */
    public static String getSystemTime(String format){

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(format);
        return simpleDateFormat.format(getSystemTime());
    }
}
