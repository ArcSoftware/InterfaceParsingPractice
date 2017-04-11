import com.ArcSoftware.Person;
import com.ArcSoftware.Repository;
import org.junit.Test;

import static junit.framework.TestCase.assertTrue;

/**
 * Created by Jake on 4/11/17.
 */
public class MainTests {

    @Test
    public void testGetRepository() throws Exception {
        Repository something = new Repository();


        assertTrue(something.getCount() == 1000 );
    }
}
