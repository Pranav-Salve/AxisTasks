/*
 * same with parameterized Constructor
 * 
 * task2 implement using constructor
 *   =>userinfoUsingConstructure
        name;public
        userid;private
        companyname;public
        place;public
        age;protected
        position;private
        //typeofmethod you can deci
        add construtor
        //createuser();
        displayuser();//display all info
 */

class ParameterizedConstructor {
    public String name, place;
    public String companyName;
    private int userId;
    protected byte age;
    private String position;

    ParameterizedConstructor(String name, int userId, String companyName, String place, byte age, String position){
        this.name = name;
        this.userId = userId;
        this.companyName = companyName;
        this.place = place;
        this.age = age;
        this.position = position;
    }

    void displayUser(){
        System.out.println("Employee Details using ParameterizedConstructor:\n");
        System.out.println("Name: "+name);
        System.out.println("UserId: "+userId);
        System.out.println("CompanyName: "+companyName);
        System.out.println("Place: "+place);
        System.out.println("Age: "+age);
        System.out.println("Position: "+position);
    }

    public static void main(String args[]){
        ParameterizedConstructor Obj1 = new ParameterizedConstructor("Pranav", 001, "Axis", "Mumbai", (byte) 23, "IT Deputy Manager");
        Obj1.displayUser();
    }
}