package cn.sk.dbms.model;

import lombok.Getter;
import lombok.Setter;

/**
 * 外键
 * @author Louis
 * @date Nov 10, 2018
 */
@Getter
@Setter
public class ForeignKey {

    private String fkName;
    
    private String pkTableName;
    
    private String pkColumnName;
    
    private String fkTableName;
    
    private String fkColumnName;


}
