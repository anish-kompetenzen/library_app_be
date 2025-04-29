package com.library.app.service;

import java.util.List;

import com.library.app.model.BookModel;

public interface BookService {

	public BookModel createNewBook(BookModel model);

	public BookModel updateBook(BookModel model);

	public BookModel deleteBook(Integer id);

	public BookModel viewOneBook(Integer id);

	public List<BookModel> viewAllBooks();
}
