package com.company.adnreyalex.projects.webshop.dao;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

@Component
public class DBConnection {

    @Value("${userDB}")
    private String user;

    @Value("${pwdDB}")
    private String password;

    @Value("${urlDB}")
    private String url;

    public DBConnection() throws ClassNotFoundException {
        System.out.println("Bean DBConnection created");

        Class.forName("org.hsqldb.jdbcDriver");

    }

    @PostConstruct
    public void initDB() {

        Connection conn = null;
        Statement st = null;

        try {
            conn = this.getConnection();
            System.out.println("DBConnection.initDB:"+conn);
            st = conn.createStatement();
            st.addBatch(getOneStatementFromFile("scripts/ddl/create_product.sql"));
            st.executeBatch();
            conn.commit();
            st.close();

            st = conn.createStatement();
            for (String s : getAllStatementsFromFile("scripts/dml/product.sql")) {

                System.out.println(s);
                st.addBatch(s);
            }
            st.executeBatch();
            conn.commit();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("Finally for initDB");

            try {
                if (st != null)
                    st.close();
                if (conn != null)
                    conn.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }

    public synchronized Connection getConnection() throws SQLException {
        Connection conn = null;
        try {
            Properties props = new Properties();
            props.put("user", user);
            props.put("password", password);
            conn = DriverManager.getConnection(url, props);

        } catch (SQLException e) {
            throw e;
        }
        System.out.println(conn);
        return conn;
    }

    private String getOneStatementFromFile(String filename) throws IOException {
        StringBuilder sb = new StringBuilder();
        BufferedReader reader = new BufferedReader(new InputStreamReader(getClass().getClassLoader().getResourceAsStream(filename)));
        String s = null;
        try {
            while ((s = reader.readLine()) != null) {
                sb.append(s).append("\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(sb.toString());
        return sb.toString();
    }

    private List<String> getAllStatementsFromFile(String filename) throws IOException {
        List<String> result = new ArrayList<String>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(getClass().getClassLoader().getResourceAsStream(filename)));
        String s = null;
        while ((s = reader.readLine()) != null && !"".equals(s)) {
            result.add(s);
        }

        //System.out.println(result);
        return result;
    }

}
