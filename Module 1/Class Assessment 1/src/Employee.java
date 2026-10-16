public class Employee {
    int emp_id;
    String name;
    double salary;
    double hra;
    String role;
    double bonus;

  Employee(int id,String name,double salary,double hra,String role){
    this.emp_id=id;
    this.name=name;
    this.salary=salary;
    this.hra=hra;
    this.role=role;
    this.bonus=0.0;
  }  
}