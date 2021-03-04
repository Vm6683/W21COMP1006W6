import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {

    private Rectangle rectangle;
    private Rectangle square;

    @BeforeEach
    void setUp() {
        rectangle = new Rectangle(10,20);
        square = new Rectangle(20,20);
    }

    @Test
    void getPerimeter() {
        // Recatange us  10 * 20
        // perimeter is 10 + 10 + 20 + 20 = 60
        assertEquals(60, rectangle.getPerimeter());
    }

    @Test
    void getArea() {
        // Rectangel 10 * 20 = 200
        assertEquals(200, rectangle.getArea());
    }

    @Test
    void setLength() {
        rectangle.setLength(50);
        assertEquals(50,rectangle.getLength());
    }

    @Test
    void setLengthInvalidLow() {
        try {
            rectangle.setLength(0);
            fail("lentha of 0 should have triggered an exception");
        } catch (IllegalArgumentException e)
        {
            System.out.println(e.getMessage());
        }
        assertEquals(0,rectangle.getLength());
    }


    @Test
    void setWidth() {
    }
}