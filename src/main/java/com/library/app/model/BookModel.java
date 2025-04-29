package com.library.app.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "book_details")
public class BookModel {
	@Id // Primary Key
	@GeneratedValue(strategy = GenerationType.IDENTITY) // auto_increment
	private Integer id;
	private Integer quantity, year;
	private String name, image, author, genre;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Integer getYear() {
		return year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	@Override
	public String toString() {
		return "BookModel [id=" + id + ", quantity=" + quantity + ", year=" + year + ", name=" + name + ", image="
				+ image + ", author=" + author + ", genre=" + genre + "]";
	}

	public BookModel(Integer id, Integer quantity, Integer year, String name, String image, String author,
			String genre) {
		this.id = id;
		this.quantity = quantity;
		this.year = year;
		this.name = name;
		this.image = image;
		this.author = author;
		this.genre = genre;
	}

	public BookModel() {
	}
}
