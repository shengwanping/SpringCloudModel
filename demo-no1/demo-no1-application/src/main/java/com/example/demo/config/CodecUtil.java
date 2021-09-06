package com.example.demo.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.StringUtils;

import java.net.URLDecoder;
import java.net.URLEncoder;

public class CodecUtil {
    private static final Logger log = LoggerFactory.getLogger(CodecUtil.class);

    public CodecUtil() {
    }

    public static String encode(String str, String enc) {
        if (!StringUtils.isEmpty(str) && !StringUtils.isEmpty(enc)) {
            try {
                return URLEncoder.encode(str, enc);
            } catch (Exception var3) {
                log.error("编码失败,编码数据为{}", str, var3);
                return str;
            }
        } else {
            return str;
        }
    }

    public static String encode(String str) {
        return encode(str, "utf-8");
    }

    public static String decode(String str, String enc) {
        if (!StringUtils.isEmpty(str) && !StringUtils.isEmpty(enc)) {
            try {
                return URLDecoder.decode(str, enc);
            } catch (Exception var3) {
                log.error("解码失败,解码数据为{}", str, var3);
                return str;
            }
        } else {
            return str;
        }
    }

    public static String decode(String str) {
        return decode(str, "utf-8");
    }
}
