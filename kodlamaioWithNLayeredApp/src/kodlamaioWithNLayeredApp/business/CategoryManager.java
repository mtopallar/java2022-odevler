package kodlamaioWithNLayeredApp.business;

import kodlamaioWithNLayeredApp.core.logging.Logger;
import kodlamaioWithNLayeredApp.dataAccess.CategoryDao;
import kodlamaioWithNLayeredApp.entities.Category;

public class CategoryManager {

	private CategoryDao categoryDao;
	private Logger[] loggers;
	
	public CategoryManager(CategoryDao categoryDao, Logger[] loggers) {
		
		this.categoryDao = categoryDao;
		this.loggers = loggers;
	}
	
	public void add(Category category) throws Exception {
		for (Category categoryFromList : categoryDao.getList()) {
			if (category.getName() == categoryFromList.getName()) {
				throw new Exception("Belirttiğiniz kategori adı kullanımda.");
			}
		}
		categoryDao.add(category);
		for (Logger logger : loggers) {
			logger.log("Kategori eklendi : " + category.getName());
		}
	}
	
	
}
