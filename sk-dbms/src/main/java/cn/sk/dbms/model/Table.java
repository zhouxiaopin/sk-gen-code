package cn.sk.dbms.model;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

/**
 * 数据表
 * @author Louis
 * @date Nov 10, 2018
 */
@Getter
@Setter
public class Table {

    /** 名称 */
    private String name;
    /** 描述 */
    private String description;
    /** 表空间 */
    private String tablespace;
    /** 索引字段列表 */
    private List<Column> columns = new ArrayList();

    public void addColumn(Column clolumn) {
        this.columns.add(clolumn);
    }

}
