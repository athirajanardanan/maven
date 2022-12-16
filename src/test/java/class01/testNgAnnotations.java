package class01;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class testNgAnnotations {
    @Test(priority=3 ,groups="regression")
    public void firstTest()
    {
        System.out.println("First test case");
    }
    @Test
    public void secTestCase()
    {
        System.out.println("Second test case");
    }
    @Test
    public void thirdTestCase()
    {
        System.out.println("Third test case");
    }
    @BeforeMethod
    public void test()
    {
        System.out.println("IAm before method");
    }
    @AfterMethod
    public void aftertest()
    {
        System.out.println("IAm after method");
    }
}
