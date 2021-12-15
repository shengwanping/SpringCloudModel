// This file is auto-generated, don't edit it. Thanks.
package com.example.demo.controller;

import com.aliyun.dysmsapi20170525.Client;
import com.aliyun.tea.*;
import com.aliyun.dysmsapi20170525.*;
import com.aliyun.dysmsapi20170525.models.*;
import com.aliyun.teaopenapi.*;
import com.aliyun.teaopenapi.models.*;

import java.util.Arrays;
import java.util.List;

public class Sample {

    /**
     * 使用AK&SK初始化账号Client
     * @param accessKeyId
     * @param accessKeySecret
     * @return Client
     * @throws Exception
     */
    public static Client createClient(String accessKeyId, String accessKeySecret) throws Exception {
        Config config = new Config()
                // 您的AccessKey ID
                .setAccessKeyId(accessKeyId)
                // 您的AccessKey Secret
                .setAccessKeySecret(accessKeySecret);
        // 访问的域名
        config.endpoint = "dysmsapi.aliyuncs.com";
        return new Client(config);
    }

    public static void main(String[] args_) throws Exception {
        List<String> args = Arrays.asList(args_);
        Client client = Sample.createClient("LTAI5tH6CRYPGbbk7zsnob62", "G6w1n3cnDE0Qvv4IdJHnofnIlXgPMu");
        SendSmsRequest sendSmsRequest = new SendSmsRequest()
                .setPhoneNumbers("17784340244")
                .setSignName("[测试专用]阿里云通信")
                .setTemplateCode("0")
                .setTemplateParam("[测试专用]阿里云通信测试模版");
        // 复制代码运行请自行打印 API 的返回值
        SendSmsResponse sendSmsResponse = client.sendSms(sendSmsRequest);
        System.out.println(sendSmsResponse);
        System.out.println(sendSmsResponse.getHeaders());
        System.out.println(sendSmsResponse.getBody().getRequestId());
        System.out.println(sendSmsResponse.getBody().getCode());
        System.out.println(sendSmsResponse.getBody().getMessage());
    }
}
