/*
 * Userinfo: name(public), userId(private),
 *           companyName(public), place(public),
 *           age(protected), position(private)
 * 
 * createUser()
 * displayUser()
 */

class EmployeeDetails{
    public String name, place;
    public String companyName;
    private int userId;
    protected byte age;
    private String position;

    void createUser(String name, int userId, String companyName, String place, byte age, String position){
        this.name = name;
        this.userId = userId;
        this.companyName = companyName;
        this.place = place;
        this.age = age;
        this.position = position;
    }

    void displayUser(){
        System.out.println("Employee Details:\n");
        System.out.println("Name: "+name);
        System.out.println("UserId: "+userId);
        System.out.println("CompanyName: "+companyName);
        System.out.println("Place: "+place);
        System.out.println("Age: "+age);
        System.out.println("Position: "+position);
    }

    public static void main(String args[]){
        EmployeeDetails Obj1 = new EmployeeDetails();

        Obj1.createUser("Pranav", 001, "Axis", "Mumbai", (byte) 23, "IT Deputy Manager");
        Obj1.displayUser();
    }
}