import org.junit.Test;
import static org.junit.Assert.*;

public class testStudent {
    @Test
    public void testGetId(){
        String id = "A98";
        Student s = new Student("Ani",id);
        assertEquals(id,s.getId());


    }

    @Test
    public void testGetId2(){
        String id = null;
        Student s = new Student("Ani",id);
        assertEquals(id,s.getId());


    }
    @Test
    public void testAddGrade(){
        String course = "Art";
        int grade = 70;
        String id = "A90";
        Student s = new Student("Anna",id);
        assertEquals(grade,s.addGrade(course,grade));


    }
    @Test
    public void testAddGrade2(){
        String course = "Art";
        int grade = 90;
        String id = "A90";
        Student s = new Student("Anna",id);
        s.addGrade(course,grade);
        assertEquals(grade,s.addGrade(course,grade));


    }
    @Test
    public void testGetHighestGrade(){
        String course = "Math";
        String course2 = "PE";
        int grade = 80;
        int grade2 = 60;
        String id = "A80";
        Student s = new Student("Anna",id);
        s.addGrade(course,grade);
        s.addGrade(course2,grade2);
        assertEquals(grade,s.getHighestGrade());


    }
    @Test
    public void testGetHighestGrade2(){

        String course = null;
        int grade = 0;

        String id = "A89";
        Student s = new Student("Ani",id);
        assertEquals(grade,s.getHighestGrade());


    }

    @Test
    public void testChangeGrade(){

        String course = "Math";
        int grade = 89;
        int grade2 = 50;

        String id = "A99";
        Student s = new Student("Aram",id);
        s.addGrade(course,grade);
        assertEquals(grade2,s.changeGrade(course,grade2));



    }
    @Test
    public void testChangeGrade2(){

        String course = "Math";
        int grade = 0;


        String id = "A39";
        Student s = new Student("Aramazd",id);
        assertEquals(grade,s.changeGrade(course,grade));



    }

}
