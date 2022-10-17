package DataAccess;

import Entities.Course;
import Entities.Instructor;

public interface ICourseDal {
    void Add(Course course);

    boolean Check(String title);
}
