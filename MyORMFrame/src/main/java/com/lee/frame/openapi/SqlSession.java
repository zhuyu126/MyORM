package com.lee.frame.openapi;

import java.util.List;

/**
 *对外暴露SqlSession接口 接口中定义常见的JDBC操作：增删改查
 */
public interface SqlSession {
    /**
     * 查询所有用户
     * @param sql sql
     * @param <T> 范型
     * @return 结果
     * @throws Exception
     */
    <T> List<T> selectList(String sql) throws Exception;
}
