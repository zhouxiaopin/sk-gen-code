package cn.sk.dbms.model;

import lombok.Getter;
import lombok.Setter;

/**
 * 主键
 * @author Louis
 * @date Nov 10, 2018
 */
@Getter
@Setter
public class PrimaryKey {

    /** 名称 */
    private String name;
    /** 所属表名称 */
    private String tableName;
    /** 字段 */
    private String cloumn;

}
