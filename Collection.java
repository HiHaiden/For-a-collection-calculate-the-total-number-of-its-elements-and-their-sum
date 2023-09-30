import java.util.ArrayList;
import java.util.Collection;

public class laba2 {
    public static void main(String[] args) {

        // Создаем коллекцию для демонстрации
        Collection col1 = createCollection();

        int sum = 0;

        // Демонстрация прохода по коллекции
        System.out.println("======= Проход по коллекции");
        for(Object o : col1) {
            System.out.println("Item:" + o);
            String str = String.valueOf(o);
            int wat = Integer.parseInt(str);
            sum += wat;
        }
        System.out.println("======= Подсчет результатов");
        System.out.println("Сумма элементов в коллекции: " + sum);
        System.out.println("Количество элементов в коллекции: " + col1.size());
        System.out.println("Наибольший общий делитель: " + gcd(sum, col1.size()));
        System.out.println("Наименьшее общее кратное: " + lcm(sum, col1.size()));

        // Удаление коллекции
        System.out.println("======= Очистка коллекции - не будет элементов");
        col1.clear();
        for(Object o : col1) {
            System.out.println("Item:" + o);
        }
        System.out.println();
    }
    // Коллекция
    private static Collection createCollection() {
        // Создать коллекцию на основе стандартного класса ArrayList
        Collection col = new ArrayList();
        // Добавление в коллекцию
        col.add("1");
        col.add("2");
        col.add("3");
        col.add("4");
        col.add("5");
        col.add("6");
        col.add("7");
        col.add("8");
        col.add("9");
        col.add("10");
        return col;
    }

    // Нахождение найбольшего общего делителя
    static long gcd(long a,long b){
        return b == 0 ? a : gcd(b,a % b);
    }

    // Нахождение найменьшего общего кратного
    static long lcm(long a,long b){
        return a / gcd(a,b) * b;
    }
}