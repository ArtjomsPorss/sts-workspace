import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import service.CustomerService;
import service.CustomerServiceImpl;

public class Application {

	public static void main(String[] args) {
//		CustomerService service = new CustomerServiceImpl();
		
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		CustomerService service = applicationContext.getBean("customerService", CustomerService.class); 
		
		service.findAll().forEach(c -> System.out.println(c.getFirstName()));
		
//		System.out.println(service.findAll().get(0).getFirstName());

	}

}
