/*
   Вычесляет количество кубических дюймов в кубической миле.
 */
class Inches {
    public static void main(String[] args) {
        long ci;
        long im;
        im = 5280 * 12;
        ci = im * im * im;
        System.out.println("В кубической миле содержится " + ci + " кубических дюймов.");
    }
}
