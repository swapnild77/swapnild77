/**
 * 
 */
package com.mindtree.BookManipulation.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.mindtree.BookManipulation.entities.Book;
import com.mindtree.BookManipulation.service.BookService;

/**
 * @author M1057685
 *
 */
public class BookServiceImpl implements BookService {
	ArrayList<Book> books = new ArrayList<Book>();

	@Override
	public void addBook(Book book) {
		books.add(book);
		System.out.println("Books added successfully");
	}

	@Override
	public boolean isEmpty() {
		boolean result;
		if (books.size() > 0)
			result = true;
		else
			result = false;
		return result;
	}

	@Override
	public ArrayList<Book> viewAllBooks() {
		return books;
	}

	@Override
	public ArrayList<Book> viewBooksByAuthor(String author) {
		ArrayList<Book> book = (ArrayList<Book>) books.stream().filter(t -> t.getAuthor().equals(author))
				.collect(Collectors.toList());
		return book;
	}

	@Override
	public int countNumberOfBooks(String bookName) {
		int count = 0;
		for (Book book : books) {
			if (book.getBookName().equals(bookName))
				count++;
		}
		return count;
	}

}
