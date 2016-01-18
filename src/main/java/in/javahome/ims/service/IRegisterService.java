package in.javahome.ims.service;

import in.javahome.ims.pojo.RegisterModel;
import in.javahome.ims.response.Response;

public interface IRegisterService {
	public Response register(RegisterModel registerModel);
}
