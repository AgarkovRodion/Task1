public class QuadraticEquation {
    private double x1;
    private double x2;
    private double discriminant;
    public double a;
    public double b;
    public double c;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getX1() {
        return x1;
    }

    public double getX2() {
        return x2;
    }


    private void countDiscriminant() {
        discriminant = Math.pow(a, 2) - 2 * a * b - Math.pow(c, 2);

    }

    public void countRadical() {
        countDiscriminant();
        if (discriminant < 0) {
            throw new QudraticException("Нет корней");
        } else if (discriminant == 0) {
            x1 = -b / 2 * a;
            System.out.println(String.format("Корень равен %.3f" , x1));
        } else if (discriminant > 0) {
            x1 = (-b + Math.sqrt(discriminant) / 2 * a);
            x2 = (-b - Math.sqrt(discriminant) / 2 * a);
            System.out.println(String.format("Первый корень равен %.3f", x1));
            System.out.println(String.format("Второй корень равен %.3f", x2));
        }
    }
}
