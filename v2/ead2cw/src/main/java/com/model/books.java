package com.model;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="book_details")
public class books {
    @Id
	private Integer book_id;
	private String book_Title;
    private String book_Author;
	private String book_Category;
	
	public Integer getBook_id() {
		return book_id;
	}
	public void setBook_id(Integer book_id) {
		this.book_id = book_id;
	}
	public String getBook_Title() {
		return book_Title;
	}
	public void setBook_Title(String book_Title) {
		this.book_Title = book_Title;
	}
	public String getBook_Author() {
		return book_Author;
	}
	public void setBook_Author(String book_Author) {
		this.book_Author = book_Author;
	}
	public String getBook_Category() {
		return book_Category;
	}
	public void setBook_Category(String book_Category) {
		this.book_Category = book_Category;
	}
	@Override
	public String toString() {
		return "books [book_id=" + book_id + ", book_Title=" + book_Title + ", book_Author=" + book_Author
				+ ", book_Category=" + book_Category + "]";
	}
	
		
	
	
}
