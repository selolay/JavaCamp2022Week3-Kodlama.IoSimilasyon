package Business;

import DataAccess.IInstructorDal;
import Entities.Category;
import Entities.Instructor;
import Logging.ILogger;


public class InstructorManager {
    private IInstructorDal instructorDal;
    private ILogger[] loggers;



    public InstructorManager(IInstructorDal instructorDal, ILogger[] loggers) {
        this.instructorDal = instructorDal;
        this.loggers = loggers;
    }

    public void Add(Instructor instructor)  {

        for (ILogger logger : loggers) {
            logger.Log(instructor.getFirstName()+instructor.getLastName());
        }

        instructorDal.Add(instructor);
    }
}