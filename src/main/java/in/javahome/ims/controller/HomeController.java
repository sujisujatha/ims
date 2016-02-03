package in.javahome.ims.controller;

import in.javahome.ims.response.Response;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	@Value("${ims.institute.name}")
	private String message;
	@RequestMapping
	public Response register() {
		Response response = new Response();
		response.setStatus(200);
		response.setMessage(message);
		return response;
	}
}
