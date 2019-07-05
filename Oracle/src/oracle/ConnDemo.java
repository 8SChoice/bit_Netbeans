/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oracle;

import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author BIT-USER
 */
public class ConnDemo {
    public static void main(String[] args) throws SQLException{
        try (Connection con = (Connection) ConnDriver.getMyConnection();){
            System.out.println(con);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        //System.out.println(ConnectionDriver.getMyConnection());
        //ConnectionDriver.getMyConnection();
    }
}
