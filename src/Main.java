import Business.CategoryManager;
import Business.CourseManager;
import DataAccess.CategoryHibernateDal;
import DataAccess.CourseHibernateDal;
import DataAccess.CourseJdbcDal;
import Entities.Category;
import Entities.Course;
import Entities.Instructor;
import Logging.ILogger;

public class Main {
    public static void main(String[] args) throws Exception {

        Category category1 =new Category(1,"Programlama");
        Category category2 =new Category(1,"Programlama");
        ILogger[] loggers ={};


        CategoryManager categoryManager =new CategoryManager(new CategoryHibernateDal(),loggers);
        categoryManager.Add(category1);
        categoryManager.Add(category2);


        Course course1= new Course(1,"java kursu","Engin Demirog",8,"2022 java kampı","src='java.img'");
        Course course2= new Course(1,"java kursu","Engin Demirog",8,"2022 java kampı","src='java.img'");
        ILogger[] loggers1 ={};


        CourseManager courseManager = new CourseManager(new CourseJdbcDal(),loggers1);
        courseManager.Add(course1);
        courseManager.Add(course2);
    }
}