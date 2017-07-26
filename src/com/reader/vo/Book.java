package com.reader.vo;

public class Book {
	private String bookId;
	private String bookDecsription;
	private String imgUrl;
	private long chapterTotal;
	public String getBookId() {
		return bookId;
	}
	public void setBookId(String bookId) {
		this.bookId = bookId;
	}
	public String getBookDecsription() {
		return bookDecsription;
	}
	public void setBookDecsription(String bookDecsription) {
		this.bookDecsription = bookDecsription;
	}
	public String getImgUrl() {
		return imgUrl;
	}
	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}
	public long getChapterTotal() {
		return chapterTotal;
	}
	public void setChapterTotal(long chapterTotal) {
		this.chapterTotal = chapterTotal;
	}
	
	
}
