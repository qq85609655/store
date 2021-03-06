package com.isell.bis.mail.controller;

import org.junit.Test;

import com.isell.bis.mail.vo.MailSenderInfo;
import com.isell.core.util.HttpUtils;
import com.isell.core.util.JsonUtil;

public class MailControllerTest {
    
    @Test
    public void testSendTextMail() {
        MailSenderInfo mailInfo = new MailSenderInfo();
        mailInfo.setMailServerHost("smtp.mxhichina.com");
        mailInfo.setMailServerPort("25");
        mailInfo.setValidate(true);
        mailInfo.setUserName("admin@i-coolshop.cn");
        mailInfo.setPassword("Abc12345");// 您的邮箱密码
        mailInfo.setFromAddress("admin@i-coolshop.cn");
        mailInfo.setToAddress("114046323@qq.com");
        mailInfo.setSubject("小酷儿商城商家注册");
        StringBuffer str = new StringBuffer();
        str.append("<p>亲爱的 lilin, </p>").append("<p>你好！</p>");
        mailInfo.setContent(str.toString());
        
        String result = HttpUtils.httpPost("http://localhost:8080/bis/mail/sendTextMail", JsonUtil.writeValueAsString(mailInfo));
        System.out.println("result=" + result);
    }
    
    @Test
    public void testSendHtmlMail() {
        MailSenderInfo mailInfo = new MailSenderInfo();
        mailInfo.setMailServerHost("smtp.mxhichina.com");
        mailInfo.setMailServerPort("25");
        mailInfo.setValidate(true);
        mailInfo.setUserName("admin@i-coolshop.cn");
        mailInfo.setPassword("Abc12345");// 您的邮箱密码
        mailInfo.setFromAddress("admin@i-coolshop.cn");
        mailInfo.setToAddress("114046323@qq.com");
        mailInfo.setSubject("小酷儿商城商家注册");
        StringBuffer str = new StringBuffer();
        str.append("<p>亲爱的 lilin, </p>").append("<p>你好！</p>");
        mailInfo.setContent(str.toString());
        
        String result = HttpUtils.httpPost("http://localhost:8080/bis/mail/sendHtmlMail", JsonUtil.writeValueAsString(mailInfo));
        System.out.println("result=" + result);
    }
    
}
