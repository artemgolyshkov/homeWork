public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
         for(int i = 0; i <= 10; i = i + 1){
            System.out.println("Итерация цикла " + i);
        }
        System.out.println("Задача 2");
         for(int y = 10; y > 0; y = y - 1){
            System.out.println("Итерация цикла " + y);
        }
        System.out.println("Задача 3");
         for(int x = 0; x <= 17; x = x + 2){
            System.out.println("Итерация цикла " + x);
        }
        System.out.println("Задача 4");
         for(int z = 10; z >= -10; z = z - 1){
            System.out.println("Итерация цикла " + z);
        }
        System.out.println("Задача 5");
         for(int c = 1904; c <= 2096; c = c + 4){
            System.out.println(c + " год является високосным");
        }
        System.out.println("Задача 6");
         for(int v = 7; v <= 98; v = v + 7){
            System.out.println(v);
        }
        System.out.println("Задача 7");
         for(int w = 1; w <= 512; w = w * 2){
            System.out.println(w);
        }
        System.out.println("Задача 8");
         int amountSavings = 29000;
         int total = 0;
         for(int q = 0; q < 12; q++){
            total = total + amountSavings;
            System.out.println("Месяц " + q + " сумма накоплений равна " + total + " рублей");
         }
        System.out.println("Итого " + total);
        System.out.println("Задача 9");
         int salary = 29000;
         int total1 = 0;
         for (int a = 0; a < 12; a++) {
            total1 = total1 + total1/100;
            total1 = total1 + salary;
            System.out.println("Месяц " + a + " сумма накоплений равна " + total1 + " рублей");
         }
         System.out.println("Итого " + total1);
        System.out.println("Задача 10");
         int r = 0;
         for(int t = 2; t <= 20; t = t + 2) {
             r = r + 1;
             System.out.println("2 * " + r + " = " + t);
         }

    }
}