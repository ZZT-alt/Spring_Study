package com.ZZT.converter;

import org.springframework.core.convert.converter.Converter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class DateConverter implements Converter<String, Date> {
    @Override
    public Date convert(String source) {
        //将日期的字符串转换成日期对象返回
        SimpleDateFormat dateFormat=new SimpleDateFormat("yyyy-MM-dd");
        try {
            return dateFormat.parse(source);
        }
        catch (ParseException e) {
            e.printStackTrace();
        }
        return null;
    }
}
