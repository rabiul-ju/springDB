package student;

import java.sql.ResultSet;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowCallbackHandler;

public class StudentDAO {
	
	private JdbcTemplate jdbcTemplate;
	
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		
		this.jdbcTemplate=jdbcTemplate;
	}
	
	public int saveStudent(Student s){
		
		
//		Student s= new Student();
//		s.setAge(25);
//		s.setId(5);
//		s.setName("rakib");
		String query = "insert into student values('"+s.getId()+"','"+s.getName()+"','"+s.getAge()+"')";
		return jdbcTemplate.update(query);
	}
	
	public ResultSetExtractor<Student> selectStudents(int age){
		
		String sql = "select * from Student where age = '"+age+"'";
		ResultSet rs;
		ResultSetExtractor<Student> rse = null;
		jdbcTemplate.query(sql, rse);
		return rse;
	}

}
