package DataAccess;

import Entities.Instructor;

public class InstructorHibernateDal  implements  IInstructorDal{
    @Override
    public void Add(Instructor instructor) {
        System.out.println("Hibernate ile veri tabanına eklendi: " );


    }
}
