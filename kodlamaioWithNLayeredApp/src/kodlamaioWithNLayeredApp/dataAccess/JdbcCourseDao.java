package kodlamaioWithNLayeredApp.dataAccess;

import kodlamaioWithNLayeredApp.entities.Course;

public class JdbcCourseDao implements CourseDao{

	@Override
	public void add(Course course) {
		System.out.println("Kurs JDBC ile eklendi : " + course.getName());		
	}

	@Override
	public Course[] getList() {
		Course[] courses = {
				new Course(1,"C# + Angular", 59.99),
				new Course(2," Java + React", 59.99),
				new Course(3,"C# Senior Camp", 59.99)
		};
		return courses;
	}

}
