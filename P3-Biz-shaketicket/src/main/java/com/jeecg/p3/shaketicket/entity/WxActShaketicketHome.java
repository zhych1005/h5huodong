package com.jeecg.p3.shaketicket.entity;

import java.util.List;

import org.jeecgframework.p3.core.utils.persistence.Entity;

/**
 * 描述：</b>WxActShaketicketHome:九宫格活动表<br>
 * @author pituo
 * @since：2015年12月22日 19时03分50秒 星期二 
 * @version:1.0
 */
public class WxActShaketicketHome implements Entity<String> {
	private static final long serialVersionUID = 1L;
	
	public String getTemplate() {
		return template;
	}
	public void setTemplate(String template) {
		this.template = template;
	}
	public Integer getCount() {
	public String getJwidName() {
		return jwidName;
	}
	public void setJwidName(String jwidName) {
		this.jwidName = jwidName;
	}
	
	private List<WxActShaketicketConfig> awarsList;
	public List<WxActShaketicketConfig> getAwarsList() {
		return awarsList;
	}
	public void setAwarsList(List<WxActShaketicketConfig> awarsList) {
		this.awarsList = awarsList;
	}

	
}
