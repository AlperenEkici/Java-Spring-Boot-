package com.Alp.project2.Core.Ultutiess.Results;

public class ErrorDataResult<T> extends DataResult<T>{
	public ErrorDataResult(T data, String message) {
		super(false, data ,message);
	}
	
	public ErrorDataResult(T data) {
		super(data,false);
	}
	
	public ErrorDataResult(String message) {
		super(false, null ,message);
	}
	
	public ErrorDataResult() {
		super(null, false);
	}
}
