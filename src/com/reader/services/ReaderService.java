package com.reader.services;

import java.io.ObjectInputStream.GetField;
import java.util.Collection;

import com.reader.vo.Book;
import com.reader.vo.Catagory;
import com.reader.vo.Chapter;


public interface ReaderService {
	//获取所有书籍类型
	public Collection<Catagory> getCatagory();
	//获取指定类型下的书籍列表
	public Collection<Book> getBookListByCatagoryId(String catagoryid);
	//获取某一书籍详情 
	public Book getBookById(String bookid);
	//获取某一章节内容 
	public Chapter getChapterById(String bookid, String chapterid);
}
