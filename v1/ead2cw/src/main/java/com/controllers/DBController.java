package com.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


import com.model.IssueBookRepo;
import com.model.IssueBooks;
import com.model.books;
import com.model.booksRepo;



@Controller
public class DBController {
	
	@Autowired
	booksRepo repo1;
	
	@Autowired
	IssueBookRepo repo2;
	
	
	
	@RequestMapping("addBook")
	public String addBook(books boo1) {
		repo1.save(boo1);
		return "addBook";
	}
	@RequestMapping("issueBook")
	public String issueBook(IssueBooks boo2) {
		repo2.save(boo2);
		return "issueBook";
	}
	
	@RequestMapping("refreshBookList")
	public String showBookList(Model model) {
	Iterable<books>bookList=repo1.findAll();

	model.addAttribute("bookList",bookList);	
	return "bookList";	
	}
	
	@RequestMapping("RefreshIssueHistory")
	public String showIssueHistory(Model model) {
	Iterable<IssueBooks>issuedHistory=repo2.findAll();

	
			model.addAttribute("issueList",issuedHistory);
			return "issueHistory";
		
	
	}

}
