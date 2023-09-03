import main.Main;
import org.junit.Test;

public class caseTest {
    @Test
    public void removeElementTest(){
        int[] arr = {1, 2, 2, 3, 4, 5};

        System.out.println(Main.removeElement(arr, 2));
    }
}
