import restaurant.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Employee e1 = new Employee("Ali", "09015446545", "chef", 12_000_000);
        Employee e2 = new Employee("Sara", "09028456456", "accountant", 10_000_000);
        Employee e3 = new Employee("Mehdi", "09035528795", "waiter", 8_000_000);

        e1.addHoursWorked(175);
        e2.addHoursWorked(160);
        e3.addHoursWorked(190);

        Customer c1 = new Customer("Armin", "09116675975");
        Customer c2 = new Customer("Nima", "09126872143");
        Customer c3 = new Customer("Maryam", "09134548654");
        Customer c4 = new Customer("Sina", "09146625698");
        Customer c5 = new Customer("Hoda", "09150025365");

        Food f1 = new Food(1, "Pizza", 400_000, "Medium", 25);
        Food f2 = new Food(2, "Burger", 350_000, "Mild", 15);
        Beverage b1 = new Beverage(3, "Tea", 60_000, "large", "hot");
        Beverage b2 = new Beverage(4, "Soda", 50_000, "medium", "cold");
        Beverage b3 = new Beverage(5, "Coffee", 80_000, "small", "hot");

        List<Customer> customers = new ArrayList<>();
        customers.add(c1);
        customers.add(c2);
        customers.add(c3);
        customers.add(c4);
        customers.add(c5);

        List<MenuItem> menu = new ArrayList<>();
        menu.add(f1);
        menu.add(f2);
        menu.add(b1);
        menu.add(b2);
        menu.add(b3);

        for (Customer c : customers) {
            Order o1 = new Order(c);
            o1.addItem(f1);
            o1.addItem(b1);
            o1.calculateTotal();
            System.out.println(o1.getOrderSummary());
            System.out.println("--------------");

            Order o2 = new Order(c);
            o2.addItem(f2);
            o2.addItem(b2);
            o2.addItem(b3);
            o2.calculateTotal();
            System.out.println(o2.getOrderSummary());
            System.out.println("--------------");

            Order o3 = new Order(c);
            o3.addItem(f1);
            o3.addItem(f2);
            o3.addItem(b3);
            o3.calculateTotal();
            System.out.println(o3.getOrderSummary());
            System.out.println("==============");
        }

        Customer mostLoyal = customers.get(0);
        for (Customer c : customers) {
            if (c.getLoyaltyPoints() > mostLoyal.getLoyaltyPoints()) {
                mostLoyal = c;
            }
        }

        System.out.println();
        System.out.println("Most loyal customer:");
        System.out.println(mostLoyal.getInfo());
        System.out.println();

        System.out.println("Employees:");
        System.out.println(e1.getInfo() + ", Salary: " + e1.calculateSalary());
        System.out.println(e2.getInfo() + ", Salary: " + e2.calculateSalary());
        System.out.println(e3.getInfo() + ", Salary: " + e3.calculateSalary());
        System.out.println();

        System.out.println("Menu:");
        for (MenuItem m : menu) {
            System.out.println(m.getDetails());
        }
    }
}
