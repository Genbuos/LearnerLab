package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;
import io.zipcoder.interfaces.Person;
public class TestPerson {


    @Test
    public void TestsetName(){
        String name = "Sonja";
        Long id = 1l;
        Person person = new Person(id,name);
        person.setName("Jaida");

        String actual = person.getName();
        String expected = "Jaida";

        Assert.assertEquals(actual,expected);


    }
    @Test
    public void TestConstructer(){
        long id = 0l;
        String name = "Sonja";
        Person person = new Person(id,name);
        person.setName(name);

        Long actualID = person.getId();
        String actualName = person.getName();

        Long expectedID = 0l;
        String expectedName = "Sonja";



        Assert.assertEquals(actualID,expectedID);
        Assert.assertEquals(expectedName,actualName);
    }

}
