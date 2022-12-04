package com.Alp.project2.Core.Ultutiess.Results;

public class Result {
	private boolean success;
	private String message;
	
	public Result(boolean success) {
		super();
		this.success = success;
	}

	
	public Result(boolean success, String message) {
		super();
		this.success = success;
		this.message = message;
	}
	
	public boolean getSuccess() {
		return this.success;
	}
	
	public String getMessage() {
		   return this.message;
	   }
}
