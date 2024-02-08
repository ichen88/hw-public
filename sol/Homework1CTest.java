package sol;

import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import java.util.LinkedList;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Homework1CTest {
    Course csci200 = new Course("CSCI", 200, 1.0);
    Course neur10 = new Course("NEUR", 10);
    Course csci17 = new Course("CSCI", 17, 1.0);
    Course engl900 = new Course("ENGL", 900, 0.5);

    LinkedList<Course> spikeCourses = new LinkedList<Course>();
    Student jaya = new Student("Jaya", csci17, neur10);
    Student izzy = new Student("Izzy", csci200, engl900);
    Student ella = new Student("Ella", engl900, neur10);

    LetterGrade yay = new LetterGrade(Letter.A);
    GradeReport izzyGrades =
            new GradeReport(izzy, csci200, yay);
    GradeReport jayaGrades =
            new GradeReport(jaya, neur10, new SNCGrade(SNC.NC));
    GradeReport izzyCGrade =
            new GradeReport(izzy, csci17, new LetterGrade(Letter.C));
    GradeReport izzyGradesBad =
            new GradeReport(izzy, engl900, new LetterGrade(Letter.NC));
    GradeReport jayaGradesGood =
            new GradeReport(jaya, csci200, new SNCGrade(SNC.S));
    GradeReport jayaGradesSGood =
            new GradeReport(jaya, csci200, new SNCGrade(SNC.SDIST));
    GradeReport jayaCS17Great =
            new GradeReport(jaya, csci17, new SNCGrade(SNC.SDIST));
    GradeReport izzyCS17Grade =
            new GradeReport(izzy, csci17, yay);
    SNCGrade congrats = new SNCGrade(SNC.S);
    SNCGrade whoa = new SNCGrade(SNC.SDIST);
    SNCGrade oops = new SNCGrade(SNC.NC);
    LetterGrade ohC = new LetterGrade(Letter.C);
    TA sid = new TA("Sid", csci200, neur10, csci17);
    TA kim = new TA("Kim", engl900, neur10, csci200);

    /**
     * tests if we can make a GradeReport properly
     */
/*    @Test
    public void testGradeReport() {
        Assert.assertEquals(izzy, izzyGrades.forStudent);
        Assert.assertEquals(neur10, jayaGrades.forCourse);
        Assert.assertTrue(izzyGrades.grade.isPassing());
        Assert.assertFalse(jayaGrades.grade.isPassing());
        Assert.assertFalse(izzyGradesBad.grade.isPassing());
        Assert.assertTrue(jayaGradesGood.grade.isPassing());
        Assert.assertTrue(jayaGradesSGood.grade.isPassing());
    }*/

    /**
     * Tests if we can make an SNCGrade properly
     */
/*    @Test
    public void testMakeSNCGrade() {
        Assert.assertTrue(congrats.pass);
        Assert.assertFalse(congrats.passDistinction);
        Assert.assertTrue(whoa.pass);
        Assert.assertTrue(whoa.passDistinction);
        Assert.assertFalse(oops.pass);
        Assert.assertFalse(oops.passDistinction);
    }*/

    /**
     * Tests if we can make a LetterGrade properly
     */
/*    @Test
    public void testMakeLetterGrade() {
        Assert.assertEquals(Letter.A, yay.grade);
    }*/

    /**
     * Tests if we can make a TA properly
     */
/*    @Test
    public void testMakeTA() {
*//*        Assert.assertEquals(csci17, sid.assisting);*//*
        Assert.assertTrue(sid.isTaking(csci200));
        Assert.assertFalse(sid.isTaking(engl900));
        Assert.assertFalse(sid.isTaking(csci17));
    }*/

    /**
     * Tests viewGrade() method
     */
/*    @Test
    public void testGradeRep() {
        Assert.assertEquals("A", sid.viewGrade(izzyCS17Grade));
        Assert.assertEquals("S*", kim.viewGrade(jayaGradesSGood));
        Assert.assertEquals("A", spike.viewGrade(izzyCS17Grade));
    }*/

    /**
     * Tests IllegalArgumentException in the TA Constructor
     */
/*    @Test(expected = IllegalArgumentException.class)
    public void testInvalidTACourses1() {
        TA jack = new TA("jack", neur10, csci17, neur10);
    }*/

    /**
     * Tests IllegalArgumentException in the TA Constructor
     */
/*    @Test(expected = IllegalArgumentException.class)
    public void testInvalidTACourses2() {
        TA jack = new TA("jack", neur10, csci17, csci17);
    }*/

    /**
     * Tests RunTimeException for viewGrade() from the TA class
     */
/*    @Test(expected = RuntimeException.class)
    public void testInvalidTACanView() {
        sid.viewGrade(izzyGrades);
    }*/

    /**
     * Tests RunTimeException for viewGrade() from the Faculty class
     */
/*    @Test(expected = RuntimeException.class)
    public void testInvalidFacultyCanView() {
        spike.viewGrade(izzyGrades);
    }*/

    /**
     * Tests making a gradebook - need to make gradebook field in course public
     * to test
     */
/*    @Test
    public void makeGradebook() {
        csci17.gradebook.add(izzyCS17Grade);
        csci17.gradebook.add(jayaCS17Great);
        LinkedList<GradeReport> list1 = new LinkedList<GradeReport>();
        list1.add(izzyCS17Grade);
        list1.add(jayaCS17Great);
        Assert.assertEquals(list1, csci17.gradebook);
    }*/

    /**
     * Tests storeGrade - note: make findGradeReport() public to be able to run this
     * test
     */
/*    @Test
    public void testStoreGrade() {
        csci17.storeGrade(izzy, yay);
        Assert.assertTrue(csci17.findGradeReport("Izzy").equals(izzyCS17Grade));
    }*/

    /**
     * tests findGradeReport() - note: make findGradeReport() public to be able to
     * run this test
     */
/*    @Test
    public void testUpdateGrade() {
        csci17.storeGrade(izzy, new LetterGrade(Letter.B));
        csci17.storeGrade(jaya, new SNCGrade(SNC.SDIST));
        csci17.updateGrade("Izzy", yay);
        csci17.updateGrade("Jaya", new LetterGrade(Letter.C));
        Assert.assertTrue(csci17.findGradeReport("Izzy").equals(izzyCS17Grade));
        Assert.assertFalse(csci17.findGradeReport("Jaya").equals(jayaCS17Great));

    }*/

    /**
     * testing gradeLookup() method
     */
    @Test
    public void testGradeLookup() {
        csci17.storeGrade(izzy, yay);
        csci17.storeGrade(jaya, whoa);
        spikeCourses.add(csci17);
        Faculty spike = new Faculty("Prof Spike", "CSCI", spikeCourses);
        Assert.assertEquals("A", csci17.gradeLookup(spike, "Izzy"));
        csci17.updateGrade("Izzy", new LetterGrade(Letter.B));
        Assert.assertEquals("B", csci17.gradeLookup(spike, "Izzy"));
        Assert.assertEquals("S*", csci17.gradeLookup(spike, "Jaya"));
    }

    /**
     * testing gradeLookup() exceptions
     */
    @Test(expected = RuntimeException.class)
    public void testInvalidGradeLookUp1() {
        LinkedList<Course> stanleyCourses = new LinkedList<Course>();
        stanleyCourses.add(engl900);
        Faculty stanley = new Faculty("Prof Stanley", "ENGL", stanleyCourses);
        csci17.storeGrade(izzy, yay);
        csci17.gradeLookup(stanley, "Izzy");
    }
    @Test(expected = RuntimeException.class)
    public void testInvalidGradeLookUp2() {
        LinkedList<Course> stanleyCourses = new LinkedList<Course>();
        stanleyCourses.add(engl900);
        Faculty stanley = new Faculty("Prof Stanley", "ENGL", stanleyCourses);
        csci17.gradeLookup(stanley, "Izzy");
    }
    @Test(expected = RuntimeException.class)
    public void testInvalidGradeLookUp3() {
        spikeCourses.add(csci17);
        Faculty spike = new Faculty("Prof Spike", "CSCI", spikeCourses);
        csci17.storeGrade(izzy, yay);
        csci17.gradeLookup(spike, "Jaya");
    }

    @Test
    public void testReportsWithC() {
        csci17.storeGrade(izzy, new LetterGrade(Letter.C));
        csci17.storeGrade(ella, congrats);
        csci17.storeGrade(jaya, ohC);
        Assert.assertTrue(izzyCGrade.boolC());
        Assert.assertEquals(2, csci17.reportsWithC().size());
        csci17.updateGrade("Ella", ohC);
        Assert.assertEquals(3, csci17.reportsWithC().size());
    }



}