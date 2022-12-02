package com.lee.frame.openapi;

import com.lee.frame.core.Executor;
import com.lee.frame.core.entity.Configuration;

import java.util.List;

public class SqlSessionImpl implements SqlSession {
    //每次Sql会话连接，必须要有数据库配置信息
    private Configuration configuration;
    public SqlSessionImpl(Configuration configuration) {
        super();
    }

    public <T> List<T> selectList(String statement) throws Exception {
        Executor executor=new Executor(configuration);
        return executor.executeQuery(statement);
    }
}
