package smartbear;

import javax.xml.datatype.XMLGregorianCalendar;
import java.util.ArrayList;
import java.util.List;

public class Testhelper {

    public boolean checkingDateformat(XMLGregorianCalendar date) {
        String input = String.valueOf(date);
        boolean checkformat;

        if (input.matches("([0-9]{4})-([0-9]{2})-([0-9]{2})([\\w]{1})([0-9]{2}):([0-9]{2}):([0-9]{2}).([0-9]{6})-([0-9]{2}):([0-9]{2})")) {// for yyyy/MM/dd format
            checkformat = true;
            return checkformat;
        } else {
            checkformat = false;
            return checkformat;
        }
    }

    public List<Integer> setDataToCollection(int x) {
        List<Integer> expected = new ArrayList<>();

        Integer i = 0;
        while (i < x) {
            expected.add(i);
            ++i;
        }
        return expected;
    }
}
