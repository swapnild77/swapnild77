/**
 * 
 */
package com.mindtree.OptimizedBookManipulation;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;

import com.mindtree.BookManipulation.entities.Book;

/**
 * @author M1057685
 * @author Swapnil Dutta
 */
public class Library {
	static Scanner in = new Scanner(System.in);
	ArrayList<Book> books = new ArrayList<Book>();

	public void addBook(Book book) {
		books.add(book);
		System.out.println("Books added successfully");
	}

	public boolean isEmpty() {
		boolean result;
		if (books.size() > 0)
			result = true;
		else
			result = false;
		return result;
	}

	public ArrayList<Book> viewAllBooks() {
		return books;
	}

	public ArrayList<Book> viewBooksByAuthor(String author) {
		ArrayList<Book> book = (ArrayList<Book>) books.stream().filter(t -> t.getAuthor().equals(author))
				.collect(Collectors.toList());
		return book;
	}

	public int countNumberOfBooks(String bookName) {
		int count = 0;
		for (Book book : books) {
			if (book.getBookName().equals(bookName))
				count++;
		}
		return count;
	}
}
