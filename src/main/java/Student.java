import java.util.Arrays;

public class Student {
     String name;
     String id;
     String[] courses;
     int numOfCourses;
     int[] grades;

    public Student(String name, String id) {
        this.name = name;
        this.id = id;
        courses = new String[10];
        grades = new int[10];
        numOfCourses = 0;
    }
    public String getId() {
        if (id ==null){
            return null;
        }
        else
        return this.id;
    }
    public int addGrade(String course, int grade) {
        if (Arrays.asList(courses).contains(course)){
            for (int i=0 ; i<courses.length; i++){
                if (courses[i].equals(course)){
                    grades[i] = grade;
                    return grades[numOfCourses-1];
                }
            }


        }
        else {
            courses[numOfCourses] = course;
            grades[numOfCourses] = grade;
            numOfCourses++;
        }


        return grades[numOfCourses-1];
    }
    public int getHighestGrade() {
        if (numOfCourses ==0){
            return 0;
        }
        else{
            int max = grades[0];
            for(int i = 1; i < grades.length;i++) {
                if(grades[i] > max){
                max = grades[i];
                }
            }
            return max;
        }

    }

    public int changeGrade(String course, int grade) {
        if (Arrays.asList(courses).contains(course)){
            for (int i=0 ; i<courses.length; i++){
                if (courses[i].equals(course)){
                    grades[i] = grade;
                    return grades[i];
                }
            }
        }

        return 0;


    }

    public static void main(String[] args) {
        Student st = new Student("Arsen","B65");
        st.getId();
        st.addGrade("Math",90);
        st.getHighestGrade();
        st.changeGrade("science",89);
    }
}
