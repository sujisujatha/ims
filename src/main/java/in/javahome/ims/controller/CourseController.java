package in.javahome.ims.controller;

import in.javahome.ims.pojo.CourseModel;
import in.javahome.ims.response.CoursesResponse;
import in.javahome.ims.response.Response;
import in.javahome.ims.service.ICourseService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {

	@Autowired
	private ICourseService service;
	
	@RequestMapping(value="/cource",method=RequestMethod.POST,consumes="application/json")
	public Response addCourse(@RequestBody CourseModel courseModel){
		return service.addCourse(courseModel);
	}
	
	
	@RequestMapping(value="/cources",method=RequestMethod.GET)
	public CoursesResponse getAllCourses(){
		return service.getAllCourses();
	}
	
	
	
	
}
