package kodlamaioWithNLayeredApp;

import kodlamaioWithNLayeredApp.business.CategoryManager;
import kodlamaioWithNLayeredApp.business.CourseManager;
import kodlamaioWithNLayeredApp.core.logging.DatabaseLogger;
import kodlamaioWithNLayeredApp.core.logging.FileLogger;
import kodlamaioWithNLayeredApp.core.logging.Logger;
import kodlamaioWithNLayeredApp.core.logging.MailLogger;
import kodlamaioWithNLayeredApp.dataAccess.HibernateCourseDao;
import kodlamaioWithNLayeredApp.dataAccess.JdbcCategoryDao;
import kodlamaioWithNLayeredApp.entities.Category;
import kodlamaioWithNLayeredApp.entities.Course;

public class Main {

	public static void main(String[] args) throws Exception {
		
		Logger[] loggers = {new DatabaseLogger(),new FileLogger(), new MailLogger()};
		CourseManager courseManager = new CourseManager(new HibernateCourseDao(),loggers);
		courseManager.add(new Course(4,"Phyton",59.99));
		
		
		CategoryManager categoryManager = new CategoryManager(new JdbcCategoryDao(), loggers);
		categoryManager.add(new Category(5,"Yazılım"));
	}

}
