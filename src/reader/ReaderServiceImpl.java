package reader;

import java.util.ArrayList;
import java.util.List;

import javax.rmi.CORBA.Util;

public class ReaderServiceImpl implements ReaderService {
	

	@Override
	public String getAllSections() {
		// TODO Auto-generated method stub
		//从数据库获取数据
		
		//装配json对象
		AbstractJsonModel model= new AbstractJsonModel();
		StatusModel statusModel = new StatusModel();
		statusModel.setCode("100");
		statusModel.setMsg("gggg");
		model.setCode("201");
		model.setMsg("成功");
		ListObject listObject = new ListObject();
		ArrayList<String> items = new ArrayList<>();
		items.add("java01");
		items.add("java02");
		listObject.setItems(items);
		model.setStatusModel(statusModel);
		model.setItems(items);
		model.setTime(System.currentTimeMillis());
		 String[] score={"80","90","95"};  
	        model.setArray(score); 
		System.out.println(JsonUtils.toJson(model));
//		System.out.println(JsonUtils.toJson(items));
		return JsonUtils.toJson(model);
	}
	

}
