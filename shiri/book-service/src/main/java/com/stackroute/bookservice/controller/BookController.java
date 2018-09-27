package com.stackroute.bookservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.stackroute.bookservice.domain.Book;
import com.stackroute.bookservice.exceptions.BookAlreadyExistsException;
import com.stackroute.bookservice.exceptions.BookNotFoundException;
import com.stackroute.bookservice.services.BookServices;

@CrossOrigin
@RestController
@RequestMapping("/api/v1/")
public class BookController {

	private BookServices bookServiceImpl;

	@Autowired
	public BookController(BookServices bookServiceImpl) {
		this.bookServiceImpl = bookServiceImpl;
	}

	@RequestMapping(value = "/books", method = RequestMethod.GET, produces = "application/json")
	public ResponseEntity<?> getAllBooks() throws BookNotFoundException {
		List<Book> bookList;
		bookList = bookServiceImpl.getAllBooks();
		return new ResponseEntity<List<Book>>(bookList, HttpStatus.OK);
	}

	@RequestMapping(value = "/book", method = RequestMethod.POST, produces = "application/json")
	public ResponseEntity<?> saveBook(@RequestBody Book book) throws BookAlreadyExistsException {

		try {
			Book savedBook;
			if ((savedBook = bookServiceImpl.saveBook(book)) != null) {

				return new ResponseEntity<Book>(savedBook, HttpStatus.ACCEPTED);
			} else {
				throw new BookAlreadyExistsException("book already exists");
			}
		} catch (BookAlreadyExistsException e) {
			return new ResponseEntity<String>(e.toString(), HttpStatus.CONFLICT);
		}

	}

	@RequestMapping(value = "/{bookTitle}", method = RequestMethod.DELETE, produces = "application/json")
	public ResponseEntity<?> deleteBook(@PathVariable String bookTitle) throws BookNotFoundException {
		List<Book> bookobj = bookServiceImpl.deleteBook(bookTitle);
		return new ResponseEntity<List<Book>>(bookobj, HttpStatus.OK);
	}

	@RequestMapping(value = "/{bookTitle}", method = RequestMethod.GET, produces = "application/json")
	public ResponseEntity<?> getByBookTitle(@PathVariable String bookTitle) throws BookNotFoundException {
		List<Book> list = bookServiceImpl.getByTitle(bookTitle);

		return new ResponseEntity<List<Book>>(list, HttpStatus.FOUND);

	}

	@RequestMapping(value = "/{term}", method = RequestMethod.GET, produces = { "application/json" })
	public ResponseEntity<?> getByAlphabet(@PathVariable("term") String searchTerm) throws BookNotFoundException {
		List<Book> booklistalpha = bookServiceImpl.findBookByRegexpTitle(searchTerm);
		return new ResponseEntity<List<Book>>(booklistalpha, HttpStatus.FOUND);
	}
}
