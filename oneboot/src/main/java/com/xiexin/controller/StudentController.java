package com.xiexin.controller;

import com.xiexin.bean.Student;
import com.xiexin.respcode.Result;
import com.xiexin.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
@RequestMapping("/student")
public class StudentController {
    @Autowired
    private StudentService studentService;

    // 全查  注意 不用map， 公司中 都用  一个 类， 好几类组成的类， 叫做
    // 统一响应类， 每个公司都不一样。
    @RequestMapping("/selectAll") // /student/selectAll
    public Result selectAll(){
        List<Student> students = studentService.selectByExample(null);// select * from student
        Result  result =new Result(students);
        return result;
    }

    //  （带参数的）分页查询
    @RequestMapping("/selectPageAll")
    public Result selectPageAll(){

        return null;
    }
}
