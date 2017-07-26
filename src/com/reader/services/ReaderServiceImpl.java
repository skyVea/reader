package com.reader.services;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import com.reader.vo.Book;
import com.reader.vo.Catagory;
import com.reader.vo.Chapter;

public class ReaderServiceImpl implements ReaderService{

	@Override
	public Collection<Catagory> getCatagory() {
		// TODO Auto-generated method stub
		Collection<Catagory> collection = new <Catagory>ArrayList();
		for (int i = 0; i < 3; i++) {
			
		}
		return null;
	}

	@Override
	public Collection<Book> getBookListByCatagoryId(String catagoryid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Book getBookById(String bookid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Chapter getChapterById(String bookid, String chapterid) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
