package smartbear;

import com.smartbear.*;
import org.testng.Assert;
import org.testng.annotations.Test;
import javax.xml.datatype.XMLGregorianCalendar;
import java.util.List;

public class SampleWebServiceTestSuit {

    static SampleWebService sampleWebService = new SampleWebService();
    static SampleWebServiceSoap port = sampleWebService.getSampleWebServiceSoap();
    static Testhelper testhelper = new Testhelper();

    @Test
    public static void Test1() {
        Assert.assertEquals(port.helloWorld(), "Hello World", "Actual response isn`t equal to expected");
    }

    @Test
    public static void Test2() {
        XMLGregorianCalendar date = port.getCurrentTime();

        Assert.assertTrue(testhelper.checkingDateformat(date), "Response format doesn`t match");
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

        Assert.assertTrue(value.toString().contentEquals(testhelper.setDataToCollection(10).toString())?true:false,
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
        Assert.assertEquals( sampleTestClass.getX(), 6.324555320336759,"Actual 'X' value isn`t equal to expected");
        Assert.assertEquals(sampleTestClass.getY(), 1600.0, "Actual 'Y' value isn`t equal to expected");
    }
}
