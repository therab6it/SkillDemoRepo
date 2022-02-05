import static org.junit.Assert.*;
import org.junit.*;

public class SkillDemoTester {
    @Test
    public void recommender() {
        assertEquals("This catalog isn't available yet :(", 
            SkillDemo.songRecommender("CSGO", 1));
    }
}