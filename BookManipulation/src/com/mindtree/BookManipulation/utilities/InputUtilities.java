/**
 * 
 */
package com.mindtree.BookManipulation.utilities;

import java.util.Scanner;

import com.mindtree.BookManipulation.entities.Book;

/**
 * @author M1057685
 *
 */
public class InputUtilities {
	public static Book addBookData(Scanner scanner) {
		Book book = new Book();
		System.out.println("Enter ISBN Number");
		int isbn = scanner.nextInt();
		book.setIsbnNum(isbn);
		System.out.println("Enter Book Name");
		String bName = scanner.next();
		book.setBookName(bName);
		System.out.println("Enter Author Name");
		String authorName = scanner.next();
		book.setAuthor(authorName);
		return book;

	}
}
