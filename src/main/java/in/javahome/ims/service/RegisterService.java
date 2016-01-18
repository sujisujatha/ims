package in.javahome.ims.service;

import in.javahome.ims.dao.IRegisterDAO;
import in.javahome.ims.pojo.RegisterModel;
import in.javahome.ims.response.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegisterService implements IRegisterService {
	@Autowired
	private IRegisterDAO registerDAO;

	public Response register(RegisterModel registerModel) {
		Response response = new Response();
		if (registerDAO.findRegisteredStudent(registerModel.getEmail()) != null) {
			response.setMessage("Student already registered");
			response.setStatus(401);
			return response;
		}
		registerDAO.register(registerModel);
		response.setMessage("Student successfully registered");
		response.setStatus(200);
		return response;
	}
}
