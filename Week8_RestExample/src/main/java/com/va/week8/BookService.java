package com.va.week8;

import java.util.HashSet;

public interface BookService {
	HashSet<Book> findAllBook();
	Book findBookById(long id);
	// add methods as per business logic.. asks..
	void addBook(Book b);
	void deleteAllData();
	

}
