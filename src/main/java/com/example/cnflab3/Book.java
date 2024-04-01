package com.example.cnflab3;

public class Book {
	int id;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getPublicationYear() {
		return publicationYear;
	}
	public void setPublicationYear(String publicationYear) {
		this.publicationYear = publicationYear;
	}
	String author,title, publicationYear;
	@Override
	public String toString() {
		return "Book [id=" + id + ", author=" + author + ", title=" + title + ", publicationYear=" + publicationYear
				+ "]";
	}
}
