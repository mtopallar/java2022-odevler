package kodlamaioWithNLayeredApp.dataAccess;


import kodlamaioWithNLayeredApp.entities.Category;

public interface CategoryDao {
	void add(Category category);
	Category[] getList();//fake
}
