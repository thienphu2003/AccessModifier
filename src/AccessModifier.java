public class AccessModifier {
    private final double pi =3.14;
    private double radius =1.0;
    private String color ="red";
    public AccessModifier(){};
    public AccessModifier(double radius)
    {
        this.radius=radius;
    }
    protected double getRadius()
    {
        return this.radius;
    }
    protected double getArea()
    {
        return this.getRadius()*this.getRadius()*this.pi;
    }
}

