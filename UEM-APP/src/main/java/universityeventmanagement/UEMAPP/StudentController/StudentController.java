package universityeventmanagement.UEMAPP.StudentController;

import org.springframework.web.bind.annotation.*;
import universityeventmanagement.UEMAPP.Event.Event;
import universityeventmanagement.UEMAPP.EventService.EventService;
import universityeventmanagement.UEMAPP.StudentService.StudentService;
import universityeventmanagement.UEMAPP.Sudent.Student;

import java.util.List;
@RestController
@RequestMapping("student-app/v1")
public class StudentController {
    private  final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("find-all-student")
    public List<Student> findAllStudent(){
        return studentService.getAllStudent();
    }
    @GetMapping("find-by-id/{id}")
    public Student  findStudentById(@PathVariable int id) {
        return studentService.findStudentById(id);
    }



    @DeleteMapping("delete-student-id/{id}")
    public void deleteStudent(@PathVariable int id){
        studentService.deleteStudent(id);
    }
    @PostMapping("add-student")
    public void addStudent(@RequestBody Student student) {
        studentService.addStudent(student);
    }
    @PutMapping("update-Student/{id}")
    public void updateStudent(@PathVariable int id,@RequestBody Student student) {
        studentService.uodateStudent(id,student);
    }
}
