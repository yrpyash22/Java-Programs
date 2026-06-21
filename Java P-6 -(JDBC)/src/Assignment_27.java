import java.sql.*;
import java.util.Scanner;


public class Assignment_27 {

    
    private static final String url = "jdbc:mysql://localhost:3306/mydb";
    private static final String username = "YOUR_USERNAME";
    private static final String password = "YOUR_PASSWORD";

    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        }catch (ClassNotFoundException e)
        {
            System.out.println(e.getMessage());
        }


        // Basic uses

        try
        {

            Connection connection = DriverManager.getConnection(url, username ,password);



            //  Statement statement

            // Statement statement = connection.createStatement();
            /*
            // Data retreave (gain)
            String quary = "select * from students";
            ResultSet resultSet = statement.executeQuery(quary);
            while (resultSet.next())
            {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                int age = resultSet.getInt("age");
                double marks = resultSet.getDouble("marks");
                System.out.println("ID : " + id);
                System.out.println("NAME : "+ name);
                System.out.println("AGE : " +age );
                System.out.println("MARKS : "+marks);
                }



            // Data insert
            String iQuary = String.format("INSERT INTO students(id, name, age, marks) VALUES(%o, '%s', %o, %f)", 2, "Rahul", 23, 74.5);
            int rowsAffected = statement.executeUpdate(iQuary);
            if(rowsAffected > 0)
            {
                System.out.println("Data Inserted Successfully!");
            }else {
                System.out.println("Data not Inserted");
            }


            // Data update
            String upquary = String.format("UPDATE students SET marks = %f WHERE id = %d", 89.9, 2);
            int rowsAffected = statement.executeUpdate(upquary);
            if(rowsAffected > 0)
            {
                System.out.println("Data update Successfully!");
            }
            else {
                System.out.println("Data is not updated!");
            }


            // Data Delete
            String delquary = "DELETE FROM students  WHERE ID = 2";
            int rowsAffected = statement.executeUpdate(delquary);
            if(rowsAffected > 0)
            {
                System.out.println("Deleted Successfully!");
            }
            else {
                System.out.println("Not Deleted!");
            }
            */




            // Prepate statement

            // Data insert
//            String quary1 = "INSERT INTO students(name, age, marks) VALUES(?, ?, ?)";
//            PreparedStatement preparedStatement = connection.prepareStatement(quary1);
//            preparedStatement.setString(1, "Bro");
//            preparedStatement.setInt(2, 25);
//            preparedStatement.setDouble(3 , 45.2);
//
//            int rowsAffected = preparedStatement.executeUpdate();
//            if(rowsAffected > 0)
//            {
//                System.out.println("Data Inserted Successfully!");
//            }else {
//                System.out.println("Data not Inserted");
//            }



            // Data retreave (gain) // Print
//            String selquary1 = "SELECT marks FROM students WHERE id = ?";
//            PreparedStatement selpS = connection.prepareStatement(selquary1);
//            selpS.setInt(1, 1);
//            ResultSet resultSet = selpS.executeQuery();
//            if(resultSet.next())
//            {
//                double marks = resultSet.getDouble("marks");
//                System.out.println("Marks:"+ marks);
//            }else
//            {
//                System.out.println("marks not found!");
//            }


            // Data Update
//            String upquary1 = "UPDATE students SET marks = ? WHERE id = ?";
//            PreparedStatement uppS = connection.prepareStatement(upquary1);
//            uppS.setDouble(1, 87.5);
//            uppS.setInt(2 , 3);
//            int rowsAffected = uppS.executeUpdate();
//            if(rowsAffected > 0)
//            {
//                System.out.println("Data UPDATE Successfully!");
//            }else {
//                System.out.println("Data not UPDATE");
//            }


            // Data delete










//   Example of    Batch Processing in both statements





            //  CRUD operation usimg statement.
            Statement s = connection.createStatement();
            Scanner sc = new Scanner(System.in);
            while (true)
            {
                System.out.print("Enter name : ");
                String name = sc.next();
                System.out.print("Enter age : ");
                int age = sc.nextInt();
                System.out.print("Enter marks : ");
                double marks = sc.nextDouble();
                System.out.println("Enter more data(Y/N): ");
                String choice = sc.next();

                String query = String.format("INSERT INTO students(name, age, marks) VALUES('%s', %d, %f)", name, age, marks);
                s.addBatch(query);
                if(choice.toUpperCase().equals("N"))
                {
                    break;
                }
            }
            int arr[] = s.executeBatch();
            for (int i = 0; i < arr.length; i++)
            {
                if(arr[i] ==0)
                {
                    System.out.println("Query: "+ i + "not executed Successfully!");
                }
            }







            // Prepared Statemens
            String quary1 = "INSERT INTO students(name, age, marks) VALUES(?, ?, ?)";
            PreparedStatement ps = connection.prepareStatement(quary1);
            while (true)
            {
                System.out.print("Enter name : ");
                String name = sc.next();
                System.out.print("Enter age : ");
                int age = sc.nextInt();
                System.out.print("Enter marks : ");
                double marks = sc.nextDouble();
                System.out.println("Enter more data(Y/N): ");
                String choice = sc.next();

                ps.setString(1, name);
                ps.setInt(2, age);
                ps.setDouble(3, marks);
                ps.addBatch();
                if(choice.toUpperCase().equals("N"))
                {
                    break;
                }
            }
            int arr2[] = ps.executeBatch();

        }catch (SQLException e)
        {
            System.out.println(e.getMessage());
        }



    }

}


