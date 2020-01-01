package cn.edu.ncu.springboot2.controller;

import cn.edu.ncu.springboot2.entity.Teacher;
import cn.edu.ncu.springboot2.implement.TeacherImp;
import com.alibaba.fastjson.JSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/teacher")
public class TeacherController {
    private List<Teacher> teacherList;

    @Autowired
    private TeacherImp teacherImp;

    @RequestMapping(value = "/all", method = RequestMethod.POST)
    public String showHelloWorld2() {

        teacherList = teacherImp.getAllTeacher();
        String teacherListJson = JSON.toJSONString(teacherList);
        return teacherListJson;
    }
}
