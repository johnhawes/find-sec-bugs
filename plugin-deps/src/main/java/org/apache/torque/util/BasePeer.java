package org.apache.torque.util;

import org.apache.turbine.util.db.pool.DBConnection;

import java.util.Vector;

public class BasePeer {
    public static Vector executeQuery(String queryString) {
        return null;
    }
    public static Vector executeQuery(String queryString, boolean singleRecord, DBConnection dbCon) {
        return null;
    }
    public static Vector executeQuery(String queryString, int start, int numberOfResults, boolean singleRecord, DBConnection dbCon) {
        return null;
    }
    public static Vector executeQuery(String queryString, int start, int numberOfResults, String dbName, boolean singleRecord) {
        return null;
    }
    public static Vector executeQuery(String queryString, String dbName) {
        return null;
    }
    public static Vector executeQuery(String queryString, String dbName, boolean singleRecord) {
        return null;
    }

    public static int executeStatement(String stmt) {
        return 0;
    }
    public static int executeStatement(String stmt, DBConnection dbCon) {
        return 0;
    }
    public static int executeStatement(String stmt, String dbName) {
        return 0;
    }
}
