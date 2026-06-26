public class SalesEmployee extends Employee {
    private double comission;

    public SalesEmployee(String id, String name, double salary, double comission) {
        super(id, name, salary);
        this.comission = comission;
    }

    public double getComission() {
        return comission;
    }

    public void setComission(double comission) {
        this.comission = comission;
    }

    @Override
    public double calculateSalary() {
        return super.calculateSalary() + comission;
    }

    

    
}
