package com.reader.ctroller;

import java.util.Collection;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.reader.services.ReaderServiceImpl;
import com.reader.util.JsonUtils;
import com.reader.vo.Catagory;

@Controller
public class DataController extends BaseServlet{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@RequestMapping(value = "/bookcatagory", method = RequestMethod.GET, produces="application/json")
	public Collection<Catagory> getBookCatagory(){
		ReaderServiceImpl readerServiceImpl = new ReaderServiceImpl();
//		return JsonUtils.toJson(readerServiceImpl.getCatagory());
		return readerServiceImpl.getCatagory();
	}
	
}
