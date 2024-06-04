import java.sql.*;
public class JDBC {
public static void main(String[] args) throws Exception {
String url="jdbc:mysql://localhost:3306/nikil";
String usrname="root";
String pwd="nikhilrmk180705";
Connection con;
try {
    Class.forName("com.mysql.cj.jdbc.Driver");
con = DriverManager.getConnection(url,usrname,pwd);
Statement stmt = con.createStatement();
int count = stmt.executeUpdate("delete from student");
System.out.println("Number of records deleted: "+count);
ResultSet rs = stmt.executeQuery("select * from student");
while (rs.next()) {
System.out.println("rollno: " + rs.getInt(1));
System.out.println("Name " + rs.getString(2));
//System.out.println("Age " + rs.getInt(3));
}
} catch (Exception e) {
System.out.println(e);
}
}}