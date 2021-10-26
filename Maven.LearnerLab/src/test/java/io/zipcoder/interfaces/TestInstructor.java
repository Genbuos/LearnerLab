package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestInstructor {
    @Test
    public void testLecture(){
        Instructor instructor = new Instructor(4l,"Peter");
        Student[] arrayOfStudents = new Student[3];
        Student student = new Student(0l,"Brian");
        Student student1 = new Student(1l,"Cynthia");
        Student student2 = new Student(2l, "Marlena");
        arrayOfStudents[0] = student;
        arrayOfStudents[1] = student1;
        arrayOfStudents[2] = student2;

        instructor.lecture(arrayOfStudents,2);

         Double actualStudyTime = ;
         Double expectedST = 2.0;



        Assert.assertEquals(expectedST, actualStudyTime);






    }
    @Test
    public void testTeach(){
        Student student = new Student(3l,"Jordan");

        Instructor instructor = new Instructor(2l,"Mikaila");
        instructor.teach(student,4);

        Double expected = student.getTotalStudyTime();
        Double actual = 4.0;


        Assert.assertEquals(expected,actual);
    }

    @Test
    public void testInheritance(){
        Instructor instructor = new Instructor(1l,"Ivan");
        Assert.assertTrue(instructor instanceof Person);
    }

    @Test
    public void testImplementation(){

        Instructor instructor = new Instructor(0l,"Jaiden");
        Assert.assertTrue(instructor instanceof Teacher);
    }
}
