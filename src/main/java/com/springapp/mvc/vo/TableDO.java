package com.springapp.mvc.vo;

import java.util.List;

/**
 * 表数据
 * 
 */
public class TableDO {
	//表的名称
	private String tableName;
	//表的备注
	private String comments;
	//表的主键
	private ColumnDO pk;
	//表的列名(不包含主键)
	private List<ColumnDO> columns;
	
	//类名(第一个字母大写)
	private String className;
	//类名(第一个字母小写)
	private String classname;
	
	public String getTableName() {
		return tableName;
	}
	public void setTableName(String tableName) {
		this.tableName = tableName;
	}
	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}
	public ColumnDO getPk() {
		return pk;
	}
	public void setPk(ColumnDO pk) {
		this.pk = pk;
	}
	public List<ColumnDO> getColumns() {
		return columns;
	}
	public void setColumns(List<ColumnDO> columns) {
		this.columns = columns;
	}
	public String getClassName() {
		return className;
	}
	public void setClassName(String className) {
		this.className = className;
	}
	public String getClassname() {
		return classname;
	}
	public void setClassname(String classname) {
		this.classname = classname;
	}
}
