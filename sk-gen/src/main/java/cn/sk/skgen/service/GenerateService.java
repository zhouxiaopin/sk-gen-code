package cn.sk.skgen.service;

import cn.sk.dbms.model.Table;
import cn.sk.dbms.vo.ConnParam;
import cn.sk.skgen.vo.GenerateModel;

import java.io.IOException;
import java.util.List;



/**
 * 代码生成服务
 * @author Louis
 * @date Nov 9, 2018
 */
public interface GenerateService {

	/**
	 * 是否可以连接
	 * @param connParam
	 * @return
	 */
	public boolean testConnection(ConnParam connParam);

	/**
	 * 反向查找数据表
	 * @param connParam
	 * @return
	 */
	public List<Table> getTables(ConnParam connParam);

	/**
	 * 获取代码生成数据模型
	 * @return
	 */
	public GenerateModel getGenerateModel(GenerateModel generateModel);

	/**
	 * 生成代码文件
	 * @param generateModel
	 * @return
	 * @throws IOException 
	 */
	public boolean generateModels(GenerateModel generateModel) throws Exception;


}
