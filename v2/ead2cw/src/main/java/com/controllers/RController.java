package com.controllers;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.model.IssueBookRepo;
import com.model.IssueBooks;
import com.model.books;
import com.model.booksRepo;

@RestController
public class RController {

	
	@Autowired
	booksRepo repo1;
	
	@Autowired
	IssueBookRepo repo2;
	
	@RequestMapping("/BookList")
	@ResponseBody
	public List<books> getBookList() {
		
		return repo1.findAll();
	

	
	}
	
	@RequestMapping("/BookList/{book_id}")
	@ResponseBody
	public Optional<books> getBookList(@PathVariable("book_id")int book_id) {
		
		return repo1.findById(book_id);
		
	}
	
		
	@RequestMapping("/IssueHistory")
	@ResponseBody
	public List<IssueBooks> getIssueHistory() {
		
		return repo2.findAll();

		
	}
	
	@RequestMapping("/IssueHistory/{book_id}")
	@ResponseBody
	public Optional<IssueBooks> getIssueHistory(@PathVariable("book_id")int book_id) {
		
		return repo2.findById(book_id);


	
		
	
	}

}
