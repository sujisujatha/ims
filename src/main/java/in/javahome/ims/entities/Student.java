package in.javahome.ims.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="STUDENTS_INFO")
public class Student {
	@Id
	@Column(name="STUDENT_ID")
	private int studentId;
	@Column(name="FIRST_NAME")
	private String firstName;
	@Column(name="LAST_NAME")
	private String lastName;
	@Column(name="YEAR_OF_PASS_OUT")
	private String yearOfPassOut;
	@Column(name="MOBILE")
	private String mobile;
	@Column(name="EMAIL")
	private String email;
	@Column(name="EDUCATION")
	private String education;
	@Column(name="REFFERED_BY")
	private String refferedBy;
	@ManyToMany(cascade=CascadeType.ALL)
	@JoinTable(name="STUDENTS_COURCES",joinColumns={@JoinColumn(name="STUDENT_ID")},inverseJoinColumns={@JoinColumn(name="COURSE_ID")})
	private List<Course> courses = new ArrayList<Course>();
	
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
	
	public List<Course> getCourses() {
		return courses;
	}
	public void setCourses(List<Course> courses) {
		this.courses = courses;
	}
	@Override
	public String toString() {
		return "RegisterModel [studentId=" + studentId + ", firstName="
				+ firstName + ", lastName=" + lastName + ", yearOfPassOut="
				+ yearOfPassOut + ", mobile=" + mobile + ", email=" + email
				+ ", education=" + education + ", refferedBy=" + refferedBy
				+ ", courses=" + courses + "]";
	}
	
	
}
