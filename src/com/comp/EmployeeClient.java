package com.comp;

public class EmployeeClient {
    public static void main(String[] args) {
        Employee[] r = {new Lawyer(), new Secretary(), new Marketer(), new LegalSecretary()};
        for (int i = 0; i < r.length; i++){
            printInfo(r[i]);
        }
    }

    public static void printInfo(Employee e){
        System.out.println("salary: "+e.getSalary());
        System.out.println("vacation days: "+e.getVacationDays());
        System.out.println("favorite lemonade type: "+e.getVacationForm());
        System.out.println();
    }
}
