package com.bjpowernode.crm.commons.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

/*
    对Date类型数据处理
 */
public class DateUtils {
    //静态：不用创建对象就可以调用
    public static String formateDateTime(Date date){
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String dateStr=sdf.format(new Date());
        return dateStr;
    }
}
