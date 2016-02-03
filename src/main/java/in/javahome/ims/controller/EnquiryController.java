package in.javahome.ims.controller;

import in.javahome.ims.pojo.EnquiryModel;
import in.javahome.ims.response.EnquiriesResponse;
import in.javahome.ims.response.Response;
import in.javahome.ims.service.IEnquiryService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EnquiryController {

	@Autowired
	private IEnquiryService service;
	
	@RequestMapping(value="/enquiry",method=RequestMethod.POST,consumes="application/json")
	public Response addEnquiry(@RequestBody EnquiryModel enquiry){
		return service.saveEnquiry(enquiry);
	}
	@RequestMapping(value="/enquiries",method=RequestMethod.GET,consumes="application/json")
	public EnquiriesResponse findAllenquiries(){
		return service.findAllEnquiries();
	}
	
	@RequestMapping(value="/enquiries/{courseId}",method=RequestMethod.GET,consumes="application/json")
	public EnquiriesResponse findAllenquiriesByCourseId(@PathVariable("courseId") int courseId){
		return service.findAllEnquiriesByCourseId(courseId);
	}
	
	
}
