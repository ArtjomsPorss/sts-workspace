import com.basics.service.CustomerService;
import com.basics.service.CustomerServiceImpl;

public class Application {

	public static void main(String[] args) {
		
		CustomerService customerService = new CustomerServiceImpl(); 
		
		System.out.println(customerService.findAll().get(0).toString());
		
	}

}
