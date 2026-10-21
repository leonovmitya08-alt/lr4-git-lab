import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Демонстрационное консольное приложение для работы
 * с иерархией комнатных растений.
 *
 * @author Student
 * @version 1.0
 */
public class Main {

    /**
     * Точка входа. Создаёт список растений и выполняет три выборки:
     * красивоцветущие, растения с малым сроком жизни,
     * папоротники выше заданной высоты.
     *
     * @param args аргументы командной строки (не используются)
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Создание списка растений
        List<Plant> plants = new ArrayList<>();
        plants.add(new FloweringPlant("Орхидея Фаленопсис", 40, 7, 60));
        plants.add(new FloweringPlant("Фиалка", 10, 3, 120));
        plants.add(new FloweringPlant("Антуриум", 50, 6, 90));
        plants.add(new FloweringPlant("Спатифиллум", 60, 8, 45));
        plants.add(new FloweringPlant("Гибискус", 120, 20, 30));
        plants.add(new Succlent("Алоэ Вера", 30, 3));
        plants.add(new Succlent("Кактус Эхинокактус", 15, 50));
        plants.add(new Succlent("Толстянка (Денежное дерево)", 45, 10));
        plants.add(new Paporotniki("Нефролепис", 55, 4));
        plants.add(new Paporotniki("Адиантум (Венерин волос)", 25, 3));
        plants.add(new Paporotniki("Платицериум (Олений рог)", 80, 15));

        // Вывод красивоцветущих
        System.out.println("=== КРАСИВОЦВЕТУЩИЕ ===");
        for (Plant p : plants) {
            if (p instanceof FloweringPlant) {
                System.out.println(p);
            }
        }

        // Растения с продолжительностью жизни менее 5 лет
        System.out.println("\n=== ЖИЗНЬ МЕНЕЕ 5 ЛЕТ ===");
        for (Plant p : plants) {
            if (p.GetLifeSpan() < 5) {
                System.out.println(p);
            }
        }

        // Папоротники выше заданной высоты
        System.out.print("\nВведите минимальную высоту папоротника (см): ");
        double targetHeight = scanner.nextDouble();

        System.out.println("\n=== ПАПОРОТНИКИ ВЫШЕ " + targetHeight + " СМ ===");
        boolean found = false;
        for (Plant p : plants) {
            if (p instanceof Paporotniki && p.GetHeight() > targetHeight) {
                System.out.println(p);
                found = true;
            }
        }
        if (!found) {
            System.out.println("Папоротников выше заданной высоты не найдено.");
        }

        scanner.close();
    }
}