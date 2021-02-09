public class Employee {
    public int id;
    public String name;
    public String lastname;
    public int salary;

    public Employee(int id, String name, String lastname, int salary){
        this.id=id;
        this.name=name;
        this.lastname=lastname;
        this.salary=salary;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return name;
    }

    public String getLastname() {
        return lastname;
    }

    public String getName() {
        return name+lastname;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getAnnualSalary() {
        return salary*12    ;
    }



    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                ", salary=" + salary +
                '}';
    }
}
