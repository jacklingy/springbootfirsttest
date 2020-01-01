package cn.edu.ncu.springboot2.implement;

import cn.edu.ncu.springboot2.dao.StudentDao;
import cn.edu.ncu.springboot2.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentImp  {

    @Autowired
    private StudentDao studentDao;


    public List<Student> getAllStudent() {
        List<Student> studentList = studentDao.getAllStudent();
        return studentList;
    }

    public void addStudent(Student student){
        studentDao.addStudent(student);
    }

    public void deleteStudent(int id, String name){
        studentDao.deleteStudent(id,name);
    }

    public void updateStudent(int originId,String name,String gender,int age){
        studentDao.updateStudent(originId,name,gender,age);
    }
}
