package com.jdbc;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;
import java.util.Optional;

public class EmpDaoImplimplementsEmpDao {

@Override
public boolean insert(Employee E) {
	
Connection con=null;
PreparedStatement pst=null;
boolean b=false;
Credentials credentials=DbUtil.getCredentials();
try {
con=DbUtil.getConnection(credentials.getDriver(), credentials.getUrl(), credentials.getUname(), credentials.getPwd());
if(con!=null)
{
pst=con.prepareStatement("insert into Employee values(?,?,?,?,?,?,?)");
pst.setInt(1, E.getEno());
pst.setString(2, E.getName());
pst.setString(3, E.getAddress());
pst.setInt(4, E.getSal());
pst.setInt(5, E.getExp());
pst.setString(6, E.getDesignation());
pst.setDate(7,  (Date) E.getDoj());
int i=pst.executeUpdate();
if(i>0)
b=true;
con.close();
}
} catch (Exception e2) {
e2.printStackTrace();
}
return b;
}

@Override
public boolean delete(int Eno) {

return false;
}

@Override
public List<Employee> getAll() {

return null;
}

@Override
public Optional<Employee> get(int Eno) {
Connection con=null;
PreparedStatement pst=null;
ResultSet rs=null;
Optional<Employee> empOptional=null;
Employee e=null;
Credentials credentials=DbUtil.getCredentials();
try {
con=DbUtil.getConnection(credentials.getDriver(), credentials.getUrl(), credentials.getUname(), credentials.getPwd());
if(con!=null)
{
pst=con.prepareStatement("select * from Employee where Eno=?");
pst.setInt(1, Eno);
rs=pst.executeQuery();
rs.next();
e=new Employee(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4), rs.getString(5), rs.getInt(6), rs.getDate(7));
empOptional=Optional.ofNullable(e);
}
}catch(Exception e1)
{
e1.printStackTrace();
}
return empOptional;
}

@Override
public boolean update(int Eno, Employee E) {

return false;
}


}
