package cn.edu.ncu.springboot2.implement;

import cn.edu.ncu.springboot2.dao.TeacherDao;
import cn.edu.ncu.springboot2.entity.Teacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeacherImp {
    @Autowired
    private TeacherDao teacherDao;

    public List<Teacher> getAllTeacher() {
        List<Teacher> teacherList = teacherDao.getAllTeacher();
        return teacherList;
    }

}
