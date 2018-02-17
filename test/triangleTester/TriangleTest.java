package triangleTester;

import org.junit.*;
import static org.junit.Assert.assertEquals;
import triangleex.Triangles;

public class TriangleTest {
    
    Triangles t;
    String Equiliteral;
    String Isosceles;
    String Scalene;
    String none;
    
    public TriangleTest() {
    }
    
    @Before
    public void setUp() {
        t = new Triangles();
        String Equiliteral = "You got an Equiliteral Triangle";
        String Isosceles = "Isosceles triangle";
        String Scalene = "Scalene triangle";
        String none = "Not a valid triangle";
    }
    
    @Test
    public void triangleTest() throws Exception{
        assertEquals(Equiliteral, t.triangleSides(9,9,9));
        assertEquals(Isosceles, t.triangleSides(9,9,7));
        assertEquals(Scalene, t.triangleSides(9,7,6));
        assertEquals(none, t.triangleSides(9,8,0));
    }
    
}
