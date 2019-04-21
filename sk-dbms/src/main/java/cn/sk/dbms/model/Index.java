package cn.sk.dbms.model;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

/**
 * 索引
 * @author Louis
 * @date Nov 10, 2018
 */
@Getter
@Setter
public class Index {
    
    /** 名称 */
    private String name;
    /** 所属类型 */
    private String indexType;
    /** 所属表名称 */
    private String tableName;
    /** 是否唯一索引 */
    private boolean unique;
    /** 字段列表 */
    private List<String> cloumns = new ArrayList();


    public void addCloumn(String cloumn) {
        this.cloumns.add(cloumn);
    }

}
