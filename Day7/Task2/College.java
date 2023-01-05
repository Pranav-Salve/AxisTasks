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

class College{
    String collegeName;
    String collegePlace;
	int collegeId;

	public College(String collegeName, String collegePlace, int collegeId) {
		this.collegeName = collegeName;
		this.collegePlace = collegePlace;
		this.collegeId = collegeId;
	}
}