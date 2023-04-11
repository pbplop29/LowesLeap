import java.sql.*;

public class Assignment2 {
    public static void main(String[] args) throws Exception {
        String url = "jdbc:mysql://localhost:3306/customer";
        String user = "root";
        String password = "rootpass123";

        try {
            Connection conn = DriverManager.getConnection(url, user, password);

            // INSERT operation
            String insertQuery = "INSERT INTO customer (cid, cName, loc, age) VALUES (?, ?, ?, ?)";
            PreparedStatement insertStmt = conn.prepareStatement(insertQuery);
            insertStmt.setInt(1, 2);
            insertStmt.setString(2, "Harinarayan");
            insertStmt.setString(3, "India");
            insertStmt.setInt(4, 12);
            int rowsInserted = insertStmt.executeUpdate();
            System.out.println(rowsInserted + " row(s) inserted.");

            // SELECT operation
            String selectQuery = "SELECT * FROM customer";
            Statement selectStmt = conn.createStatement();
            ResultSet resultSet = selectStmt.executeQuery(selectQuery);
            while (resultSet.next()) {
                int cid = resultSet.getInt("cid");
                String cName = resultSet.getString("cName");
                String loc = resultSet.getString("loc");
                int age = resultSet.getInt("age");
                System.out.println(cid + "\t" + cName + "\t" + loc + "\t" + age);
            }

            // UPDATE operation
            String updateQuery = "UPDATE customer SET age = ? WHERE cName = ?";
            PreparedStatement updateStmt = conn.prepareStatement(updateQuery);
            updateStmt.setInt(1, 18);
            updateStmt.setString(2, "Madhav");
            int rowsUpdated = updateStmt.executeUpdate();
            System.out.println(rowsUpdated + " row(s) updated.");

            // DELETE operation
            String deleteQuery = "DELETE FROM customer WHERE cid = ?";
            PreparedStatement deleteStmt = conn.prepareStatement(deleteQuery);
            deleteStmt.setInt(1, 1);
            int rowsDeleted = deleteStmt.executeUpdate();
            System.out.println(rowsDeleted + " row(s) deleted.");

            insertStmt.close();
            selectStmt.close();
            updateStmt.close();
            deleteStmt.close();
            conn.close();

        } catch (SQLException e) {
            System.out.println("Error performing database operation: " + e.getMessage());
        }
    }
}
