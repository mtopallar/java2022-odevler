package kodlamaioWithNLayeredApp.dataAccess;

import kodlamaioWithNLayeredApp.entities.Category;

public class HibernateCategoryDao implements CategoryDao{

	@Override
	public void add(Category category) {
	System.out.println("Kategori hibernate ile eklendi : " + category.getName());
	}

	@Override
	public Category[] getList() {
		// FakeList
		Category[] categories = {
				new Category(1,"Programlama"),
				new Category(2,"Yabancı Dil")
		};
		return categories;
	}

}
