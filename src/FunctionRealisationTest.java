import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FunctionRealisationTest {

    @Test(expected = IllegalArgumentException.class)
    public void isPersonsListNull() {
        FunctionRealisation.order(null, TestData.IDS);
    }

    @Test(expected = IllegalArgumentException.class)
    public void isIdsNull() {
        FunctionRealisation.order(TestData.PERSONS, null);
    }

    @Test
    public void process() {
        Class<?> toClass = FunctionRealisation.class;
        List<Person> persons = new ArrayList<>();
        try {
            Method process = toClass.getDeclaredMethod("process", List.class, int[].class);
            process.setAccessible(true);
            persons = (List<Person>) process.invoke(null, (List<Person>)TestData.PERSONS, TestData.IDS);
        } catch (NoSuchMethodException e1){}
        catch (IllegalAccessException e2) {}
        catch (InvocationTargetException e3){}
        assertEquals(TestData.SORTED_PERSONS, persons);
    }
}