package com.reader.ctroller;

import java.io.IOException;
import java.util.Collection;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.core.Response;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.reader.services.ReaderServiceImpl;
import com.reader.util.JsonUtils;
import com.reader.vo.Catagory;

@WebServlet("/test")
public class WSDataController extends BaseServlet{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		ReaderServiceImpl readerServiceImpl = new ReaderServiceImpl();
		resp.getWriter().write(JsonUtils.toJson(readerServiceImpl.getCatagory()));
	}
	
}
