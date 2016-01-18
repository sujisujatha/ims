package in.javahome.ims.dao;

import in.javahome.ims.pojo.RegisterModel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class RegisterDAO implements IRegisterDAO {
	@Autowired
	private JdbcTemplate template;
	public void register(RegisterModel model) {
		String sql = "INSERT INTO STUDENTS_INFO(FIRST_NAME,LAST_NAME,MOBILE,MAIL,REFFERED_BY,YEAR_OF_PASS_OUT) VALUES(?,?,?,?,?,?)";
		template.update(sql, model.getFirstName(),model.getLastName(),model.getMobile(),model.getEmail(),model.getRefferedBy(),model.getYearOfPassOut());
	}
	public String findRegisteredStudent(String email) {
		String sql = "SELECT MAIL FROM STUDENTS_INFO WHERE MAIL=?";
		return template.queryForObject(sql,new Object[]{email}, String.class);
	}
}
