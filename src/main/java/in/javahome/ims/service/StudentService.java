package in.javahome.ims.service;

import java.util.List;

import in.javahome.ims.entities.Course;
import in.javahome.ims.entities.Student;
import in.javahome.ims.pojo.StudentModel;
import in.javahome.ims.repositories.CourseRepository;
import in.javahome.ims.repositories.StudentRepository;
import in.javahome.ims.response.Response;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class StudentService implements IStudentService {
	@Autowired
	private StudentRepository repository;
	@Autowired
	private CourseRepository courseRepository;

	@Transactional
	public Response register(StudentModel stdModel) {
		Response response = new Response();
		if (repository.findByEmail(stdModel.getEmail()) != null) {
			response.setMessage("Student already registered");
			response.setStatus(HttpStatus.CONFLICT.value());
			return response;
		}
		Student entity = modelToEntity(stdModel);
		if(stdModel.getCourseIds() != null && stdModel.getCourseIds().size()>0){
			List<Course> courses = courseRepository.findByCourseIdIn(stdModel.getCourseIds());
			entity.getCourses().addAll(courses);
		}
		repository.save(entity);
		response.setMessage("Student successfully registered");
		response.setStatus(HttpStatus.OK.value());
		return response;
	}
	
	private Student modelToEntity(StudentModel model){
		Student  entity = new Student();
		BeanUtils.copyProperties(model, entity);
		return entity;
	}
}
