package Builder;

public class Student {
   //Required
    private int rollNumber;
    private String name;

    //optional
    private String email;
    private String address;



    private Student(StudentBuilder builder){
        rollNumber = builder.rollNumber;
        name = builder.name;
        email = builder.email;
        address = builder.address;

    }

    public int getRollNumber() {
        return rollNumber;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getAddress() {
        return address;
    }

    public static class StudentBuilder{

        private int rollNumber;
        private String name;

        //optional
        private String email;
        private String address;

        public StudentBuilder(int rollNumber, String name)
        {
            this.rollNumber = rollNumber;
            this.name = name;
        }

        public StudentBuilder setEmail(String email) {
            this.email = email;
            return this;
        }

        public StudentBuilder setAddress(String address) {
            this.address = address;
            return this;
        }

        public Student build()
        {
            return new Student(this);
        }

    }


}
