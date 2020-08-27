/**
 * 
 */
package com.mindtree.BookManipulation.entities;

/**
 * @author M1057685
 *
 */
public class Book {
	private int isbnNum;
	private String bookName;
	private String author;

	/**
	 * @param isbnNum
	 * @param bookName
	 * @param author
	 */
	public Book(int isbnNum, String bookName, String author) {
		this.isbnNum = isbnNum;
		this.bookName = bookName;
		this.author = author;
	}

	/**
	 * 
	 */
	public Book() {
	}

	/**
	 * @return the isbnNum
	 */
	public int getIsbnNum() {
		return isbnNum;
	}

	/**
	 * @param isbnNum the isbnNum to set
	 */
	public void setIsbnNum(int isbnNum) {
		this.isbnNum = isbnNum;
	}

	/**
	 * @return the bookName
	 */
	public String getBookName() {
		return bookName;
	}

	/**
	 * @param bookName the bookName to set
	 */
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	/**
	 * @return the author
	 */
	public String getAuthor() {
		return author;
	}

	/**
	 * @param author the author to set
	 */
	public void setAuthor(String author) {
		this.author = author;
	}

}
