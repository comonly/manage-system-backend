package cn.comonly.utils;

import java.util.List;

public class ResponseDataList {
	private Integer total;
	private List items;

	public ResponseDataList(Integer total, List items){
		this.total = total;
		this.items = items;
	}

	public Integer getTotal() {
		return total;
	}

	public void setTotal(Integer total) {
		this.total = total;
	}

	public List getItems() {
		return items;
	}

	public void setItems(List items) {
		this.items = items;
	}
	
	
}
