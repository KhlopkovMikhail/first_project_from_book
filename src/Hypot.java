/*
   Использование теоремы Пифагора для нахождения
   длинны гипотенузы по длинам двух катетов.
 */
class Hypot {
    public static void main(String[] args) {
        double x, y, z;
        x = 3;
        y = 4;
        z = Math.sqrt(x*x + y*y);
        System.out.println("Длина гипотенузы: " +z);
    }
}
