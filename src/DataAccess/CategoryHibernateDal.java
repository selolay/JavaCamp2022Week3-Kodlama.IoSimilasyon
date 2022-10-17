package DataAccess;

import Entities.Category;
import Entities.Course;

import java.util.ArrayList;

public class CategoryHibernateDal implements  ICategoryDal{
    ArrayList<Category> categories = new ArrayList<Category>();

    @Override
    public void Add(Category category) {

        System.out.println("Hibernate ile veri tabanina eklendi: " +category.getCategoryName());
        categories.add(category);
    }

    @Override
    public boolean Check(String categoryName) {
        for (Category category: categories){
            if(category.getCategoryName().equalsIgnoreCase(categoryName)){
                return true;
            }
        }
        return false;
    }

}
