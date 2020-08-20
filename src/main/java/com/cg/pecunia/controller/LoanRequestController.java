package com.cg.pecunia.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.pecunia.model.LoanRequest;
import com.cg.pecunia.service.LoanRequestService;

@RestController
@RequestMapping("/api/v2")
@CrossOrigin(origins = "http://localhost:4200")
public class LoanRequestController {
	@Autowired
	private LoanRequestService service;

	@GetMapping("/getrequest")
	public List<LoanRequest> getloanrequest() {
		return service.getloanrequest();
	}
	@PostMapping("/loanRequest")
	public String addLoanRequest(@RequestBody LoanRequest loanRequest) {
		System.out.println("Working");
		return service.addLoanRequest(loanRequest);
	}
	@PutMapping("/update")
	public LoanRequest updateDetails(@RequestBody LoanRequest loanRequest) {
		return service.updateDetails(loanRequest);
	}
}
