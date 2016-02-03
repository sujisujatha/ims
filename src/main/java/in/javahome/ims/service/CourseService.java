package in.javahome.ims.service;

import in.javahome.ims.entities.Course;
import in.javahome.ims.pojo.CourseModel;
import in.javahome.ims.repositories.CourseRepository;
import in.javahome.ims.response.CoursesResponse;
import in.javahome.ims.response.Response;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class CourseService implements ICourseService {
	@Autowired
	private CourseRepository repository;
	@Transactional
	public Response addCourse(CourseModel courseModel) {
		Response response = new Response();
		Course entity = new Course();
		BeanUtils.copyProperties(courseModel, entity);
		repository.save(entity);
		response.setMessage("Course successfully registered");
		response.setStatus(200);
		return response;
	}

	public CoursesResponse getAllCourses() {
		CoursesResponse  response = new CoursesResponse();
		response.setStatus(200);
		List<CourseModel> courses = new ArrayList<CourseModel>();
		List<Course> entities = repository.findAll();
		for (Course entity : entities) {
			courses.add(entiryToModel(entity));
		}
		response.setCourses(courses);
		return response;
	}
	private CourseModel entiryToModel(Course entity){
		CourseModel model = new CourseModel();
		BeanUtils.copyProperties(entity, model);
		return model;
	}
}
