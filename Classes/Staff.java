package Classes;

public class Staff {
    Employee employee;

    Staff (String id,String name, int age, float hourlyRate, float totalCompletedHoursForMonth){
        this.employee = new Employee(id,name,age,hourlyRate,totalCompletedHoursForMonth);
    }

   public  String getName(){
     return employee.name;
    }

    public String getId(){
        return this.employee.getId();
    }
}
