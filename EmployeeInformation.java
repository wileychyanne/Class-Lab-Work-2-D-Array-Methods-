public class EmployeeInformation {
    public static void main(String[] args) {
        String[][] employees = {
                {"John", "Manager", "HR"},
                {"Mary", "Developer", "IT"},
                {"Peter", "Accountant", "Finance"},
                {"Sarah", "Analyst", "IT"}
        };
        System.out.println("\nALL EMPLOYEE INFORMATION:");
        for (int i = 0; i < employees.length; i++) {
            for (int j = 0; j < employees[i].length; j++) {
                System.out.print(employees[i][j] + "\t");
            }
            System.out.println();
        }
        //display only the names of IT employees
        System.out.println("\nEMPLOYEES WORKING IN IT DEPARTMENT:");
        for (int i = 0; i < employees.length; i++) {
            if (employees[i][2].equals("IT")) {
                System.out.println(employees[i][0]);
            }
        }
        //count the number of employees in each department
        int hr = 0;
        int it = 0;
        int finance = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i][2].equals("HR")) {
                hr++;
            }
            else if (employees[i][2].equals("IT")) {
                it++;
            }
            else {
                finance++;
            }
        }
        //display the count
        System.out.println("\nNUMBER OF EMPLOYEES IN EACH DEPARTMENT:");
        System.out.println("HR: " + hr);
        System.out.println("IT: " + it);
        System.out.println("Finance: " + finance);
    }
}
