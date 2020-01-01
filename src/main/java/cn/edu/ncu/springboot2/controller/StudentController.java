package cn.edu.ncu.springboot2.controller;


import cn.edu.ncu.springboot2.dao.StudentDao;
import cn.edu.ncu.springboot2.dao.TeacherDao;
import cn.edu.ncu.springboot2.entity.Student;
import cn.edu.ncu.springboot2.entity.Teacher;
import cn.edu.ncu.springboot2.implement.StudentImp;
import cn.edu.ncu.springboot2.implement.TeacherImp;
import com.alibaba.fastjson.JSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/student")
public class StudentController {
    @Autowired
    private StudentDao studentDao;

    @Autowired
    private StudentImp studentImp;

    @Autowired
    private TeacherImp teacherImp;

    //  private Student student;
    private List<Student> studentList;


    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public String showHelloWorld() {

        //Map<String,Object> map=new HashMap<>();
        // map.put("msg","Hello Spring!");
        studentList = studentImp.getAllStudent();
        String studentListJson = JSON.toJSONString(studentList);
        return studentListJson;
    }

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String addStudent(@RequestParam(value = "name") String name,
                             @RequestParam(value = "gender") String gender,
                             @RequestParam(value = "age") int age) {
        Student student = new Student(name, gender, age);
        studentImp.addStudent(student);
        return "插入学生成功！\n姓名是：" + name + "\n性别是：" + gender + "\n年龄是：" + age;
    }
    @RequestMapping(value = "/delete",method = RequestMethod.GET)
    public String deleteStudent(@RequestParam(value = "id")int id,
                                @RequestParam(value = "name") String name){
        studentImp.deleteStudent(id,name);
        return "删除学生成功！\nid是："+id+"\n姓名是："+name;

    }
    @RequestMapping(value = "/update",method = RequestMethod.GET)
    public String updateStudent(@RequestParam(value = "originId")int originId,
                                @RequestParam(value = "name") String name,
                                @RequestParam(value = "gender") String gender,
                                @RequestParam(value = "age")int age){
        Student student=new Student(name,gender,age);
        studentImp.updateStudent(originId,name,gender,age);
        return "update success!";
    }



}
