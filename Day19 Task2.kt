import java.sql.DriverManager
import java.sql.SQLException
import java.sql.Connection
import java.sql.PreparedStatement
import java.sql.ResultSet
import java.sql.Statement

class Task2 {
        var conn: Connection? = null
        fun createConnection(){
            try {
                Class.forName("com.mysql.cj.jdbc.Driver").newInstance()
                conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/banksystem", "root", "leelavati")

                if (conn!=null){
                    println("Connected to the dB")
                }
            }
            catch (e: SQLException){
                println(e)
            }
        }
        fun connectionCLose(){
            if (conn!=null){
//            conn.close()
            }
        }
        fun createTable(){
            var preStat: PreparedStatement? = null
            var sql = "CREATE TABLE Demo(ID INT NOT NULL AUTO_INCREMENT, Name VARCHAR(255), Age INT NOT NULL, PRIMARY KEY(ID));"
            try {
                preStat = conn!!.prepareStatement(sql)
                var status = preStat.executeUpdate()
                if (status==0){
                    println("Table is created!")
                }
                else{
                    println("Table is not created!")
                }
            }catch (e: SQLException){
                println(e)
            }
        }

        fun insertIntoTable(){
            //prep statement better cause flexibility of inputs
            var preStat: PreparedStatement? = null
            var sql = "INSERT INTO Demo(Name, Age) values(?,?);"
            try {
                preStat = conn!!.prepareStatement(sql)
                print("Enter Name: ")
                preStat.setString(1, readln())
                print("Enter Age: ")
                preStat.setInt(2, readln()!!.toInt())

                var status = preStat.executeUpdate()
                println(status)
                if (status==1){
                    println("Data inserted!")
                }else{
                    println("Insertion failed!")
                }
            }catch (e: SQLException){
                println(e)
            }
        }

    fun searchTable(){
        var stm:Statement? = null
        var res:ResultSet? = null
        print("Enter ID: ")
        var searchId = readln().toInt()
        var sql = "SELECT * FROM Demo WHERE Id = $searchId;"

        try {
            stm = conn!!.createStatement()
//            println(res)  //prints null
            res = stm!!.executeQuery(sql)
//            println(res)    //prints obj or smthng
            while (res!!.next()){
                print("${res.getInt("ID")}\t")
                print("${res.getString("Name")}\t")
                println("${res.getInt("Age")}\t\n")
            }
        }catch (e:SQLException){
            println(e)
        }finally {
            if (res!=null){
                try {
                    //always close the result set in final
                    res.close()
                    conn!!.close()
                }catch (e:SQLException){
                    println(e)
                }
            }
        }
    }
}

fun main() {
    val jdbcObj = Task2()
    while (true) {
        println("\t1. Create Table \n\t2. Insert Data \n\t3. Search Data \n\t4. Exit \n")
        print("Choice: ")
        val choice = readln().toInt()
        jdbcObj.createConnection()

        when(choice) {
            1 -> jdbcObj.createTable()
            2 -> jdbcObj.insertIntoTable()
            3 -> jdbcObj.searchTable()
            4 -> break

            else -> println("Invalid Choice!")
        }
    }
}

/*
Day19 Task2
crud operation on create table, insert data, search data in table based on condition using JDBC
    using when give options to user to:
        1. create,
        2. insert
        3. search
        4. exit
* */