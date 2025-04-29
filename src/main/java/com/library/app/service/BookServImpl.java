package com.library.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.library.app.model.BookModel;
import com.library.app.repository.BookRepository;

@Service
public class BookServImpl implements BookService {

	@Autowired
	private BookRepository bookRepository;

	@Override
	public BookModel createNewBook(BookModel model) {
		return bookRepository.save(model);
	}

	@Override
	public BookModel updateBook(BookModel model) {
		Optional<BookModel> op = bookRepository.findById(model.getId());
		if (op.isPresent()) {
			return bookRepository.save(model);
		}
		return new BookModel();
	}

	@Override
	public BookModel deleteBook(Integer id) {
		Optional<BookModel> op = bookRepository.findById(id);
		if (op.isPresent()) {
			bookRepository.deleteById(id);
			return op.get();
		}
		return new BookModel();
	}

	@Override
	public BookModel viewOneBook(Integer id) {
		Optional<BookModel> op = bookRepository.findById(id);
		if (op.isPresent()) {
			return op.get();
		}
		return new BookModel();
	}

	@Override
	public List<BookModel> viewAllBooks() {
		return bookRepository.findAll();
	}

}
