package com.robert.bookapi.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.robert.bookapi.models.Book;
import com.robert.bookapi.repositories.BookRepository;

@Service

public class BookService {
	private final BookRepository bookRepository;
	
	public BookService (BookRepository bookRepository) {
		this.bookRepository = bookRepository;
	}
    // returns all the books
    public List<Book> allBooks() {
        return bookRepository.findAll();
    }
    // creates a book
    public Book createBook(Book b) {
        return bookRepository.save(b);
    }
    // retrieves a book
    public Book findBook(Long id) {
        Optional<Book> optionalBook = bookRepository.findById(id);
        if(optionalBook.isPresent()) {
            return optionalBook.get();
        } else {
            return null;
        }
    }
    
    // updates a book
    public Book updateBook(Book c) {
    	return bookRepository.save(c);
    }
    // Deletes one by id
    public void deleteBook(Long id) {
    	bookRepository.deleteById(id);
    }
}
