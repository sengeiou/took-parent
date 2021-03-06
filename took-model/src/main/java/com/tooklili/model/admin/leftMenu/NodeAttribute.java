package com.tooklili.model.admin.leftMenu;

/**
 * 菜单节点自定义属性
 * @author shuai.ding
 * @date 2017年8月26日下午5:41:51
 */
public class NodeAttribute {
	/**
	 * url地址
	 */
	private String url;
	
	/**
	 * 父节点id
	 */
	private Long parentid;
	
	/**
	 * 序号
	 */
	private Integer sortnum;
	
	/**
	 * 是否是叶子节点
	 */
	private Boolean isLeaf;
	
	/**
	 * 角色绑定菜单对应的id
	 */
	private Long roleMenuId;

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public Long getParentid() {
		return parentid;
	}

	public void setParentid(Long parentid) {
		this.parentid = parentid;
	}

	public Integer getSortnum() {
		return sortnum;
	}

	public void setSortnum(Integer sortnum) {
		this.sortnum = sortnum;
	}

	public Boolean getIsLeaf() {
		return isLeaf;
	}

	public void setIsLeaf(Boolean isLeaf) {
		this.isLeaf = isLeaf;
	}

	public Long getRoleMenuId() {
		return roleMenuId;
	}

	public void setRoleMenuId(Long roleMenuId) {
		this.roleMenuId = roleMenuId;
	}
}
