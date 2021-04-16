package com.bjpowernode;

import com.bjpowernode.dao.StudentDao;
import com.bjpowernode.dao.StudentDaoImpl;
import com.bjpowernode.entity.Student;
import org.junit.Test;

import java.util.List;

public class TestMyBatis {

    @Test
    public void testSelectStudent(){
        StudentDao dao = new StudentDaoImpl();
        List<Student>   studentList = dao.selectStudents();
        for (Student s :studentList){
            System.out.println(s);
        }
    }
}
