package kodlamaioWithNLayeredApp.dataAccess;


import kodlamaioWithNLayeredApp.entities.Course;

public interface CourseDao {
	void add(Course course);
	Course[] getList();//fake
}
