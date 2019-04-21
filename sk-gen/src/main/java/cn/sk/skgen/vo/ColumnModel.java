package cn.sk.skgen.vo;

import lombok.Getter;
import lombok.Setter;

/**
 * 代码生成模型-字段
 * @author Louis
 * @date Nov 10, 2018
 */
@Getter
@Setter
public class ColumnModel {

	/** 属性名 */
	private String fieldName;
	/** Java类型 */
	private String javaType;
	/** jdbc类型 */
	private String jdbcType;
	/** 是否主键 */
	private boolean isPrimaryKey;
	/** getter名称 */
	private String getter;
	/** setter名称 */
	private String setter;

	/** 字段名 */
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
