import java.sql.DriverManager
import java.sql.SQLException
import java.sql.Connection
import java.sql.ResultSet
import java.sql.Statement

class Day19 {
    var conn:Connection? = null
    fun createConnection(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver").newInstance()
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/banksystem", "root", "leelavati")

            if (conn!=null){
                println("Connected to the dB")
            }
        }
        catch (e:SQLException){
            println(e)
        }
    }
    fun connectionCLose(){
        if (conn!=null){
//            conn.close()
        }
    }
    fun executeQueryOfDataBase(){
        var stm:Statement? = null
        var res:ResultSet? = null
        print("Enter ID: ")
        var id = readLine()!!.toInt()
        var sql = "SELECT * FROM CUSTOMER WHERE CUSTOMERID > "+id+";"

        try {
            stm = conn!!.createStatement()
//            println(res)  //prints null
            res = stm!!.executeQuery(sql)
//            println(res)    //prints obj or smthng
            while (res!!.next()){
                print("${res.getInt("CustomerId")}\t")
                print("${res.getString("CustomerName")}\t")
                print("${res.getString("CustomerEmail")}\t")
                print("${res.getString("CustomerPassword")}\t")
                print("${res.getString("CustomerPhno")}\t")
                println("${res.getString("CustomerCardNo")}\t")
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
    val Obj = Day19()
    Obj.createConnection()
    Obj.executeQueryOfDataBase()
}