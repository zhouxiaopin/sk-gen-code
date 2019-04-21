package cn.sk.skgen.vo;

import cn.sk.dbms.vo.ConnParam;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;


/**
 * 代码生成数据模型
 * @author Louis
 * @date Nov 10, 2018
 */
@Getter
@Setter
public class GenerateModel {

	private String outPutFolderPath;
	private String basePackage = "com.louis.output";
	private ConnParam connParam;
	private List<TableModel> tableModels = new ArrayList<>();
}
