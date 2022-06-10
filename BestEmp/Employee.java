public class Employee {
    //the publice method
    private String fname;
    private String lname;
    private int age;
    
    //constructor
    public Employee(String fname,String lname, int age) {
        this.fname = fname;
        this.lname = lname;
        this.age = age;
    }
    //the getter function
    public String getFullName(){
        return this.fname+" "+this.lname;
    }
    //getting the first name
    public String getFName() {
        return this.fname;

    }
    //getting the last name
    public String getLName() {
        return this.lname;
    }
    //getting the age
    public int getAge() {
        return this.age;
    }
    //setter function
    public void setAge(int age) {
        this.age = age;
    }
    public void setFName(String fname) {
        this.fname = fname;
    }
    public void setLName(String lname) {
        this.lname = lname;
    }
    
}
