
package com.cg.pecunia.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "loanrequest_tbl")
@SequenceGenerator(name = "seq", initialValue = 941011000, allocationSize = 50)
public class LoanRequest {
	private int loanReqestId;
	private long loanCustomerId;
	private double loanAmount;
	private String loanType;
	private double loanRoi;
	private String loanStatus;
	private double loanEmi;
	private int creditScore;
	private int loanTenure;

	public LoanRequest() {

	}

	public LoanRequest(int loanReqestId, long loanCustomerId, double loanAmount, String loanType, double loanRoi,
			String loanStatus, double loanEmi, int creditScore, int loanTenure) {
		super();
		this.loanReqestId = loanReqestId;
		this.loanCustomerId = loanCustomerId;
		this.loanAmount = loanAmount;
		this.loanType = loanType;
		this.loanRoi = loanRoi;
		this.loanStatus = loanStatus;
		this.loanEmi = loanEmi;
		this.creditScore = creditScore;
		this.loanTenure = loanTenure;
	}


	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator="seq")
	public int getLoanReqestId() {
		return loanReqestId;
	}

	public void setLoanReqestId(int loanReqestId) {
		this.loanReqestId = loanReqestId;
	}

	public long getLoanCustomerId() {
		return loanCustomerId;
	}

	public void setLoanCustomerId(long loanCustomerId) {
		this.loanCustomerId = loanCustomerId;
	}

	public double getLoanAmount() {
		return loanAmount;
	}

	public void setLoanAmount(double loanAmount) {
		this.loanAmount = loanAmount;
	}

	@Column(name = "loan_type")
	public String getLoanType() {
		return loanType;
	}

	public void setLoanType(String loanType) {
		this.loanType = loanType;
	}

	@Column(name = "loan_roi")
	public double getLoanRoi() {
		return loanRoi;
	}

	public void setLoanRoi(double loanRoi) {
		this.loanRoi = loanRoi;
	}

	@Column(name = "loan_status")
	public String getLoanStatus() {
		return loanStatus;
	}

	public void setLoanStatus(String loanStatus) {
		this.loanStatus = loanStatus;
	}

	@Column(name = "loan_emi")
	public double getLoanEmi() {
		return loanEmi;
	}

	public void setLoanEmi(double loanEmi) {
		this.loanEmi = loanEmi;
	}

	@Column(name = "credit_score")
	public int getCreditScore() {
		return creditScore;
	}

	public void setCreditScore(int creditScore) {
		this.creditScore = creditScore;
	}

	@Column(name = "loan_tenure")
	public int getLoanTenure() {
		return loanTenure;
	}

	public void setLoanTenure(int loanTenure) {
		this.loanTenure = loanTenure;
	}

	@Override
	public String toString() {
		return "LoanRequest [loanReqestId=" + loanReqestId + ", loanCustomerId=" + loanCustomerId + ", loanAmount="
				+ loanAmount + ", loanType=" + loanType + ", loanRoi=" + loanRoi + ", loanStatus=" + loanStatus
				+ ", loanEmi=" + loanEmi + ", creditScore=" + creditScore + ", loanTenure=" + loanTenure + "]";
	}

}
