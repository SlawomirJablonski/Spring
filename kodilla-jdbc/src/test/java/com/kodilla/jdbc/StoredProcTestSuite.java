package com.kodilla.jdbc;

import org.junit.Test;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import static java.lang.Boolean.FALSE;
import static org.junit.Assert.assertEquals;

public class StoredProcTestSuite {
    @Test
    public void testUpdateVipLevels() throws SQLException{
        //Given
        DbManager dbManager = DbManager.getInstance();
        String sqlUpdate = "UPDATE READERS SET VIP_LEVEL=\"Not set\"";
        Statement statement = dbManager.getConnection().createStatement();
        statement.executeUpdate(sqlUpdate);

        //When
        String sqlProcedureCall = "CALL UpdateVipLevels()";
        statement.execute(sqlProcedureCall);
        //Then
        String sqlCheckTable = "SELECT COUNT(*) AS HOW_MANY FROM READERS WHERE VIP_LEVEL=\"Not set\"";
        ResultSet rs = statement.executeQuery(sqlCheckTable);
        int howMany = -1;
        if (rs.next()){
            howMany = rs.getInt("HOW_MANY");
        }
        assertEquals(0,howMany);
    }

    @Test
    public void testUpdateBestsellers() throws SQLException{
        //Given
        DbManager dbManager = DbManager.getInstance();
        String sqlUpdate = "UPDATE BOOKS SET BESTSELLER=null";
        Statement statement = dbManager.getConnection().createStatement();
        statement.executeUpdate(sqlUpdate);

        //When
        String sqlProcedureCall = "CALL UpdateBestsellers()";
        statement.execute(sqlProcedureCall);

        //Then
        String sqlCheckTable = "SELECT COUNT(*) AS HOW_MANY_BTS FROM BOOKS WHERE BESTSELLER=TRUE";
        ResultSet rs = statement.executeQuery(sqlCheckTable);
        int howManyBestsellers = -1;
        if (rs.next()){
            howManyBestsellers = rs.getInt("HOW_MANY_BTS");
        }

        String sqlCheckTableRow = "SELECT BESTSELLER FROM BOOKS WHERE BOOK_ID = 3";
        ResultSet rsRow = statement.executeQuery(sqlCheckTableRow);
        boolean bestseller = true;
        if (rsRow.next()){
            bestseller = rsRow.getBoolean("BESTSELLER");
        }

        assertEquals(4,howManyBestsellers);
        assertEquals(FALSE,bestseller);
    }
}
