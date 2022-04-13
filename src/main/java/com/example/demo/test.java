package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.mail.javamail.MimeMessageHelper;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

public class test {
//    @Autowired
//    JavaMailSenderImpl mail;
//    @Test
//    void contextLoads() {
//        SimpleMailMessage simpleMailMessage = new SimpleMailMessage();
//        simpleMailMessage.setSubject("你好啊");
//        simpleMailMessage.setText("你最好了");
//        simpleMailMessage.setTo("2381611961@qq.com");
//        simpleMailMessage.setFrom("1827279552@qq.com");
//        mail.send(simpleMailMessage);
//
//    }
//    @Test
//    void maill() throws MessagingException {
//        MimeMessage mimeMessage = mail.createMimeMessage();
//        MimeMessageHelper helper = new MimeMessageHelper(mimeMessage);
//        //正文
//        helper.setSubject("你好");
//        helper.setText("<h1>爱你么么哒</h1>",true);
//        //附件
//        //helper.addAttachment("1.jpg",new File("c/"));
//
//
//        helper.setTo("2381611961@qq.com");
//        helper.setFrom("1827279552@qq.com");
//        mail.send(mimeMessage);
//    }
}
