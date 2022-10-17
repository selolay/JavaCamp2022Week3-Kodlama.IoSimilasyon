package DataAccess;

import Entities.Category;
import Entities.Instructor;

public interface ICategoryDal {
    void Add(Category category);
    boolean Check(String categoryName);
}
