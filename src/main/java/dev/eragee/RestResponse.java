package dev.eragee;

public class RestResponse {
	private String status;
	private Object result;
	
	public RestResponse(String status, Object result) {
		this.status = status;
		this.result = result;
	}
	
	public RestResponse(String result) {
		this.status = "OK";
		this.result = result;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Object getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}
	
}
