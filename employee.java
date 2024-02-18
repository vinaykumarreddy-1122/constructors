public class employee {
    String name;
    int empid;
    String dept;
    public employee(String name, int empid, String dept) {
        this.name = name;
        this.empid = empid;
        this.dept = dept;
    }
    public employee() {
        
    }
    public String getName() {
        return name;
    }
    public int getEmpid() {
        return empid;
    }
    public String getDept() {
        return dept;
    }
    @Override
    public String toString() {
        return "employee [name=" + name + ", empid=" + empid + ", dept=" + dept + "]";
    }
    
    
}
