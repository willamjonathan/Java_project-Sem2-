import java.util.LinkedList;

public class Election {
    //private variables 
    //declaring the Visitor and Employee class in a Linked List; as there are multiple data that will be added
    private LinkedList<Visitor> visitors;
    private LinkedList<Employee> employees;
    //to keep track of the number of employee and number of visitor, later on it is for getting the data from the linkedlist
    private int numberOfEmployee;
    private int numberOfVisitors;
    private String monthName;

    //defaut constructor
    public Election(String mName){
        this.visitors = new LinkedList<Visitor>();
        this.employees = new LinkedList<Employee>();
        this.monthName = mName;
    }
    
    //the method that is used to add the employee
    public void addVisitor(String f,String l,String gender,int password){
        Visitor visitor = new Visitor(f,l,gender,password);
        this.visitors.add(visitor);//appending it to the linkedlist
        numberOfVisitors +=1;//incrementing the numb of visitor
        
    }
    //the method that is used to add the employee
    public void addEmployee(String fName, String lName, int age){
        Employee employee = new Employee(fName,lName,age);
        this.employees.add(employee);//appendiing it to the linked list
        numberOfEmployee +=1;//incrementing the numb of employee
    }
    // The getter function
    public int getNumberOfEmployees(){
        return numberOfEmployee;
    }
    public int getNumberOfVisitors(){
        return numberOfVisitors;
    }
    //to get the index of the employee
    public Employee getEmployeeIndex(int id){
        return this.employees.get(id);
    }
    //to get the index of the visitor
    public Visitor getVisitorIndex(int index){
        return this.visitors.get(index);
    }
    //to get the mont name
    public String getMonthName(){
        return this.monthName;
    }


}
