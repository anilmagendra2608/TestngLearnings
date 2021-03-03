import org.testng.annotations.*;

public class TestNGAnnotationExecutionSeq {

    // Sequence of Annotation execution listed below
    @BeforeSuite
    public void testBeforeSuite() {
        System.out.println("@BeforeSuite Called");
    }

    @BeforeTest
    public void testBeforeTest() {
        System.out.println("@BeforeTest Called");
    }

    @BeforeClass
    public void testBeforeClass() {
        System.out.println("@BeforeClass Called");
    }

    @BeforeMethod
    public void testBeforeMethod() {
        System.out.println("@BeforeMethod Called");
    }

    @Test
    public void testTest() {
        System.out.println("@Test Called");
    }

    @AfterMethod
    public void testAfterMethod() {
        System.out.println("@AfterMethod Called");
    }

    @AfterClass
    public void testAfterClass(){
        System.out.println("@AfterClass Called");
    }

    @AfterTest
    public void testAfterTest(){
        System.out.println("@AfterTest Called");
    }

    @AfterSuite
    public void testAfterSuite(){
        System.out.println("@AfterSuite Called");
    }
}
