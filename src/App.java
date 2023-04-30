import Classes.Laptop;
import Classes.*;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.jar.Attributes.Name;

public class App {
    public static void main(String[] args) throws Exception {
        Market market = new Market();
        market.addItem(new Laptop("HP", "15s-eq2xxx", "Ubuntu 22.04.1 LTS", "Grey",16, 512));
        market.addItem(new Laptop("Apple", "MacBook Pro", "MS-dos", "Silver",16, 512));
        market.addItem(new Laptop("MSI", "GP72 7RDX Leopard", "Windows 10", "Black",16, 1000));
        market.addItem(new Laptop("Asus", "ROG Zephyrus G15", "Windows 11", "Black",32, 1000));

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите цифру критерия: \n1 - ОЗУ\n2 - Объем ЖД\n3 - Операционная система\n4 - Цвет " );
        String filterValue = scanner.nextLine();

        System.out.println("Введите минимальное значение для заданного критерия:"  + filterValue);
        String minValueCriterion = scanner.nextLine();
        scanner.close();
        
        HashMap<String,String> fil = new HashMap<>();
        fil.put(market.getFilterValue(filterValue), minValueCriterion);

        List<Laptop> fList = market.LaptopFilter(fil);
        if (fList.isEmpty()) {
            System.out.println("Ничего не найдено");
        } else {
            System.out.println("Найденые ноутбуки: ");
            fList.forEach(Laptop::printInfo);
        }
    }
}
