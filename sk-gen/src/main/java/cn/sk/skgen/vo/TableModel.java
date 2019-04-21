package cn.sk.skgen.vo;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

/**
 * 代码生成模型-表
 * @author Louis
 * @date Nov 10, 2018
 */
@Getter
@Setter
public class TableModel {

	/** Model包名 */
	private String modelPackageName;
	/** Dao包名 */
	private String daoPackageName;
	/** SqlMap xml包名 */
	private String sqlMapPackageName;
	/** Servcie包名 */
	private String servicePackageName;
	/** ServcieImpl包名 */
	private String serviceImplPackageName;
	/** Controller包名 */
	private String controllerPackageName;
	/** View目录名 */
	private String viewPackageName;
	/** 类名 */
	private String className;
	/** 实例名 */
	private String objectName;
	/** 主键列 */
	private ColumnModel primaryKey;
	
    /** 表名 */
    private String name;
    /** 描述 */
    private String description;
    /** 表空间 */
    private String tablespace;
    /** 索引字段列表 */
    private List<ColumnModel> columns = new ArrayList();

    public void addColumn(ColumnModel clolumn) {
        this.columns.add(clolumn);
    }

}
