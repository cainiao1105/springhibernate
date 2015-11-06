

import java.sql.SQLException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.context.support.XmlWebApplicationContext;

import com.czb.dao.model.UserInfo;
import com.czb.dao.service.UserService;

public class UserTest {
	
	public static void main(String[] args) throws SQLException {
		saveUserTest();
	}

	public static void saveUserTest() throws SQLException {

		ApplicationContext context =new ClassPathXmlApplicationContext("SpringContext.xml");
		UserService service = (UserService) context.getBean("userService");
		System.out.println("222");
		UserInfo user = new UserInfo();
		user = service.find(1);
		System.out.println(user.getName());
	}

}
