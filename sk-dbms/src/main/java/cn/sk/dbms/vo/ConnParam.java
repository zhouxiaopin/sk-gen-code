package cn.sk.dbms.vo;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

/**
 * 数据库连接参数封装
 * @author Louis
 * @date Nov 10, 2018
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ConnParam implements Serializable {

	private static final long serialVersionUID = 1L;
	
	/**
     * 数据库类型
     */
    private String dbType;
    /**
     * 数据库地址
     */
    private String host;
    /**
     * 数据库端口
     */
    private int port;
    /**
     * 数据库实例名
     */
    private String dbName;
    /**
     * 用户名
     */
    private String userName;
    /**
     * 密码
     */
    private String password;


}