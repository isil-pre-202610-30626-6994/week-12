public class SupportEmployee extends Employee {
    private int overtimeHours;

    public SupportEmployee(String id, String name, double salary, int overtimeHours) {
        super(id, name, salary);
        this.overtimeHours = overtimeHours;
    }

    public int getOvertimeHours() {
        return overtimeHours;
    }

    public void setOvertimeHours(int overtimeHours) {
        this.overtimeHours = overtimeHours;
    }

    @Override
    public double calculateSalary() {
        return super.calculateSalary() + (overtimeHours * 20);
    }

    
    

}
