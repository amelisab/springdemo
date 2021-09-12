package com.lhint.springdemo2;

import com.lhint.springdemo2.converters.CourseConverter;
import com.lhint.springdemo2.model.Course;
import com.lhint.springdemo2.model.Registration;
import com.lhint.springdemo2.model.User;
import com.lhint.springdemo2.service.CourseServiceImpl;
import com.lhint.springdemo2.service.RegistrationServiceImpl;
import com.lhint.springdemo2.service.UserServiceImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.context.ApplicationContext;

import java.util.List;

@SpringBootApplication( exclude = { SecurityAutoConfiguration.class } )
public class Springdemo2Application {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(Springdemo2Application.class, args);
//
//		CourseServiceImpl courseService = (CourseServiceImpl) ctx.getBean("courseServiceImpl");
//		RegistrationServiceImpl registrationService = (RegistrationServiceImpl) ctx.getBean("registrationServiceImpl");
//		UserServiceImpl userService = (UserServiceImpl) ctx.getBean("userServiceImpl");

		//////////////////////////////////////////////////////////////////////////////////////////////////////////
		//Adding course named Java in DB
//		Course course = new Course();
//		course.setName("Java");
//		course.setDescription("Introduction to Java");
//		course.setRegistrations(registrationService.find(1));
//		courseService.saveOrUpdate(course);


		///////////////////////////////////////////////////////////////////////////////////////////////////////////
		//Removing a course named "Java" of registration 1 from DB
//		Registration registration = registrationService.find(1);
//		List<Course> courses = registration.getCourses();
//
//		Course courseToBeRemoved = null;
//
//		for(Course c: courses){
//			if(c.getName().equals("Java")){
//				courseToBeRemoved = c;
//				break;
//			}
//		}
//		courses.remove(courseToBeRemoved);
//
//		registration.setCourses(courses);
//		registrationService.saveOrUpdate(registration);
//		System.out.println("Course named: " + courseToBeRemoved.getName() + " is removed from DB");


		/////////////////////////////////////////////////////////////////////////////////////////////////////////////
		//Removing a registration from DB

//		registrationService.delete(1);

		////////////////////////////////////////////////////////////////////////////////////////////////////////////
//		Creating user

//		User user = new User();
//		user.setFirstName("Amelisa");
//		user.setLastName("Brari");
//		user.setAge(22);
//		userService.saveOrUpdate(user);

//		CourseConverter converter = new CourseConverter();
//
//		Course course = new Course();
//		course = courseService.find(1);
//
//		System.out.println(course.getName());

	}

}
