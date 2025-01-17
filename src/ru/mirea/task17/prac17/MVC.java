package ru.mirea.task17.prac17;

public class MVC {
    public static void main(String[] args){
        Employee model = retriveEmployeeFromDatabase();
        EmployeeView view = new EmployeeView();
        EmployeeContoller controller = new EmployeeContoller(model, view);
        controller.updateView();
        controller.setEmployeeName("Petr");
        controller.setEmployeeSurname("Ivanov");
        System.out.println("After updating");
        controller.updateView();
    }
    private static Employee retriveEmployeeFromDatabase(){
        Employee employee = new Employee();
        employee.setName("Ivan");
        employee.setSurname("Petrov");
        employee.setSalary(35000);
        employee.setId(13);
        return employee;
    }
}