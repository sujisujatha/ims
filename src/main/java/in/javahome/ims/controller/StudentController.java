package in.javahome.ims.controller;

import in.javahome.ims.pojo.StudentModel;
import in.javahome.ims.response.Response;
import in.javahome.ims.service.IStudentService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController("/services/register")
public class StudentController {
	@Value("${ims.name}")
	private String name;
	@Autowired
	private IStudentService registerService;
	@RequestMapping(method=RequestMethod.POST,consumes={MediaType.APPLICATION_JSON_VALUE})
	public Response register(@RequestBody @Validated StudentModel register) {
		return registerService.register(register);
	}
	
	
	@RequestMapping(method=RequestMethod.POST,value="/upload")
	public Response upload(@RequestBody @Validated StudentModel register) {
		return registerService.register(register);
	}
}
