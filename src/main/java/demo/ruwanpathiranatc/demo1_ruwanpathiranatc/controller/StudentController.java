package demo.ruwanpathiranatc.demo1_ruwanpathiranatc.controller;

import demo.ruwanpathiranatc.demo1_ruwanpathiranatc.bean.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

//rest api to get student object into json format
@RestController
public class StudentController {
    @GetMapping("/student")
    public Student getStudent(){
        Student student = new Student(
                1,
                "tharindu",
                "chathuranga"
        );
        return student;
    }

    //rest api to get students list object into json format
    @GetMapping("/students")
    public List<Student> getStudents(){
        List<Student> students = new ArrayList<>();
        students.add(new Student(1,"tharindu","ruwanpathirana") );
        students.add(new Student(2,"nuwani","hansi") );
        students.add(new Student(3,"chathuranga","ruwanpathirana") );
        return students;
    }

    //spring boot rest API with path variable
    //{id} - URI template variable
    // http://localhost:8080/students/1
    @GetMapping("students/{id}")
public  Student studentPathVariable(@PathVariable("id") int studentId){
        return new Student(studentId,"ruwanpathirana","tharindu");
}

}
