package HW2;

public class MainEmps {
    public static void main(String[] args) {
        Employee emp1 = new Employee();
        emp1.name = "Josh";
        emp1.surname = "Hark";
        emp1.email = "tr@rt";
        emp1.phone = 555433;
        emp1.age = 30;
        emp1.position = "SR.Engineer";
        emp1.salary = 8500;

        Employee emp2 = new Employee();
        emp2.name = "Mike";
        emp2.surname = "Sallivan";
        emp2.email = "sal@sol";
        emp2.phone = 343434;
        emp2.age = 50;
        emp2.position="HR General";
        emp2.salary=9000;

        Employee emp3 = new Employee();
        emp3.name= "Alex";
        emp3.surname="Burton";
        emp3.email="alex@jur";
        emp3.phone=888001;
        emp3.age=60;
        emp3.position="Vice President";
        emp3.salary=15000;

        Employee[] emps = new Employee[3];
        emps[0]=emp1;
        emps[1]=emp2;
        emps[2]=emp3;


        for (int i = 0; i < emps.length; i++) {
            if(emps[i].age>40){
                emps[i].empInfo();
            }

        }


    }
}
