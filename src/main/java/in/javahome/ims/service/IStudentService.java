package in.javahome.ims.service;

import in.javahome.ims.pojo.StudentModel;
import in.javahome.ims.response.Response;

public interface IStudentService {
	public Response register(StudentModel registerModel);
}
