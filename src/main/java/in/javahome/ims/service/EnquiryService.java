package in.javahome.ims.service;

import java.util.ArrayList;
import java.util.List;

import in.javahome.ims.entities.Course;
import in.javahome.ims.entities.Enquiry;
import in.javahome.ims.pojo.EnquiryModel;
import in.javahome.ims.repositories.CourseRepository;
import in.javahome.ims.repositories.EnquiryRepository;
import in.javahome.ims.response.EnquiriesResponse;
import in.javahome.ims.response.Response;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

@Service
public class EnquiryService implements IEnquiryService {
	
	@Autowired
	private EnquiryRepository repository;
	@Autowired
	private CourseRepository courseRepository;

	public Response saveEnquiry(EnquiryModel enquiryModel) {
		Course course = courseRepository.findOne(enquiryModel.getCourseId());
		Enquiry entity = modelToEntity(enquiryModel);
		entity.setCourse(course);
			repository.save(entity);
		Response response = new Response();
		response.setMessage("Enquiry successfully added");
		response.setStatus(HttpStatus.OK.value());
		return response;
	}
	private Enquiry modelToEntity(EnquiryModel model){
		Enquiry entity = new Enquiry();
		BeanUtils.copyProperties(model, entity);
		return entity;
	}
	private EnquiryModel entitylToModel(Enquiry entity){
		EnquiryModel model = new EnquiryModel();
		BeanUtils.copyProperties(entity, model);
		return model;
	}
	public EnquiriesResponse findAllEnquiries() {
		List<Enquiry> enquiriesEntity = repository.findAll();
		List<EnquiryModel> modelList = new ArrayList<EnquiryModel>();
		for (Enquiry entity : enquiriesEntity) {
			EnquiryModel model = entitylToModel(entity);
			model.setCourseName(entity.getCourse().getCourseName());
			modelList.add(model);
		}
		EnquiriesResponse response = new EnquiriesResponse();
		response.setStatus(HttpStatus.OK.value());
		response.setEnquiries(modelList);
		return response;
	}
	
	public EnquiriesResponse findAllEnquiriesByCourseId(int courseId){
		
		List<Enquiry> enquiriesEntity = repository.findByCourse(courseRepository.findOne(courseId));
		List<EnquiryModel> modelList = new ArrayList<EnquiryModel>();
		for (Enquiry entity : enquiriesEntity) {
			EnquiryModel model = entitylToModel(entity);
			model.setCourseName(entity.getCourse().getCourseName());
			modelList.add(model);
		}
		EnquiriesResponse response = new EnquiriesResponse();
		response.setStatus(HttpStatus.OK.value());
		response.setEnquiries(modelList);
		return response;
	}

}
