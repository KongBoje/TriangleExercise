package triangleTester;

import org.junit.*;
import static org.junit.Assert.assertEquals;
import triangleex.Triangles;

public class TriangleTest {
    
    Triangles t = new Triangles();
    String equiliteral = "You got an Equiliteral Triangle";
    String isosceles = "You got an Isosceles Triangle";
    String scalene = "You got a Scalene Triangle";
    String none = "Not a valid triangle";
    
    @Test
    public void triangleTest() throws Exception{
        assertEquals(equiliteral, t.triangleSides(9,9,9));
        assertEquals(isosceles, t.triangleSides(9,9,7));
        assertEquals(scalene, t.triangleSides(9,7,6));
        assertEquals(none, t.triangleSides(9,8,0));
    }
    
}
