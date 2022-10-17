package DataAccess;

import Entities.Category;
import Entities.Course;

import java.util.ArrayList;

public class CategoryJdbcDal implements  ICategoryDal{

    ArrayList<Category> categories = new ArrayList<Category>();
    @Override
    public void Add(Category category) {

        System.out.println("JDBC ile veri tabanina eklendi: ");
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
