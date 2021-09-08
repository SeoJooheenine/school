package egovframework.let.temp.service;

public class TempVO {
	private String tempId;
	private String tempVal;
	

	public String getTempVal() {
		return tempVal;
	}
	public void setTempVal(String tempVal) {
		this.tempVal = tempVal;
	}
	public String getTempId() {
		return tempId;
	}
	public void setTempId(String tempId) {
		this.tempId = tempId;
	}
	@Override
	public String toString() {
		return "TempVO [tempId=" + tempId + ", tempVal=" + tempVal + "]";
	}
}
