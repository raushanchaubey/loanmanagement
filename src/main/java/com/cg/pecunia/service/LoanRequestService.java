package com.cg.pecunia.service;

import java.util.List;

import com.cg.pecunia.model.LoanRequest;

public interface LoanRequestService {
	public List<LoanRequest> getloanrequest();
	String addLoanRequest(LoanRequest loanRequest);
	public LoanRequest updateDetails(LoanRequest loanRequest);
}


