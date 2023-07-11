package exercise1;
/**
Na podstawie klasy Point2D zaimplementuj klasę Point3D. Klasa ta powinna rozszerzać klasę Point2D
oraz dodawać następującą implementację:
    * pole prywatne typu float: z
    * konstruktor przyjmujący wartości dla pól: x , y , z
    * metodę typu getter odpowiedzialną za zwracanie wartości zmiennej z
    * metodę getXYZ zwracającą współrzędne x , y , z w postaci tablicy trzyelementowej
    * metodę typu setter odpowiedzialną za ustawianie zmiennej z
    * metodę setXYZ ustawiającą wartości dla zmiennych x , y , z
    * metoda toString powinna zwracać łańcuch tekstowy o następującym formacie: (x, y, z) ;
 */
public class Point3D extends Point2D{
    private float z;

    public Point3D(float x, float y, float z){
        super(x, y);
        this.z = z;
    }
    @Override
    public String toString(){
        return String.format("(%f, %f, %f)", getX(), getY(), z);
    }
    public float getZ(){
        return z;
    }
    public void setZ(float newZ){
        this.z = newZ;
    }
    public float[] getXYZ(){
        return new float[]{getX(), getY(), z};
    }
    public void setXYZ(float newX, float newY, float newZ){
        super.setX(newX);
        super.setY(newY);
        this.z = newZ;
    }
}
