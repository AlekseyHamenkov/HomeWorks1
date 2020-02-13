package ru.geekbrains.Hamenkov_HomeWorks1;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }
    // Создать переменные всех пройденных типов данных, и инициализировать их значения
    static void one() {
        byte val = -120;
        short val1 = 12442;
        int val2 = 1000;
        long val3 = 200000L;
        float val4 = 12.23f;
        double val5 = -123.123;
        char val6 = '\u2242';
        boolean val7 = true;
    }
    // 3. Написать метод вычисляющий выражение a * (b + (c / d)) и возвращающий результат,
    // где a, b, c, d – входные параметры этого метода, имеющие тип float.
    public static float two(float a, float b, float c, float d) {
        float v = a * (b + (c / d));
        return v;
    }

    // 4. Написать метод, принимающий на вход два целых числа и проверяющий,
    // что их сумма лежит в пределах от 10 до 20 (включительно), если да – вернуть true, в противном случае – false.
    public static boolean three(int a, int b) {
        int sum = a + b;
        if(sum > 10 && sum < 20) return true;
        else return false;
    }
    // Написать метод, которому в качестве параметра передается целое число, метод должен напечатать в консоль,
    // положительное ли число передали или отрицательное. Замечание: ноль считаем положительным числом.
    public static void four () {
        int a = '1';
        if(a >= 0) {
            System.out.println("Число " + " положительное");
        }
    }

    // Написать метод, которому в качестве параметра передается целое число.
    // Метод должен вернуть true, если число отрицательное.
    public static boolean five() {
        int a = -4;
        if(a < 0);
        return true;
    }

    // Написать метод, которому в качестве параметра передается строка, обозначающая имя.
    // Метод должен вывести в консоль сообщение «Привет, указанное_имя!».
    public static void six () {
        String name = ("Galaxy");
        System.out.println("Привет " + " name");
    }
}
