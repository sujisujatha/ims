package in.javahome.ims.controller;

import in.javahome.ims.pojo.RegisterModel;
import in.javahome.ims.response.Response;
import in.javahome.ims.service.IRegisterService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController("/register")
public class StudentRegistrationController {
	@Autowired
	private IRegisterService registerService;
	@RequestMapping(method=RequestMethod.POST,consumes={MediaType.APPLICATION_JSON_VALUE})
	public Response register(@RequestBody RegisterModel register) {
		return registerService.register(register);
	}
}
