package org.nil.learning.service;

import java.util.List;

import org.nil.learning.model.Book;
import org.nil.learning.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl implements BookService {

	private BookRepository bookRepository;
	
	@Autowired
	public void setBookRepository(BookRepository bookRepository) {
		this.bookRepository = bookRepository;
	}
	@Override
	public Book save(Book book) {
		return bookRepository.save(book);
	}

	@Override
	public void delete(Book book) {
		bookRepository.delete(book);
	}

	@Override
	public Book findOne(String id) {
		return bookRepository.findById(id).get();
	}

	@Override
	public Iterable<Book> findAll() {
		return bookRepository.findAll();
	}

	@Override
	public Page<Book> findByAuthor(String author, PageRequest pageRequest) {
		return bookRepository.findByAuthor(author, pageRequest);
	}

	@Override
	public List<Book> findByTitle(String title) {
		return bookRepository.findByTitle(title);
	}

}
