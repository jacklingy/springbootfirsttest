package cn.edu.ncu.springboot2.dao;

import cn.edu.ncu.springboot2.entity.Teacher;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface TeacherDao {
    List<Teacher> getAllTeacher();
}
