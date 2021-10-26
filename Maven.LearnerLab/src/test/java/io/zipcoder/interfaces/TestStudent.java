package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestStudent {


    @Test
    public void TestLearn(){
        Student student = new Student(2l,"mike");
        student.learn(30.0);

       Double actual = student.getTotalStudyTime();
       Double expected = 30.0;

       Assert.assertEquals(expected,actual);
    }


    @Test
    public void TestInheritance(){
        Student student = new Student(1l,"kate");
        Assert.assertTrue(student instanceof Person);
    }

    @Test
    public void Testimplementation(){
        Long id = 0l;
        String name = "Daya";
        Student student = new Student(id,name);

        Assert.assertTrue(student instanceof Learner);
    }
}
