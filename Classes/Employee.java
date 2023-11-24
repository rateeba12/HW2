package Classes;

public class Employee {
    String id;
    String name;
    int age;
    float hourlyRate;
    float totalCompletedHoursForMonth;

    public Employee(String id, String name, int age, float hourlyRate, float totalCompletedHoursForMonth) {
        this.id=id;
        this.age= age;
        this.name = name;
        this.hourlyRate= hourlyRate;
        this.totalCompletedHoursForMonth = totalCompletedHoursForMonth;
    }

    public String getId() {
        return this.id;
    }
}
