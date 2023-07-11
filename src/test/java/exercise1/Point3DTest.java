package exercise1;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class Point3DTest {

    @Test
    void shouldReturnStringValueOfArray(){
        // given
        Point3D point = new Point3D(3.4f, 2.1f, -4.1f);

        // when
        float[] coordinates = point.getXYZ();
        String result = point.toString();
        String expected = "(3,400000, 2,100000, -4,100000)";

        // then
        assertEquals(expected, result);
    }
    @Test
    void shouldReturnArrayOfThreeElementsXYZ(){
        // given
        Point3D point = new Point3D(3.4f, 2.1f, -4.1f);

        // when
        float[] coordinatesArray = point.getXYZ();

        // then
        assertThat(coordinatesArray).contains(3.4f, 2.1f, -4.1f);
    }
}