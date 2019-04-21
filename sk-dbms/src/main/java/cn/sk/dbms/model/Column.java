package cn.sk.dbms.model;

import lombok.Getter;
import lombok.Setter;

/**
 * 字段
 * @author Louis
 * @date Nov 10, 2018
 */
@Getter
@Setter
public class Column {

    /** 名称 */
    private String name;
    /** 表名称 */
    private String tableName;
    /** 数据类型 */
    private String dataType;
    /** 是否可空 */
    private boolean isNullable;
    /** 默认值 */
    private String defaultValue;
    /** 长度 */
    private String length;
    /** 小数位 */
    private String precision;
    /** 描述 */
    private String description;


}

