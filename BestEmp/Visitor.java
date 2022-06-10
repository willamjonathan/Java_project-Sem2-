public class Visitor {
    //private variables ; can't be accessed directly by user
    private String firstName;
    private String lastName;
    private String gender;
    private int password;
    private Vote myvote;
    //the public method
    //constructor
    public Visitor(String f, String l,String gender,int password){
        this.firstName = f;
        this.lastName = l;
        this.gender = gender;
        this.password = password;
    }
    //the getter function
    //getting first name
    public String getFirstName(){
        return this.firstName;
    }
    //getting last name
    public String getLastName(){
        return this.lastName;
    }
    //getting the gender
    public String getGender(){
        return this.gender;
    }
    //getting the password
    public int getPassword(){
        return this.password;
    }
    //method that is used to set Vote 
    public void setMyVote(Vote myvote){
        this.myvote = myvote;      
    }
    //getting the vote
    public Vote getMyVote(){
        return myvote;
    }
    //setter function
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public void setGender(String gender){
        this.gender = gender;
    }
    
}
