/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oracle;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author BIT-USER
 */
public class ConnDriver {
    //ststic 초기화 : main 메서드보다 선행되어서 실행
    static{
        try {
            System.out.println("메인보다 먼저 실행이 됩니다.");
            //Driver의 class를 로딩!
            Class.forName("oracle.jdbc.driver.OracleDriver");
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
            //Logger.getLogger(ConnDriver.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public static Connection getMyConnection() throws SQLException{
        String user = "javabook";
        String pwd = "test00";
        String url = "jdbc:oracle:thin:@localhost:1521:xe";
        return DriverManager.getConnection(url, user, pwd);
    }
}
