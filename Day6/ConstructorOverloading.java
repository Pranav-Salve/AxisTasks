/*
 * same using Constructor Overloading
 * 
 * task3 include constructor overloading and this keyword
    =>userinfoUsingConstructure
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
        //include constructor overloading
 */

class ConstructorOverloading {
    public String name, place;
    public String companyName;
    private int userId;
    protected byte age;
    private String position;

    ConstructorOverloading(){
        System.out.println("Default Constructor");
    }

    ConstructorOverloading(String name, int userId, String companyName, String place, byte age, String position){
        this.name = name;
        this.userId = userId;
        this.companyName = companyName;
        this.place = place;
        this.age = age;
        this.position = position;
    }

    void displayUser(){
        System.out.println("Employee Details using ConstructorOverloading:\n");
        System.out.println("Name: "+name);
        System.out.println("UserId: "+userId);
        System.out.println("CompanyName: "+companyName);
        System.out.println("Place: "+place);
        System.out.println("Age: "+age);
        System.out.println("Position: "+position);
    }

    public static void main(String args[]){
        ConstructorOverloading Obj1 = new ConstructorOverloading("Pranav", 001, "Axis", "Mumbai", (byte) 23, "IT Deputy Manager");

        Obj1.displayUser();
    }
}