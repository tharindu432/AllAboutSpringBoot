package demo.ruwanpathiranatc.demo1_ruwanpathiranatc.controller;

import demo.ruwanpathiranatc.demo1_ruwanpathiranatc.bean.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
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
    // http://localhost:8080/students/1/tharindu/ruwanpathirana
    @GetMapping("students/{id}/{first-name}/{last-name}")
public  Student studentPathVariable(
        @PathVariable("id") int studentId,
        @PathVariable("first-name") String firstName,
        @PathVariable("last-name") String lastName
    ){
        return new Student(studentId,firstName,lastName);
}

//springboot REST API wth request Param
    //@RequestParam
//http://localhost:8080/students/query?id=1
    @GetMapping("students/query")
    public Student studentRequestVariable(@RequestParam int id){
        return new Student(id, "tharindu","ruwanpathirana");
    }

}
