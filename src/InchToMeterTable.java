/*
  Адаптация упражнения 1.2.
  Эта программа отображает таблицу преобразований дюймов в метры.
  Назовите этот файл InchToMeterTable.java.
 */
class InchToMeterTable {
    public static void main(String[] args) {
        double inches, meters;
        int counter;
        counter = 0;
        for(inches = 1; inches <= 12 * 12; inches++) {
            meters = inches / 39.37; // преобразование в метры
            System.out.println(inches + " дюймов соответствует " + meters + " метрам.");
            counter++;
            // После каждой 10-й строки вывести пустую строку
            if(counter == 12) {
                System.out.println();
                counter = 0; // сброс счётчика строк
            }
        }
    }
}
