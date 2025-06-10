/*
  Программа для расчёты фактического веса на луне
  Вводные: Сила тяжести на луне 17% от земной
 */
class Earth_Moon {
    public static void main(String[] args) {
        double myWeight = 105;
        double myWeightOnTheMoon = myWeight * 17 / 100;
        System.out.println("Мой вес на луне составляет " + myWeightOnTheMoon + " килограмм");
    }
}
