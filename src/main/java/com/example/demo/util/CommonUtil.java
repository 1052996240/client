package com.example.demo.util;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * Created by admin on 2020/5/21.
 */
public class CommonUtil {
    /**
     * 获取当前日期
     * @return
     */
    public static String getNowData() {
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
        String format = df.format(new Date());
        return format;
    }

    /**
     *毫秒级转换成日期
     * @param sd
     * @return
     */
    public static String getZhuanHuanData(Long sd) {
        Date dat = new Date(sd);
        GregorianCalendar gc = new GregorianCalendar();
        gc.setTime(dat);
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        String sb = format.format(gc.getTime());
        return sb;
    }
}
