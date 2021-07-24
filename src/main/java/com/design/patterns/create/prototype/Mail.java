package com.design.patterns.create.prototype;

public class Mail implements Cloneable {

    /**
     * 邮件接收者
     */
    private String receiver;

    /**
     * 主题
     */
    private String subject;

    /**
     * 昵称
     */
    private String nickName;

    /**
     * 内容
     */
    private String context;

    /**
     * 结尾
     */
    private String tail;

    public Mail(AdvTemplate template) {
        this.context = template.getContext();
        this.subject = template.getSubject();
    }

    @Override
    public Mail clone() {
        Mail mail = null;
        try {
            mail = (Mail) super.clone();
        } catch (Exception e) {

        }
        return mail;
    }

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }

    public String getTail() {
        return tail;
    }

    public void setTail(String tail) {
        this.tail = tail;
    }
}
