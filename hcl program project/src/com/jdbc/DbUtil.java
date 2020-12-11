package com.jdbc;


import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;


public class DbUtil {

public static final Connection getConnection(String driver,String url,String uname,String pwd) {
Connection con=null;
try {
Class.forName(driver);
con=DriverManager.getConnection(url,uname,pwd);
} catch (Exception e) {
e.printStackTrace();
}
return con;
}
public static Credentials getCredentials()
{
Properties properties=null;
Credentials credentials=null;
try {
properties=new Properties();
properties.load(new FileInputStream("database.properties"));
credentials=new Credentials();
credentials.setDriver(properties.getProperty("driver"));
credentials.setUrl(properties.getProperty("url"));
credentials.setUname(properties.getProperty("uname"));
credentials.setPwd(properties.getProperty("pwd"));
} catch (Exception e) {
e.printStackTrace();
}
return credentials;


}
}