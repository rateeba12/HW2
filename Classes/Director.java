package Classes;

import java.util.List;

public class Director {
    Employee employee;
    List <Manager> managers ;
    List <Staff> staffs;

    Director (String id,String name, int age, float hourlyRate, float totalCompletedHoursForMonth, List <Manager> managers, List <Staff> staffs){
        this.employee = new Employee(id,name,age,hourlyRate,totalCompletedHoursForMonth);
        this.managers= managers;
        this.staffs= staffs;
    }

    public List<Staff> getStaffs() {
        return staffs;
    }

    public String getId() {
        return this.employee.getId();
    }

    }


