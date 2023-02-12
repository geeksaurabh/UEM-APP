package universityeventmanagement.UEMAPP.Sudent;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Student {
    private int StudentId;
    private String firstName;
    private String lastName;
    private int age;
    private String   department;
}
