package com.cg.pecunia.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.pecunia.model.LoanRequest;
import com.cg.pecunia.repository.LoanRequestRepository;

@Service
public class LoanRequestServiceImpl implements LoanRequestService {
	
	@Autowired
	private LoanRequestRepository repo;
	@Override
	public List<LoanRequest> getloanrequest() {
		return repo.findAll();
	}

	@Override
	public String addLoanRequest(LoanRequest loanRequest) {
		double emical = loanRequest.getLoanAmount()*loanRequest.getLoanRoi()*(loanRequest.getLoanRoi()+1)*loanRequest.getLoanTenure()/((1+loanRequest.getLoanTenure()*loanRequest.getLoanTenure()-1));
		loanRequest.setLoanEmi(emical);
		repo.save(loanRequest);
		return "Loan request successfully added";
	}
	@Override
	public LoanRequest updateDetails(LoanRequest loanRequest) {
		Optional <LoanRequest> existid=repo.findById(loanRequest.getLoanReqestId());
		 
			LoanRequest update =existid.get();
			update.setLoanStatus(loanRequest.getLoanStatus());
		
			 repo.save(update);
			
		
		return new LoanRequest();
	}
}
