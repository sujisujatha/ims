package in.javahome.ims.dao;

import in.javahome.ims.pojo.RegisterModel;

public interface IRegisterDAO {
	public void register(RegisterModel registerModel);
	public String findRegisteredStudent(String email);
}
