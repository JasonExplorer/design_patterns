package com.design.patterns.create.builder;
import cn.hutool.core.thread.ExecutorBuilder;
import cn.hutool.core.thread.ThreadFactoryBuilder;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;


public class ThreadPoolBuilder {

    public ExecutorService buildTaskPool () {
        ThreadPoolExecutor executor = ExecutorBuilder.create()
                .setCorePoolSize(5)
                .setMaxPoolSize(5<<1)
                .setWorkQueue(new LinkedBlockingDeque<>(50))
                .setKeepAliveTime(30, TimeUnit.SECONDS)
                .setHandler(new ThreadPoolExecutor.AbortPolicy())
                .setThreadFactory(ThreadFactoryBuilder.create().setNamePrefix("xxx-task").build())
                .build();
        return  executor;
    }
}
