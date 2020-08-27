/**
 * 
 */
package com.mindtree.BookManipulation.service;

import java.util.ArrayList;

import com.mindtree.BookManipulation.entities.Book;

/**
 * @author M1057685
 *
 */
public interface BookService {
	/**
	 * @param book
	 */
	public void addBook(Book book);

	/**
	 * @return
	 */
	public boolean isEmpty();

	/**
	 * @return
	 */
	public ArrayList<Book> viewAllBooks();

	/**
	 * @return
	 */
	public ArrayList<Book> viewBooksByAuthor(String author);
	/**
	 * @param bookName
	 * @return
	 */
	public int countNumberOfBooks(String bookName);
}
