/* Day18 Task1 */
class College{
    var collageName="KGC"
    var collagePlace="Mumbai"

    fun displayCollege(){
        println("College Name: $collageName")
        println("College Place: $collagePlace")
    }

    inner class branch{
        var branchName="IT"
        var branchPlace="1st floor"
        fun displayBranch(){
            println("Branch Name: $branchName")
            println("Branch Place: $branchPlace")
        }
    }
    inner class student{
        var studentName="P$"
        var studentPlace="Mumbai"
        fun displayStudent(){
            println("Student Name: $studentName")
            println("Student Place: $studentPlace")
        }
    }
}

fun main() {
    val clgObj = College()
    clgObj.displayCollege()
    clgObj.branch().displayBranch()
    clgObj.student().displayStudent()
}
