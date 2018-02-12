package com.auguszero.C3P0Builder;

import java.sql.Connection;

/**
 * 连接池接口
 *
 * @author haisong
 * @create 2018/02/11 13:35
 */
public interface ConnImplPool {

    /**
     * 获取链接
     * @return
     */
    Connection getConnect();


}
