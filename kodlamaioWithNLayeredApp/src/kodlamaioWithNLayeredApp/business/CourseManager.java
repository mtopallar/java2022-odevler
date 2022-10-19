package kodlamaioWithNLayeredApp.business;

import kodlamaioWithNLayeredApp.core.logging.Logger;
import kodlamaioWithNLayeredApp.dataAccess.CourseDao;
import kodlamaioWithNLayeredApp.entities.Course;

public class CourseManager {
	private CourseDao courseDao;
	private Logger[] loggers;
	
	
	
	public CourseManager(CourseDao courseDao, Logger[] loggers) {		
		this.courseDao = courseDao;
		this.loggers = loggers;
	}



	public void add(Course course) throws Exception {
		for (Course courseFromList: courseDao.getList()) {
			if (course.getName() == courseFromList.getName()) {
				throw new Exception("Belirttiğiniz kurs adı kullanımda.");
			}
		}
				
		if (course.getPrice() <= 0) {
			throw new Exception("Kurs fiyatı sıfırdan küçük veya eşit olamaz.");
		}
		courseDao.add(course);
		for (Logger logger : loggers) {
			logger.log("Kurs eklendi : " + course.getName());
		}
	}
}
