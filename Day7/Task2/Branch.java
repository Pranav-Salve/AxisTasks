/* 
create 3 classes
College
	collegeName, collegeId, collegePlace
Branch
	branchName, branchId, branchTotalStaff
Student
	studentName, studentPlace, studentId

	showStudentDetails{
		print:	student details, clgName, branchName
	}
	showCollegeDetails{
        //collegedetail
	}
	showBranchDetails{
        //branchdetail
	}
*/

public class Branch extends College{
	String branchName;
	int branchId, branchTotalStaff;

	public Branch(String branchName, int branchTotalStaff, int branchId, String collegeName, String collegePlace, int collegeId) {
		super(collegeName, collegePlace, collegeId);
		this.branchName = branchName;
		this.branchTotalStaff = branchTotalStaff;
		this.branchId = branchId;
	}
}
