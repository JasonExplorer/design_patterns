package com.design.patterns.create.prototype;

public class Client {
    private static int MAX_COUNT = 6;

    public static void main(String[] args) {
        int i= 0;
        Mail mail = new Mail(new AdvTemplate());
        mail.setTail("xxx 银行版权所有.");
        while (i < MAX_COUNT) {
            Mail mail1 = mail.clone();
            mail1.setNickName("xxx先生您好!");
            mail1.setReceiver("xxx");
            // 发送邮件
            i++;
        }
    }
}
