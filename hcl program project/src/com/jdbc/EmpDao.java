package com.jdbc;


import java.util.List;
import java.util.Optional;


public interface EmpDao {
boolean insert(Employee e);
boolean delete(int eno);
List<Employee> getAll();
Optional<Employee> get(int eno);
boolean update(int eno,Employee e);

}
