import java.util.*;
import java.io.*;

public class EmployeeMenu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Employee> list = new ArrayList<>();

        while (true) {
            System.out.println("\n===== Employee Menu =====");
            System.out.println("1. Add Employee");
            System.out.println("2. Remove Employee");
            System.out.println("3. Show All Employees");
            System.out.println("4. Show Employees (Sorted by ID)");
            System.out.println("5. Find Employee by Name");
            System.out.println("6. Save Employees to File");
            System.out.println("7. Quit");
            System.out.print("Enter your choice: ");
            int ch = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (ch) {
                case 1:
                    System.out.print("Enter Employee ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Employee Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Employee Role: ");
                    String role = sc.nextLine();
                    list.add(new Employee(id, name, role));
                    System.out.println("✅ Employee added successfully!");
                    break;

                case 2:
                    System.out.print("Enter Employee ID to remove: ");
                    int removeId = sc.nextInt();
                    boolean found = false;
                    for (int i = 0; i < list.size(); i++) {
                        if (list.get(i).getEmpID() == removeId) {
                            list.remove(i);
                            found = true;
                            System.out.println("🗑️ Employee removed!");
                            break;
                        }
                    }
                    if (!found) System.out.println("Employee not found!");
                    break;

                case 3:
                    if (list.isEmpty())
                        System.out.println("No employees in the list.");
                    else {
                        System.out.println("\n--- Employee List ---");
                        for (Employee e : list)
                            System.out.println(e);
                    }
                    break;

                case 4:
                    if (list.isEmpty())
                        System.out.println("No employees to sort!");
                    else {
                        list.sort(Comparator.comparingInt(Employee::getEmpID));
                        System.out.println("\n--- Sorted Employee List ---");
                        for (Employee e : list)
                            System.out.println(e);
                    }
                    break;

                case 5:
                    System.out.print("Enter Employee Name to search: ");
                    String searchName = sc.nextLine();
                    boolean nameFound = false;
                    for (Employee e : list) {
                        if (e.getEmpName().equalsIgnoreCase(searchName)) {
                            System.out.println("✅ Found: " + e);
                            nameFound = true;
                        }
                    }
                    if (!nameFound)
                        System.out.println("No employee found with that name.");
                    break;

                case 6:
                    try {
                        FileWriter fw = new FileWriter("employees.txt");
                        for (Employee e : list)
                            fw.write(e.toString() + "\n");
                        fw.close();
                        System.out.println("💾 Employees saved to file successfully!");
                    } catch (IOException e) {
                        System.out.println("Error saving file!");
                    }
                    break;

                case 7:
                    System.out.println("👋 Exiting program...");
                    return;

                default:
                    System.out.println("Invalid choice! Try again.");
            }
        }
    }
}
