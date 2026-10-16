public class Bonus_service{

    // step 1:final bonus rate base on role
    public void Calculate_bonus(Employee e){
        double bonus_rate=0;
        double bonus_amount=0;
        if ("manager".equalsIgnoreCase(e.role)) {
    bonus_rate = 12;
} 
else if ("admin".equalsIgnoreCase(e.role)) {
    bonus_rate = 10;
} 
else if ("engineer".equalsIgnoreCase(e.role)) {
    bonus_rate = 12;
}
 else if ("accountant".equalsIgnoreCase(e.role)) {
    bonus_rate = 8;
} else {
    System.out.println("Invalid role: " + e.role);
    return;
}

    // step 2:calculate bonus_amount
    bonus_amount=((e.salary+e.hra)*(bonus_rate/100));

    // step3: store in employee bonus amount
     e.bonus=bonus_amount;
    }
}
