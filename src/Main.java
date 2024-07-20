import Builder.Student;
import Prototype.Employee;
import Singleton.SingletonWithEagerLoading;
import Singleton.SingletonWithLazyLoading;

public class Main {
    public static void main(String[] args) {


        // Eager Loading Singleton
        SingletonWithEagerLoading singleton1 = SingletonWithEagerLoading.getInstance();
        System.out.println("First Object : "+singleton1);

        SingletonWithEagerLoading singleton2 = SingletonWithEagerLoading.getInstance();
        System.out.println("Second Object : "+singleton2);


        //Lazy Loading Singleton

        SingletonWithLazyLoading singleton3 = SingletonWithLazyLoading.getInstance();
        System.out.println("Third Object : "+singleton3);

        SingletonWithLazyLoading singleton4 = SingletonWithLazyLoading.getInstance();
        System.out.println("Third Object : "+singleton4);


        // Builder Design Pattern

        Student student1 = new Student.StudentBuilder(76,"Ajay").setEmail("ajay.gidd@gmail.com").setAddress("Bangalore").build();

        System.out.println("name : " +student1.getName());
        System.out.println("email : "+student1.getEmail());

        Student student2 = new Student.StudentBuilder(99,"Akshay").build();

        System.out.println("name : " +student2.getName());
        System.out.println("email : "+student2.getEmail());


        // Prototype

        Employee employee1 = new Employee(1239391, "Ajay","9890259196","Bangalore");
        System.out.println(employee1.getEmployeeId());

        Employee employee1Clone = (Employee) employee1.clone();

        System.out.println(employee1Clone.getName());
    }
}

