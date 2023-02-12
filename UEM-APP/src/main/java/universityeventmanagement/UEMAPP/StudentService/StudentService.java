package universityeventmanagement.UEMAPP.StudentService;

import org.springframework.stereotype.Service;
import universityeventmanagement.UEMAPP.Event.Event;
import universityeventmanagement.UEMAPP.Sudent.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
@Service
public class StudentService {

    public static List<Student> students=new ArrayList<>();

    static{
        students.add(new Student(1,"Saurabh","pandey",22,"Civil"));
        students.add(new Student(2,"raj","pandey",23,"electrical"));
        students.add(new Student(3,"alok","shukla",24,"mechanical"));
        students.add(new Student(4,"nitesh","awasthi",25,"computer science"));
        students.add(new Student(5,"tarang","kapoor",23,"electronics"));
    }



//    Add student
//    update student department
//    delete student
//    Get all students
//    Get student by Id

    public  List<Student> getAllStudent(){
        return students;
    }

    public Student findStudentById(int id){
        for(Student u:students){
            if(u.getStudentId()==id) {
                return u;
            }
        }
        return null;
    }
    public void deleteStudent(int id){
        Predicate<? super Student> predicate = user -> user.getStudentId() == id;
        students.removeIf(predicate);
    }
    public void addStudent(Student student) {
        students.add(student);
    }
    public void uodateStudent(int studentId,Student newStudent) {


        Student student=findStudentById(studentId);


        student.setFirstName(newStudent.getFirstName());

    }

}
