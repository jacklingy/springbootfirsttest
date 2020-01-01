package cn.edu.ncu.springboot2.dao;

import cn.edu.ncu.springboot2.entity.Student;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface StudentDao {
     List<Student> getAllStudent();
     void addStudent(Student student);
     void deleteStudent(int id,String name);
     void updateStudent(int originId,String name,String gender,int age);

}
