package in.javahome.ims.response;

import in.javahome.ims.pojo.CourseModel;

import java.util.List;

public class CoursesResponse extends Response {
	
	private List<CourseModel> courses;

	public List<CourseModel> getCourses() {
		return courses;
	}

	public void setCourses(List<CourseModel> courses) {
		this.courses = courses;
	}

}
