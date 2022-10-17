package Business;

import DataAccess.ICourseDal;
import Entities.Course;
import Logging.ILogger;

import java.util.ArrayList;

public class CourseManager {
    private ICourseDal courseDal;
    private ILogger[] loggers;


    public CourseManager(ICourseDal courseDal, ILogger[] loggers) {
        this.courseDal = courseDal;
        this.loggers = loggers;
    }

    public void Add(Course course) throws  Exception{

        if(course.getPrice()<0){
            throw  new Exception("Kurs fiyati 0dan kucuk olamaz");
        }

       if(courseDal.Check(course.getTitle())){
           throw  new Exception("kurs ismi tekrar edemez");
       }

        courseDal.Add(course);

        for (ILogger logger : loggers){
            logger.Log(course.getTitle());
        }
    }
}
