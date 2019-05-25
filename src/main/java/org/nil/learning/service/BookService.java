package org.nil.learning.service;

import java.util.List;

import org.nil.learning.model.Book;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

public interface BookService {
	Book save(Book book);

	void delete(Book book);

	Book findOne(String id);

	Iterable<Book> findAll();

	Page<Book> findByAuthor(String author, PageRequest pageRequest);

	List<Book> findByTitle(String title);
}
