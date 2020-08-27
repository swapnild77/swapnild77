/**
 * 
 */
package com.mindtree.BookManipulation;

/**
 * @author M1057685
 *
 */
import java.io.*;
import java.util.*;

import com.mindtree.BookManipulation.entities.Book;
import com.mindtree.BookManipulation.service.BookService;
import com.mindtree.BookManipulation.service.impl.BookServiceImpl;
import com.mindtree.BookManipulation.utilities.DisplayUtility;
import com.mindtree.BookManipulation.utilities.InputUtilities;

public class BookApplication {
	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		BookService bookService = new BookServiceImpl();
		boolean flag = true;
		do {
			DisplayUtility.displayMessage("Enter Your Choice");
			DisplayUtility.displayMessage("Enter 1 To Add Books");
			DisplayUtility.displayMessage("Enter 2 To Check The List Is Empty Or Not");
			DisplayUtility.displayMessage("Enter 3 To Display All Books");
			DisplayUtility.displayMessage("Enter 4 To Search Book By Author");
			DisplayUtility.displayMessage("Enter 5 To Count Number Of Books By Book Name");
			DisplayUtility.displayMessage("Enter 6 To Exit");
			int ch = in.nextInt();
			switch (ch) {
			case 1:
				Book book = InputUtilities.addBookData(in);
				bookService.addBook(book);
				break;
			case 2:
				boolean result = bookService.isEmpty();
				System.out.println(result);
				break;
			case 3:
				ArrayList<Book> books = bookService.viewAllBooks();
				for (Book book2 : books) {
					DisplayUtility.displayMessage("-------------------------------------------");
					DisplayUtility.displayMessage("The Book ISBN is " + book2.getIsbnNum());
					DisplayUtility.displayMessage("The Book Name is " + book2.getBookName());
					DisplayUtility.displayMessage("The Book Author is " + book2.getAuthor());
					DisplayUtility.displayMessage("-------------------------------------------");
				}
				break;
			case 4:
				DisplayUtility.displayMessage("Enter the Author Name");
				String author = in.next();
				ArrayList<Book> list = bookService.viewBooksByAuthor(author);
				if (list.size() == 0)
					DisplayUtility.displayMessage("List is empty");
				else {
					for (Book book2 : list) {
						DisplayUtility.displayMessage("-------------------------------------------");
						DisplayUtility.displayMessage("The Book ISBN is " + book2.getIsbnNum());
						DisplayUtility.displayMessage("The Book Name is " + book2.getBookName());
						DisplayUtility.displayMessage("The Book Author is " + book2.getAuthor());
						DisplayUtility.displayMessage("-------------------------------------------");
					}
				}

				break;
			case 5:
				DisplayUtility.displayMessage("Enter the Book Name");
				String bName = in.next();
				int count = bookService.countNumberOfBooks(bName);
				if (count < 0)
					DisplayUtility.displayMessage("Book Not Found");
				else
					DisplayUtility.displayMessage("The count is " + count);
				break;
			case 6:
				flag = false;
				DisplayUtility.displayMessage("Thank You");
				break;
			default:
				DisplayUtility.displayMessage("Wrong Choice Given...Try Again !!!");
			}
		} while (flag);
	}
}
