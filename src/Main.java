import java.sql.*;
import java.lang.*;
import java.util.Scanner;


public class Main {


    public static void main(String[] args) {
        try {
//          insertCump();
//          updateCump();
//            deleteCump();
//            insertProdus();
//            updateProdus();
//            deleteProdus();
//            insertInCos();
//            readcos();
//cosCuCeleMaiMulteProd();
//            listaUserNrProdDesc ();
            cosCuProdCititTast();


        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static void insertCump() throws ClassNotFoundException, SQLException {
        // 1. load driver, no longer needed in new versions of JDBC
        Class.forName("org.postgresql.Driver");

        // 2. define connection params to db
        final String URL = "jdbc:postgresql://54.93.65.5:5432/6olimpia";
        final String USERNAME = "fasttrackit_dev";
        final String PASSWORD = "fasttrackit_dev";

        // 3. obtain a connection
        Connection conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);

        // 4. create a query statement

        PreparedStatement pSt = conn.prepareStatement("INSERT INTO cumparatori (nume, parola) VALUES (?,?)");


        pSt.setString(1, "Amalia");
        pSt.setString(2, "jsgjfg5");

        // 5. execute a prepared statement
        int rowsInserted = pSt.executeUpdate();

        // 6. close the objects
        pSt.close();
        conn.close();
    }

    private static void updateCump() throws ClassNotFoundException, SQLException {
        // 1. load driver, no longer needed in new versions of JDBC
        Class.forName("org.postgresql.Driver");

        // 2. define connection params to db
        final String URL = "jdbc:postgresql://54.93.65.5:5432/6olimpia";
        final String USERNAME = "fasttrackit_dev";
        final String PASSWORD = "fasttrackit_dev";

        // 3. obtain a connection
        Connection conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);

        // 4. create a query statement

        PreparedStatement pSt = conn.prepareStatement("UPDATE cumparatori set parola=? WHERE nume =?");


        pSt.setString(1, "asde");
        pSt.setString(2, "Tudor");

        // 5. execute a prepared statement
        int rowsInserted = pSt.executeUpdate();

        // 6. close the objects
        pSt.close();
        conn.close();
    }

    private static void deleteCump() throws ClassNotFoundException, SQLException {
        // 1. load driver, no longer needed in new versions of JDBC
        Class.forName("org.postgresql.Driver");

        // 2. define connection params to db
        final String URL = "jdbc:postgresql://54.93.65.5:5432/6olimpia";
        final String USERNAME = "fasttrackit_dev";
        final String PASSWORD = "fasttrackit_dev";

        // 3. obtain a connection
        Connection conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);

        // 4. create a query statement

        PreparedStatement pSt = conn.prepareStatement("DELETE FROM cumparatori WHERE nume =?");

        pSt.setString(1, "Dani");


        // 5. execute a prepared statement
        int rowsInserted = pSt.executeUpdate();

        // 6. close the objects
        pSt.close();
        conn.close();
    }

    private static void insertProdus() throws ClassNotFoundException, SQLException {
        // 1. load driver, no longer needed in new versions of JDBC
        Class.forName("org.postgresql.Driver");

        // 2. define connection params to db
        final String URL = "jdbc:postgresql://54.93.65.5:5432/6olimpia";
        final String USERNAME = "fasttrackit_dev";
        final String PASSWORD = "fasttrackit_dev";

        // 3. obtain a connection
        Connection conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);

        // 4. create a query statement

        PreparedStatement pSt = conn.prepareStatement("INSERT INTO produse (nume_produs , pret) VALUES (?,?)");


        pSt.setString(1, "smantana ");
        pSt.setDouble(2, 8.50);

        // 5. execute a prepared statement
        int rowsInserted = pSt.executeUpdate();

        // 6. close the objects
        pSt.close();
        conn.close();
    }

    private static void updateProdus() throws ClassNotFoundException, SQLException {
        // 1. load driver, no longer needed in new versions of JDBC
        Class.forName("org.postgresql.Driver");

        // 2. define connection params to db
        final String URL = "jdbc:postgresql://54.93.65.5:5432/6olimpia";
        final String USERNAME = "fasttrackit_dev";
        final String PASSWORD = "fasttrackit_dev";

        // 3. obtain a connection
        Connection conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);

        // 4. create a query statement

        PreparedStatement pSt = conn.prepareStatement("UPDATE produse set pret=? WHERE nume_produs =?");


        pSt.setDouble(1, 6);
        pSt.setString(2, "lapte");

        // 5. execute a prepared statement
        int rowsInserted = pSt.executeUpdate();

        // 6. close the objects
        pSt.close();
        conn.close();
    }

    private static void deleteProdus() throws ClassNotFoundException, SQLException {
        // 1. load driver, no longer needed in new versions of JDBC
        Class.forName("org.postgresql.Driver");

        // 2. define connection params to db
        final String URL = "jdbc:postgresql://54.93.65.5:5432/6olimpia";
        final String USERNAME = "fasttrackit_dev";
        final String PASSWORD = "fasttrackit_dev";

        // 3. obtain a connection
        Connection conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);

        // 4. create a query statement

        PreparedStatement pSt = conn.prepareStatement("DELETE FROM produse WHERE nume_produs =?");

        pSt.setString(1, "caramele");


        // 5. execute a prepared statement
        int rowsInserted = pSt.executeUpdate();

        // 6. close the objects
        pSt.close();
        conn.close();
    }


    private static void insertInCos() throws ClassNotFoundException, SQLException {
        // 1. load driver, no longer needed in new versions of JDBC
        Class.forName("org.postgresql.Driver");

        // 2. define connection params to db
        final String URL = "jdbc:postgresql://54.93.65.5:5432/6olimpia";
        final String USERNAME = "fasttrackit_dev";
        final String PASSWORD = "fasttrackit_dev";

        // 3. obtain a connection
        Connection conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);

        // 4. create a query statement

        PreparedStatement pSt = conn.prepareStatement("INSERT INTO cos (id_cump, id_produs) VALUES (?,?)");


        pSt.setInt(1, 11 );
        pSt.setInt(2,3 );

        // 5. execute a prepared statement
        int rowsInserted = pSt.executeUpdate();

        // 6. close the objects
        pSt.close();
        conn.close();
    }



    private static void readcos() throws ClassNotFoundException, SQLException {
        // 1. load driver, no longer needed in new versions of JDBC
        Class.forName("org.postgresql.Driver");

        // 2. define connection params to db
        final String URL = "jdbc:postgresql://54.93.65.5:5432/6olimpia";
        final String USERNAME = "fasttrackit_dev";
        final String PASSWORD = "fasttrackit_dev";

        // 3. obtain a connection
        Connection conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);

        // 4. create a query statement

        PreparedStatement pSt = conn.prepareStatement(" select id_produs FROM cos WHERE id_cump=?");


        pSt.setInt(1, 10);
ResultSet myRs = pSt.executeQuery();
while (myRs.next()){
    System.out.println(myRs.getString("id_produs"));
}

        // 6. close the objects
        pSt.close();
        conn.close();
    }


    private static void cosCuCeleMaiMulteProd() throws ClassNotFoundException, SQLException {
        // 1. load driver, no longer needed in new versions of JDBC
        Class.forName("org.postgresql.Driver");

        // 2. define connection params to db
        final String URL = "jdbc:postgresql://54.93.65.5:5432/6olimpia";
        final String USERNAME = "fasttrackit_dev";
        final String PASSWORD = "fasttrackit_dev";

        // 3. obtain a connection
        Connection conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);

        // 4. create a query statement

        PreparedStatement pSt = conn.prepareStatement("select nume, count(cos.id_produs) as number_of_items from cos join cumparatori on cumparatori.id_cump=cos.id_cump " +
                "group by nume order by count(id_produs) desc limit 1;");



        ResultSet myRs = pSt.executeQuery();
        while (myRs.next()){
            System.out.println(myRs.getString("nume"));
        }

        // 6. close the objects
        pSt.close();
        conn.close();
    }

    private static void listaUserNrProdDesc() throws ClassNotFoundException, SQLException {
        // 1. load driver, no longer needed in new versions of JDBC
        Class.forName("org.postgresql.Driver");

        // 2. define connection params to db
        final String URL = "jdbc:postgresql://54.93.65.5:5432/6olimpia";
        final String USERNAME = "fasttrackit_dev";
        final String PASSWORD = "fasttrackit_dev";

        // 3. obtain a connection
        Connection conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);

        // 4. create a query statement

        PreparedStatement pSt = conn.prepareStatement("select nume, count(cos.id_produs) as number_of_items from cos join cumparatori on cumparatori.id_cump=cos.id_cump " +
                "group by nume order by count(id_produs) desc;");



        ResultSet myRs = pSt.executeQuery();
        while (myRs.next()){
            System.out.println(myRs.getString("nume"));
        }

        // 6. close the objects
        pSt.close();
        conn.close();
    }


    private static void cosCuProdCititTast() throws ClassNotFoundException, SQLException {
        // 1. load driver, no longer needed in new versions of JDBC
        Class.forName("org.postgresql.Driver");

        // 2. define connection params to db
        final String URL = "jdbc:postgresql://54.93.65.5:5432/6olimpia";
        final String USERNAME = "fasttrackit_dev";
        final String PASSWORD = "fasttrackit_dev";

        // 3. obtain a connection
        Connection conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);

        // 4. create a query statement
    String x= SkeletonJava.readStringConsole("Introduceti produsul");
        PreparedStatement pSt = conn.prepareStatement("select cumparatori.nume FROM cumparatori JOIN cos ON cos.id_cump=cumparatori.id_cump\n" +
                "join produse on cos.id_produs=produse.id_produs WHERE produse.nume_produs=?");

        pSt.setString(1, x);


        ResultSet myRs = pSt.executeQuery();
        while (myRs.next()){
            System.out.println(myRs.getString("id_produs"));
        }

        // 6. close the objects
        pSt.close();
        conn.close();
    }



}


