package com.xcompany;

import java.util.List;

import com.xcompany.DAO.StudentDao;
import com.xcompany.entities.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        StudentDao studentDao = new StudentDao();
        Student student = new Student("Ramesh", "Fadatare", "rameshfadatare@javaguides.com");
        //studentDao.saveStudent(student);

        List < Student > students = studentDao.getStudents();
        System.out.println(students.get(0).toString());
    }
}
