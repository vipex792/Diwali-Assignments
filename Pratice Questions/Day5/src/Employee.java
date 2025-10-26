public class Employee {
    String empName;
    int empID;
    String empRole;

    // 1️⃣ No-argument constructor
    public Employee() {
        empID = 0;
        empName = "Unknown";
        empRole = "Not Assigned";
    }

    // 2️⃣ Constructor with empID and empName (empRole hardcoded)
    public Employee(int empID, String empName) {
        this.empID = empID;
        this.empName = empName;
        this.empRole = "Developer"; // hardcoded default role
    }

    // 3️⃣ Constructor with empID, empName, empRole
    public Employee(int empID, String empName, String empRole) {
        this.empID = empID;
        this.empName = empName;
        this.empRole = empRole;
    }

    // 4️⃣ Override toString
    public String toString() {
        return "Employee ID: " + empID + ", Name: " + empName + ", Role: " + empRole;
    }

    // Optional helper
    public int getEmpID() {
        return empID;
    }

    public String getEmpName() {
        return empName;
    }
}
