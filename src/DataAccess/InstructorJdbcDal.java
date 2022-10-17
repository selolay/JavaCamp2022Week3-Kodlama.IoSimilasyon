package DataAccess;

import Entities.Instructor;

public class InstructorJdbcDal implements  IInstructorDal{
    @Override
    public void Add(Instructor instructor) {
        System.out.println("JDBC ile veri tabanına eklendi: ");

    }
}
