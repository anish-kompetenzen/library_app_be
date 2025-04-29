package com.library.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.library.app.model.BookModel;
import com.library.app.model.UserModel;
import com.library.app.service.BookService;
import com.library.app.service.UserService;

@RestController
@RequestMapping("library") // http://localhost:8080/library
public class LibraryController {

	@GetMapping("test")
	public String test() {
		return "API Calling Works!!!";
	}

	@Autowired
	private UserService userService;

	@Autowired
	private BookService bookService;

	@PostMapping("user")
	public ResponseEntity<UserModel> createNewUser(@RequestBody UserModel model) {
		return new ResponseEntity<UserModel>(userService.createNewUser(model), HttpStatus.CREATED);
	}

	@PostMapping("book")
	public ResponseEntity<BookModel> createNewBook(@RequestBody BookModel model) {
		return new ResponseEntity<BookModel>(bookService.createNewBook(model), HttpStatus.CREATED);
	}

	@GetMapping("login")
	public ResponseEntity<UserModel> loginUser(@RequestBody UserModel model) {
		return new ResponseEntity<UserModel>(userService.loginUser(model), HttpStatus.ACCEPTED);
	}

}
