package com.Alp.project2.Core.Ultutiess.Results;

public class ErrorResult extends Result{
	public  ErrorResult() {
		super(false);
	}
	public ErrorResult(String message) {
		super(false,message);		
	}

}
