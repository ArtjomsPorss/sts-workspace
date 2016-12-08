import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.basics.service.CustomerService;

public class Application {

	public static void main(String[] args) {
		
//		CustomerService customerService = new CustomerServiceImpl();
		ApplicationContext appContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		CustomerService service = appContext.getBean("customerService", CustomerService.class);
		
		System.out.println(service.findAll().get(0).toString());
		
	}

}
