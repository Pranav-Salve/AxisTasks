public class Student extends Branch{
    String studentName, studentPlace;
    int studentId;
    public Student(String studentName, String studentPlace, int studentId, String branchName, int branchTotalStaff, int branchId, String collegeName, String collegePlace, int collegeId) {
        super(branchName, branchTotalStaff, branchId, collegeName, collegePlace, collegeId);
        this.studentName = studentName;
        this.studentPlace = studentPlace;
        this.studentId = studentId;
    }
    void showStudentDetails(){
        System.out.println("Student details:\n");
		System.out.println("Student Name: "+studentName);
		System.out.println("Student Place: "+studentPlace);
		System.out.println("Student ID: "+studentId);

        System.out.println("College Name: "+super.collegeName);
	}
	void showCollegeDetails(){
        System.out.println("\nCollege Details:\n");
        System.out.println("College Name: "+collegeName);
		System.out.println("College Place: "+collegePlace);
		System.out.println("College ID: "+collegeId);
	}
	void showBranchDetails(){
        System.out.println("\nBranch Details:\n");
        System.out.println("Branch Name: "+branchName);
		System.out.println("Branch Total Staff: "+branchTotalStaff);
		System.out.println("Branch ID: "+branchId);
	}

    public static void main(String[] args) {
        Student studentObj = new Student("P$", "Mumbai", 100, "Mumbai", 150, 120, "KGCE", "Mumbai", 204);
        studentObj.showStudentDetails();
        studentObj.showCollegeDetails();
        studentObj.showBranchDetails();
    }
}
