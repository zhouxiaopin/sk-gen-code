package cn.sk.dbms.model;

import lombok.Getter;
import lombok.Setter;

/**
 * 存储过程
 * @author Louis
 * @date Nov 10, 2018
 */
@Getter
@Setter
public class Procedure {
    
    /** 名称 */
    private String name;
    
    /** 描述 */
    private String description;
    
    /** 内容定义 */
    private String definition;

}
