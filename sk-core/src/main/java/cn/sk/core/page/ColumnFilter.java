package cn.sk.core.page;


import lombok.Getter;
import lombok.Setter;

/**
 * 分页查询列过滤器
 * @author Louis
 * @date Aug 19, 2018
 */
@Getter
@Setter
public class ColumnFilter {

	/**
	 * 过滤列名
	 */
	private String name;
	/**
	 * 查询的值
	 */
	private String value;

	
}
