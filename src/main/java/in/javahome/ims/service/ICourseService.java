package in.javahome.ims.service;

import in.javahome.ims.pojo.CourseModel;
import in.javahome.ims.response.CoursesResponse;
import in.javahome.ims.response.Response;

public interface ICourseService {
	public Response addCourse(CourseModel courseModel);
	public CoursesResponse getAllCourses();
}
