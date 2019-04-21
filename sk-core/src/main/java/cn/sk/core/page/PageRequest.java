package cn.sk.core.page;

import lombok.Getter;
import lombok.Setter;

import java.util.HashMap;
import java.util.Map;

/**
 * 分页请求
 * @author Louis
 * @date Aug 19, 2018
 */
@Getter
@Setter
public class PageRequest {
	/**
	 * 当前页码
	 */
	private int pageNum = 1;
	/**
	 * 每页数量
	 */
	private int pageSize = 10;
	/**
	 * 每页数量
	 */
	private Map<String, ColumnFilter> columnFilters = new HashMap<String, ColumnFilter>();
	
}
