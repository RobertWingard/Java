package com.robert.bookapi.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.robert.bookapi.models.Book;
import com.robert.bookapi.services.BookService;

@Controller
public class BookController {
	
		@Autowired
		BookService bookService;

		@GetMapping("/books/{bookId}")
		public String index(Model model,@PathVariable("bookId") Long bookId) {
			
//			Book book = bookService.findBook(bookId);			
			ArrayList<Book> books =  (ArrayList<Book>) bookService.allBooks();
			
//			model.addAttribute("book", book);
			model.addAttribute("books", books);
			return "show.jsp";
		}
		
		@RequestMapping("/books")
		public String index(Model model) {
			List<Book> books = bookService.allBooks();
			model.addAttribute("books", books);
			return "index.jsp";
		}
}
