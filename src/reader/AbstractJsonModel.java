package reader;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AbstractJsonModel {
	//code
	private String code;
	//msg
	private String msg;
	//time
	private Long time = new Date().getTime();
	
	StatusModel model;
	SingleObject singleObject;
	ArrayList<?>items;
	private String[] array;  
	
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public Long getTime() {
		return time;
	}
	public void setTime(Long time) {
		this.time = time;
	}
	public void setStatusModel(StatusModel object){
		this.model = object;
	}
	public StatusModel getsetStatusModel(){
		return this.model;
	}
//	public void setListObject(ListObject listObject) {
//		this.items = listObject.getItems();
//	}
	public void setItems(ArrayList<?> items) {
		this.items = items;
	}
	public ArrayList<?> getItems() {
		return items;
	}
	public void setArray(String[] array) {
		this.array = array;
	}
	public String[] getArray() {
		return array;
	}
}
