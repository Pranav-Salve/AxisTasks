package Day11.Task4;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Map.Entry;

public class helperClass extends Student implements helperClassInterface{
    // helperClass helperObj = new helperClass();
    helperClass arrayStudent[];
    HashMap<Integer, Student> StudentMap = new HashMap<Integer, Student>();
    Scanner sc = new Scanner(System.in);
    
    @Override
    public void addStudent() {
        helperClass helperObj = new helperClass();
        
        System.out.print("Enter roll no: ");
        int rollNo = sc.nextInt();

        if (!StudentMap.containsKey(rollNo)) {
            System.out.print("Enter Student's name: ");
            helperObj.name = sc.next();
            System.out.print("Enter college: ");
            helperObj.college = sc.next();
            System.out.print("Enter place: ");
            helperObj.place = sc.next();
            System.out.print("Enter branch: ");
            helperObj.branch = sc.next();

            StudentMap.put(rollNo, helperObj);
        }
        else{
            System.out.println("Roll No is already taken!\n");
        }
    }

    @Override
    public void displayStudent() {
        if (StudentMap.isEmpty()) {
            System.out.println("\nDatabase is empty !! Please enter the data first.\n");
        }
        else{
            System.out.println("\nStudent Details:");
            for (Entry<Integer, Student> m : StudentMap.entrySet()) {
                System.out.println("Roll No: "+m.getKey());
                System.out.println("Student's name: "+m.getValue().name);
                System.out.println("College: "+m.getValue().college);
                System.out.println("Place: "+m.getValue().place);
                System.out.println("Branch: " + m.getValue().branch + "\n");
            }
        }
    }

    @Override
    public void searchStudent() {
        System.out.print("\nEnter the student's roll no: ");
        int rollNo = sc.nextInt();
        if (StudentMap.isEmpty()) {
            System.out.println("Database is empty. Please enter some data first.");
        }
        if (StudentMap.containsKey(rollNo)) {
            System.out.println("\nStudent's name: "+ StudentMap.get(rollNo).name);
            System.out.println("College: "+ StudentMap.get(rollNo).college);
            System.out.println("Place: "+ StudentMap.get(rollNo).place);
            System.out.println("Branch: "+ StudentMap.get(rollNo).branch + "\n");
        } else {
            System.out.println("Roll number dosent exist in our database.");
        }
    }

    @Override
    public void deleteStudent() {
        System.out.print("Enter the roll no: ");
        int rollNo = sc.nextInt();
        if (StudentMap.remove(rollNo)!=null) {
            System.out.printf("RollNo %d data has been deleted.\n",rollNo);
        } else {
            System.out.println("Roll number dosent exist in our database.");
        }
    }

    public static void main(String[] args) {
        helperClass helperObj = new helperClass();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Options:");
            System.out.println("\t 1: Add Student\n\t 2: Display Student Data\n\t 3: Search\n\t 4: Delete\n\t 5: Exit");
            System.out.print("Choice: ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    helperObj.addStudent();
                    break;
                case 2:
                    helperObj.displayStudent();
                    break;
                case 3:
                    helperObj.searchStudent();
                    break;
                case 4:
                    helperObj.deleteStudent();
                    break;
                case 5:
                    System.exit(0);
                    sc.close();
                    break;
                default:
                    System.out.println("Invalid Command!\nChoose something from the list of options");
                    break;
            }
        }
    }
}
