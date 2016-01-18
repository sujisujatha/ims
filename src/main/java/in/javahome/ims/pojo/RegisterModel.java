package in.javahome.ims.pojo;

public class RegisterModel {
	private int studentId;
	private String firstName;
	private String lastName;
	private String yearOfPassOut;
	private String mobile;
	private String email;
	private String education;
	private String refferedBy;
	
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getYearOfPassOut() {
		return yearOfPassOut;
	}
	public void setYearOfPassOut(String yearOfPassOut) {
		this.yearOfPassOut = yearOfPassOut;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getEducation() {
		return education;
	}
	public void setEducation(String education) {
		this.education = education;
	}
	public String getRefferedBy() {
		return refferedBy;
	}
	public void setRefferedBy(String refferedBy) {
		this.refferedBy = refferedBy;
	}
	@Override
	public String toString() {
		return "RegisterModel [studentId=" + studentId + ", firstName="
				+ firstName + ", lastName=" + lastName + ", yearOfPassOut="
				+ yearOfPassOut + ", mobile=" + mobile + ", email=" + email
				+ ", education=" + education + ", refferedBy=" + refferedBy
				+ "]";
	}
}
