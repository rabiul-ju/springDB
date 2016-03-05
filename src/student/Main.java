package student;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.ResultSetExtractor;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx = new ClassPathXmlApplicationContext("BEANS/spring.xml");

		StudentDAO sdao = (StudentDAO)ctx.getBean("sdao");
		Student s= (Student)ctx.getBean("s");
//		s.setAge(25);
//		s.setId(7);
//		s.setName("rakib");
//		
//		int status=sdao.saveStudent(s);
//		System.out.println(status);
		ResultSetExtractor<Student> rse;
		

	}

}
