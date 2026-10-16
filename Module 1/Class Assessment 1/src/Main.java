import java.util.ArrayList;
import java.util.List;
import java.util.Comparator;
import java.util.Collections;
public class Main{
    public static void main(String[]args){
        List<Employee>employees=new ArrayList<>();
        employees.add(new Employee(1,"ashish",12000,5000,"manager"));
        employees.add(new Employee(2,"sushil",20000,5000,"engineer"));
        employees.add(new Employee(3,"aman",30000,5000,"accountant"));

         Bonus_service service=new Bonus_service();
         for(Employee e:employees){
          service.Calculate_bonus(e);    
    }
    employees.sort(Comparator.comparingDouble(e -> e.bonus));
    Collections.reverse(employees);
     for(Employee e:employees){
        System.out.println(
            e.emp_id+" "+
            e.name+" "+
            e.salary+" "+
            e.hra+ " "+
            e.role+ " "+
            e.bonus
        );
    }
    }   
}
