package exercise1;
/**
Zaimplementuj klasę Point2D . Klasa powinna zawierać:
   * dwa pola typu float: x , y
   * konstruktor bezparametrowy ustawiający wartość pól x i y na 0,
   * konstruktor z dwoma parametrami: float x , i float y
   * metody typu getter odpowiedzialne za zwracanie wartości zmiennej: x , y
   * metodę getXY zwracającą współrzędne x i y w postaci tablicy dwuelementowej
   * metody typu setter odpowiedzialne za ustawianie wartości pól x i y,
   * metodę setXY ustawiającą współrzędne x i y
   * metoda toString powinna zwracać łańcuch tekstowy o następującym formacie: (x, y) ;
 */
public class Point2D {
    private float x;
    private float y;
    public static int counter;

    public Point2D(){
        this.x = 0;
        this.y = 0;
    }

    public Point2D(float x, float y){
        this.x = x;
        this.y = y;
        counter++;
    }
    @Override
    public String toString(){
        return String.format("(%f, %f)", x, y);
    }
    public float getX(){
        return x;
    }
    public void setX(float newX){
        this.x = newX;
    }

    public float getY(){
        return y;
    }
    public void setY(float newY){
        this.y = newY;
    }
    public float[] getXY(){
        return new float[]{x, y};
    }
    public void setXY(float newX, float newY){
        this.x = newX;
        this.y = newY;
    }
}
