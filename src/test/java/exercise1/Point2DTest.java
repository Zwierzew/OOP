package exercise1;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
//import static org.assertj.core.api.FactoryBasedNavigableListAssert.assertThat;

public class Point2DTest{

    @Test
    void shouldReturnArrayOfTwoElementsXY(){
        // given
        Point2D pointA = new Point2D();
        pointA.setX(3.5f);
        pointA.setY(4.5f);

        Point2D pointB = new Point2D(1.0f, 2.0f);

        // when
        float[] tableA = pointA.getXY();
        float[] tableB = pointB.getXY();

        // then
        assertThat(tableA).contains(3.5f,4.5f);
        assertThat(tableB).contains(1.0f, 2.0f);
    }
    @Test
    void shouldReturnStringValueOfArray(){
        // given
        Point2D pointA = new Point2D();
        pointA.setX(3.5f);
        pointA.setY(4.5f);

        Point2D pointB = new Point2D(1.0f, 2.0f);

        // when
        String resultA = pointA.toString();
        String resultB = pointB.toString();
        String expectedA = "(3.500000, 4.500000)";
        String expectedB = "(1.000000, 2.000000)";

        // then
        assertEquals(expectedA,resultA);
        assertEquals(expectedB, resultB);
    }
}