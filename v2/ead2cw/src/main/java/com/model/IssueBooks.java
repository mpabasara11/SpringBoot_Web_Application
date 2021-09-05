package com.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="Issued_Books")
public class IssueBooks {
	
	@Id
	private Integer book_id;
	private String book_Title;
    private String book_Author;
	private String book_Category;
	private String issued_Date;
	private String borrowers_Name;
	private Integer borrowers_Contact;
	
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
	public String getIssued_Date() {
		return issued_Date;
	}
	public void setIssued_Date(String issued_Date) {
		this.issued_Date = issued_Date;
	}
	public String getBorrowers_Name() {
		return borrowers_Name;
	}
	public void setBorrowers_Name(String borrowers_Name) {
		this.borrowers_Name = borrowers_Name;
	}
	public Integer getBorrowers_Contact() {
		return borrowers_Contact;
	}
	public void setBorrowers_Contact(Integer borrowers_Contact) {
		this.borrowers_Contact = borrowers_Contact;
	}
	@Override
	public String toString() {
		return "IssueBooks [book_id=" + book_id + ", book_Title=" + book_Title + ", book_Author=" + book_Author
				+ ", book_Category=" + book_Category + ", issued_Date=" + issued_Date + ", borrowers_Name="
				+ borrowers_Name + ", borrowers_Contact=" + borrowers_Contact + "]";
	}
	
	
	
	
}
