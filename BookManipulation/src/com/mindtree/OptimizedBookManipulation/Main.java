/**
 * 
 */
package com.mindtree.OptimizedBookManipulation;

import java.util.ArrayList;
import java.util.Scanner;

import com.mindtree.BookManipulation.entities.Book;

/**
 * @author M1057685
 *
 */
public class Main {
	static Scanner in = new Scanner(System.in);

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Library library = new Library();
		boolean flag = true;
		do {
			System.out.println("Enter Your Choice");
			System.out.println("Enter 1 To Add Books");
			System.out.println("Enter 2 To Check The List Is Empty Or Not");
			System.out.println("Enter 3 To Display All Books");
			System.out.println("Enter 4 To Search Book By Author");
			System.out.println("Enter 5 To Count Number Of Books By Book Name");
			System.out.println("Enter 6 To Exit");
			int ch = in.nextInt();
			switch (ch) {
			case 1:
				Book book1 = new Book();
				System.out.println("Enter ISBN Number");
				int isbn = in.nextInt();
				book1.setIsbnNum(isbn);
				System.out.println("Enter Book Name");
				String bName = in.next();
				book1.setBookName(bName);
				System.out.println("Enter Author Name");
				String authorName = in.next();
				book1.setAuthor(authorName);
				library.addBook(book1);
				break;
			case 2:
				boolean result = library.isEmpty();
				System.out.println(result);
				break;
			case 3:
				ArrayList<Book> books = library.viewAllBooks();
				for (Book book2 : books) {
					System.out.println("-------------------------------------------");
					System.out.println("The Book ISBN is " + book2.getIsbnNum());
					System.out.println("The Book Name is " + book2.getBookName());
					System.out.println("The Book Author is " + book2.getAuthor());
					System.out.println("-------------------------------------------");
				}
				break;
			case 4:
				System.out.println("Enter the Author Name");
				String author = in.next();
				ArrayList<Book> list = library.viewBooksByAuthor(author);
				if (list.size() == 0)
					System.out.println("List is empty");
				else {
					for (Book book2 : list) {
						System.out.println("-------------------------------------------");
						System.out.println("The Book ISBN is " + book2.getIsbnNum());
						System.out.println("The Book Name is " + book2.getBookName());
						System.out.println("The Book Author is " + book2.getAuthor());
						System.out.println("-------------------------------------------");
					}
				}

				break;
			case 5:
				System.out.println("Enter the Book Name");
				String bName1 = in.next();
				int count = library.countNumberOfBooks(bName1);
				if (count < 0)
					System.out.println("Book Not Found");
				else
					System.out.println("The count is " + count);
				break;
			case 6:
				flag = false;
				System.out.println("Thank You");
				break;
			default:
				System.out.println("Wrong Choice Given...Try Again !!!");
			}
		} while (flag);
	}
}
