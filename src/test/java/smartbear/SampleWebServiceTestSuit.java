package smartbear;

import com.smartbear.*;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class SampleWebServiceTestSuit {

    static SampleWebService sampleWebService = new SampleWebService();
    static SampleWebServiceSoap port = sampleWebService.getSampleWebServiceSoap();


    @Test
    public static void Test1() {
        Assert.assertEquals(port.helloWorld(), "Hello World", "Actual response isn`t equal to expected");
    }

    @Test
    public static void Test2() {
        System.out.println("-------------------------------");
        System.out.println("Current time: " + port.getCurrentTime());
        System.out.println("-------------------------------");
    }

    @Test
    public static void Test3() {
        ArrayOfInt arrayOfInt = port.getArray();
        List<Integer> value = arrayOfInt.getInt();

        Assert.assertEquals(value.size(), 10, "Actual array size isn`t equal to expected");
    }

    @Test
    public static void Test4() {
        ArrayOfInt arrayOfInt = port.getArray();
        List<Integer> value = arrayOfInt.getInt();
        List<Integer> expected = new ArrayList<>();

        Integer i = 0;
        while (i < 10) {
            expected.add(i);
            ++i;
        }

        Assert.assertTrue(value.toString().contentEquals(expected.toString())?true:false,
                "Actual array size isn`t equal to expected");
    }

    @Test
    public static void Test5() {
        String name = "TestingName";
        double x = 888.8;
        double y = 000.0;
        int no = 20;

        SampleTestClass sampleTestClass = port.getSampleObject(no);

        sampleTestClass.setName(name);
        sampleTestClass.setX(x);
        sampleTestClass.setY(y);

        Assert.assertEquals(sampleTestClass.getName(), name, "Actual name isn`t equal to expected");
        Assert.assertEquals(sampleTestClass.getX(), x, "Actual 'X' value isn`t equal to expected");
        Assert.assertEquals(sampleTestClass.getY(), y, "Actual 'Y' value isn`t equal to expected");
    }

    @Test
    public static void Test6() {
        SampleTestClass sampleTestClass = port.getSampleObject(40);

        Assert.assertEquals(sampleTestClass.getName(), "TestComplete Sample", "Actual name isn`t equal to expected");
        Assert.assertEquals( sampleTestClass.getX(), 4.47213595499958,"Actual 'X' value isn`t equal to expected");
        Assert.assertEquals(sampleTestClass.getY(), 400.0, "Actual 'Y' value isn`t equal to expected");
    }
}
