import java.sql

JDBC - java database connectivity - API for connection and interaction with RDbs

- java database connectivity
- we need a driver to establish connection to database

Driver -

```
- JDBC ODBC Driver
- Native API Driver
- Network Protocal Driver
- Oracle thin Driver
```

Steps -

```
1. Load the driver
. Class.forName()
2. Create Connection
. DriverManager.getConnection
3. Generate Statement
Connection.createStatement
4. Execute Queries
Resultset.next
5. Close connection
```

Statement - interface used to execute sql statements

- prone to injections

```
Statement stmt = connection.createStatement();
ResultSet rs = stmt.executeQuery("SELECT * FROM users");
```

Prepared Statement - interface used to execute precompiled sql statements

- less prone to injections

```
PreparedStatement pstmt = connection.prepareStatement("SELECT * FROM users WHERE name = ?");
pstmt.setString(1, "John");
ResultSet rs = pstmt.executeQuery();

```

Callable Statement - interface used to execute stored procedures in dbs

```
CallableStatement cstmt = connection.prepareCall("{CALL my_stored_proc(?, ?)}");
cstmt.setString(1, "John");
cstmt.setInt(2, 25);
ResultSet rs = cstmt.executeQuery();

```

ResultSet - interface used to access result of database queries

```
ResultSet rs = stmt.executeQuery("SELECT * FROM users");
while (rs.next()) {
    int id = rs.getInt("id");
    String name = rs.getString("name");
    int age = rs.getInt("age");
    System.out.println("User: " + name + " (id=" + id + ", age=" + age + ")");
}

```

Connection - interface used to establish connection to database

```
Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/mydatabase", "myuser", "mypassword");
PreparedStatement pstmt = conn.prepareStatement("SELECT * FROM users WHERE name = ?");

```

Driver Manager - getting connections to database and register and unregister drivers

```
Class.forName("com.mysql.jdbc.Driver");
Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/mydatabase", "myuser", "mypassword");

```
