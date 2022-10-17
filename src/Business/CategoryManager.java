package Business;

import DataAccess.ICategoryDal;
import Entities.Category;
import Entities.Course;
import Entities.Instructor;
import Logging.ILogger;

import java.util.ArrayList;

public class CategoryManager {
    private ICategoryDal categoryDal;
    private ILogger[] loggers;


    public CategoryManager(ICategoryDal categoryDal, ILogger[] loggers) {
        this.categoryDal = categoryDal;
        this.loggers = loggers;
    }

    public void Add(Category category) throws  Exception{


        if(categoryDal.Check(category.getCategoryName())){
            throw  new Exception("kategori ismi tekrarlanamaz");
        }


        categoryDal.Add(category);
        for (ILogger logger : loggers){
            logger.Log(category.getCategoryName());
        }
    }
}
