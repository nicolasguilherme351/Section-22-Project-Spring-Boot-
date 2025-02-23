package com.educandoweb.course.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.educandoweb.course.entities.Book;
import com.educandoweb.course.entities.Category;
import com.educandoweb.course.entities.Department;
import com.educandoweb.course.entities.Employee;
import com.educandoweb.course.entities.Order;
import com.educandoweb.course.entities.User;
import com.educandoweb.course.entities.enums.OrderStatus;
import com.educandoweb.course.repositories.BookRepository;
import com.educandoweb.course.repositories.CategoryRepository;
import com.educandoweb.course.repositories.DepartmentRepository;
import com.educandoweb.course.repositories.EmployeeRepository;
import com.educandoweb.course.repositories.OrderRepository;
import com.educandoweb.course.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private BookRepository bookRepository;
	
	@Autowired
	private OrderRepository orderRepository;
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Autowired
	private DepartmentRepository departmentRepository;
	
	@Autowired
	private CategoryRepository categoryRepository;
	
	
	
	@Override
	public void run(String... args) throws Exception {
		
		Category cat1 = new Category(null, "Eletronics");
		Category cat2 = new Category(null, "Books");
		Category cat3 = new Category(null, "Computers");
		
		Department dp1 = new Department(null, "marketing");
		
		Employee emp1 = new Employee(null, "João", 3100.0, dp1);
		
		
		Book book1 = new Book(null, 49.90, "Rogerio de santos farjado", "Lógica matemática");
		Book book2 = new Book(null, 39.90, "Paulo Vieira", "Poder da ação");

		User u1 = new User(null, "Maria Brown", "maria@gmail.com", "988888888", "123456"); 
		User u2 = new User(null, "Alex Green", "alex@gmail.com", "977777777", "123456");
		
		Order o1 = new Order(null, Instant.parse("2019-06-20T19:53:07Z"), OrderStatus.PAID, u1);
		Order o2 = new Order(null, Instant.parse("2019-07-21T03:42:10Z"), OrderStatus.WAITING_PAYMENT,u2);
		Order o3 = new Order(null, Instant.parse("2019-07-22T15:21:22Z"), OrderStatus.WAITING_PAYMENT,u1);
		
		userRepository.saveAll(Arrays.asList(u1, u2));
		bookRepository.saveAll(Arrays.asList(book1, book2));
		orderRepository.saveAll(Arrays.asList(o1, o2, o3));
		
		departmentRepository.saveAll(Arrays.asList(dp1));
		employeeRepository.saveAll(Arrays.asList(emp1));
		categoryRepository.saveAll(Arrays.asList(cat1, cat2, cat3));
	}
	
}
